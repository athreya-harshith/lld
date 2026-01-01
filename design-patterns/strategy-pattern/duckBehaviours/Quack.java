package duckBehaviours;

import duckBehaviours.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    public void quack() {
        System.out.println("Quacking");
    }
}
