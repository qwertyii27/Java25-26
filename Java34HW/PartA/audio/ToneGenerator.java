package audio;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class ToneGenerator {
  /*
   * Note is an enumeration that represents musical notes in
   * the 12 tone chromatic scale (A4 = 440 Hz).
   * This enumeration begins with a "rest" tone.
   * No sound is played for a rest.
   */
  public enum Note {

    REST,
    A3, A3$, B3, C4, C4$, D4, D4$, E4, F4, F4$, G4, G4$,
    A4, A4$, B4, C5, C5$, D5, D5$, E5, F5, F5$, G5, G5$,
    A5, A5$, B5, C6, C6$, D6, D6$, E6, F6, F6$, G6, G6$,
    A6, A6$, B6, C7, C7$, D7, D7$, E7, F7, F7$, G7, G7$,
    A7, A7$, B7, C8, C8$, D8, D8$, E8, F8, F8$, G8, G8$;

    // SAMPLE_RATE is the number of data points that is needed for
    // an audio sample that was generated at a 16kHz sample rate.
    public static final int SAMPLE_RATE = 16 * 1024; // ~16KHz

    // Store 2 seconds worth of audio data in our byte array.
    public static final int SECONDS = 2;

    // sin is an array of bytes that holds 2 seconds worth of
    // audio data (for the specified sample rate).
    private byte[] sin = new byte[SECONDS * SAMPLE_RATE];

    Note() {
      // Notice that when n = 0, which is the rest note,
      // there is no audio data since no audio is played
      // during a rest.
      int n = this.ordinal();

      // if n > 0, then fill the byte array with
      // the data points that correspond to 2 seconds
      // worth of audio dats for this note's frequency
      // (starting at A3, which is 220 Hz)
      if (n > 0) {
        double exp = ((double) n - 1) / 12d;
        double f = 220d * Math.pow(2d, exp);
        for (int i = 0; i < sin.length; i++) {
          double period = (double) SAMPLE_RATE / f;
          double angle = 2.0 * Math.PI * i / period;
          sin[i] = (byte) (Math.sin(angle) * 127f);
        }
      }
    }

    public byte[] data() {
      return sin;
    }
  }

  AudioFormat af;
  SourceDataLine line;

  /*
   * Constructor for our ToneGenerator class.
   * create an AudioFormat object based on our sample rate.
   */
  public ToneGenerator() {
    af = new AudioFormat(Note.SAMPLE_RATE, 8, 1, true, true);
  }

  /*
   * Try to get a data line to the audio system that we can use to play our audio
   * data.
   */
  public void init() throws LineUnavailableException {
    line = AudioSystem.getSourceDataLine(af);
    line.open(af, Note.SAMPLE_RATE);
    line.start();
  }

  /*
   * Close our data line.
   */
  public void close() {
    line.drain();
    line.close();
  }

  /*
   * Play an audio tone in the chromatic scale
   * for ms milliseconds. Note that the max
   * duration for playback is 2 seconds.
   */
  public void play(Note note, int ms) {
    // we can only play up to 2 seconds worth of data.
    ms = Math.min(ms, Note.SECONDS * 1000);

    // play the desired note for the desired time period
    // (up to 2 seconds maximum time period).
    int length = Note.SAMPLE_RATE * ms / 1000;
    int count = line.write(note.data(), 0, length);
  }
}
