package duckBehaviours;

import duckBehaviours.interfaces.FlyBehaviour;

public class RocketedFly implements FlyBehaviour {
    public void fly() {
        System.out.println("Flying with rockets");
    }
}
