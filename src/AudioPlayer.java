public class AudioPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Start audio playing");
    }

    @Override
    public void stop() {
        System.out.println("Stop audio playing");

    }
}
