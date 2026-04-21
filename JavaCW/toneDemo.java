import javax.sound.sampled.LineUnavailableException;

import audio.ToneGenerator;
import audio.ToneGenerator.Note;

public class toneDemo {
  public static void main(String[] args) throws LineUnavailableException {
    // create tg object.
    ToneGenerator tg = new ToneGenerator();
    // init tone
    tg.init();
    // plays note
    tg.play(Note.C4, 2000);
    // close tone
    tg.close();
  }
}
