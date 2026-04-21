import audio.ToneGenerator;
import audio.ToneGenerator.Note;

import javax.sound.sampled.LineUnavailableException;

public class Song {
  public static void main(String[] args) throws LineUnavailableException {
    ToneGenerator tGenerator = new ToneGenerator();
    tGenerator.init();

    // Never gonna give you up.
    tGenerator.play(Note.A4, 100);
    tGenerator.play(Note.B4, 200);

    tGenerator.play(Note.D5, 100);
    tGenerator.play(Note.B4, 200);

    tGenerator.play(Note.F5$, 300);
    tGenerator.play(Note.F5$, 300);

    tGenerator.play(Note.E5, 200);

    tGenerator.play(Note.REST, 300);

    // Never gonna let you down.
    tGenerator.play(Note.A4, 100);
    tGenerator.play(Note.B4, 200);

    tGenerator.play(Note.D5, 100);
    tGenerator.play(Note.B4, 200);

    tGenerator.play(Note.E5, 400);

    tGenerator.play(Note.E5, 200);

    tGenerator.play(Note.D5, 300);
    tGenerator.play(Note.C5$, 100);
    tGenerator.play(Note.B4, 200);

    tGenerator.close();
  }

}
