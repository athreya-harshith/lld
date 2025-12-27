package pillars.abstraction.interfaces.example;

public class MusicSystem implements MediaPlayer {

    @Override
    public void start() {
        System.out.println("Started Music System");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Music System");
    }

}
