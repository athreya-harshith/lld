package pillars.abstraction.interfaces;

import pillars.abstraction.interfaces.example.*;

public class Car {
    private Engine engine;
    private MediaPlayer musicSystem;

    public Car() {
        this.engine = new DieselEngine();
        this.musicSystem = new MusicSystem();
    }

    public void start() {
        this.engine.start();
    }

    public void stop() {
        this.engine.stop();
    }

    public void accelerate() {
        this.engine.accelerate();
    }

    public void startMusic() {
        this.musicSystem.start();
    }

    public void stopMusic() {
        this.musicSystem.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }
}
