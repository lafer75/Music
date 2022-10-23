package Music;

public class ClassicMusic extends MusicStyles {
    @Override
    void style() {
        System.out.println("Classic Music");
    }

    void start() {
        System.out.println("1,2,3 tyn.... tyn tyn");
    }

    @Override
    void piano() {
        System.out.println("pum pip pum");
    }

    @Override
    void play() {
        System.out.println("tu tu tu tu");
    }

    @Override
    public void stop() {
        System.out.println("applause");
    }

    @Override
    public void text() {
        System.out.print("-------------------------------------\n");
    }
    @Override
    void guitar(){}
}
