package Music;

public class main {
    public static void main(String[] args) {
        MusicStyles[] styless = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles MusicStyles : styless) {
            MusicStyles.style();
            MusicStyles.start();
            MusicStyles.guitar();
            MusicStyles.piano();
            MusicStyles.play();
            MusicStyles.stop();
            MusicStyles.text();

        }
    }

}
