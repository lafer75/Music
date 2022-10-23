package Music;

public class RockMusic extends MusicStyles {
    @Override
    void style() {
        System.out.println("Rock Music");
    }

    @Override
    void start() {
        System.out.println("1,2,3 BRUM BRUM");
    }

    @Override
    void guitar() {
        System.out.println("RUM RUM");
    }

    @Override
    void play() {
        System.out.println("du hast\n" +
                "du hast mich");
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
    void piano(){}

}
