import audio.*;

public class AudioClipDemo {
  public static void main(String[] args) {
    SoundClip soundclip = new SoundClip("media/boing.wav");
    soundclip.open();
    soundclip.play(true);
    soundclip.close();
  }
}
