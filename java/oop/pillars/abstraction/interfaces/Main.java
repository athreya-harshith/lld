package pillars.abstraction.interfaces;

import pillars.abstraction.interfaces.example.ElectriceEngine;

// import pillars.abstraction.interfaces.example.Engine;

public class Main {
    public static void main(String[] args) {
        TestCar testCar = new TestCar();
        testCar.start();
        testCar.accelerate();
        testCar.brake();
        testCar.stop();

        /*
         * Can be used as a reference variable type.
         */
        // Engine car = new TestCar();

        Car car = new Car();
        car.start();
        car.accelerate();
        car.startMusic();
        car.stop();

        car.upgradeEngine(new ElectriceEngine());
        car.start();
        car.stop();
    }
}
