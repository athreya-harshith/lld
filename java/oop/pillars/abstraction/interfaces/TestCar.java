package pillars.abstraction.interfaces;

import pillars.abstraction.interfaces.example.*;

public class TestCar implements Engine, Brake, MediaPlayer {
    /**
     * Though both Engine and MediaPlayer provides us with the start and stop
     * methods, its dependent on the class which implements the interface to write
     * the behaviour
     * 
     * Here still there is no granular control on controlling the media player
     */
    @Override
    public void start() {
        System.out.println("Started the car");
    }

    @Override
    public void brake() {
        System.out.println("Applying the brake");
    }

    @Override
    public void stop() {
        System.out.println("Stopped the car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the car");
    }
}
