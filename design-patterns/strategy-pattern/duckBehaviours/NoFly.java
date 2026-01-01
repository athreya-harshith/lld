package duckBehaviours;

import duckBehaviours.interfaces.FlyBehaviour;

public class NoFly implements FlyBehaviour {
    public void fly() {
        System.out.println("Cannot Fly");
    }
}
