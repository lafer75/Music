package Music;

public class PopMusic extends MusicStyles {
    @Override
    void style() {
        System.out.println("Pop Music");
    }

    @Override
    void start() {
        System.out.println("1,2,3 pum");
    }

    @Override
    void play() {
        System.out.println("tun tun tun");
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
    @Override
    void piano(){}

}
