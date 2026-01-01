package duckBehaviours;

import duckBehaviours.interfaces.QuackBehaviour;

public class MutedQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("Muted Quack");
    }
}
