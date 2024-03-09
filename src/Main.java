
public class Main {
//    TODO: Создайте интерфейс MediaPlayer, который будет определять методы для проигрывания и остановки медиа-файлов.
    public static void main(String[] args) {
        MediaPlayer audio = new AudioPlayer();
        MediaPlayer video = new VideoPlayer();

        audio.play();
        audio.stop();
        System.out.println();
        video.play();
        video.stop();

    }
}