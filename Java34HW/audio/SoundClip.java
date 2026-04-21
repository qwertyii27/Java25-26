package audio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import java.io.File;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioSystem;
import java.io.IOException;

public class SoundClip {

  private String filePath;
  private File audioFile;
  private AudioInputStream audioIn;
  private Clip clip;

  public SoundClip(String path) {
    filePath = path;
    path = null;
  }

  public void open() {
    try {
      audioFile = new File(filePath);
      audioIn = AudioSystem.getAudioInputStream(audioFile.getAbsoluteFile());
      clip = AudioSystem.getClip();
      clip.open(audioIn);
    } catch (UnsupportedAudioFileException e) {
      System.err.println("Unable to initialize the Clip.  Unsupported audio file.");
      System.err.println(e.getMessage());
      clip = null;
      return;
    } catch (IOException e) {
      System.err.println("Unable to initialize the Clip.  IO Exception.");
      System.err.println(e.getMessage());
      return;
    } catch (LineUnavailableException e) {
      System.err.println("Unable to initialize the Clip.  Line unavailable.");
      System.err.println(e.getMessage());
      return;
    }

  }

  public void play() {
    if (clip != null) {
      // if the clip is running, stop it before playing it again.
      if (clip.isRunning()) {
        clip.stop();
        try {
          // sleep for a moment to give line time to stop playback.
          Thread.sleep(10);
        } catch (InterruptedException e) {
          System.err.println(e.getMessage());
        }
      }

      // start at the beginning of the clip
      clip.setFramePosition(0);
      clip.start();
    }

  }

  public void play(boolean wait) {
    // call non-blocking version of play (with no pause)
    play();
    // if they wish to wait, wait before the sound effect completes to finish.
    if (clip != null && wait) {
      long msec = clip.getMicrosecondLength() / 1000;
      try {
        Thread.sleep(msec);
      } catch (InterruptedException e) {
        System.err.println(e.getMessage());
      }
    }

  }

  public void close() {
    if (clip != null) {
      clip.stop();
      clip.close();
    }

  }

}
