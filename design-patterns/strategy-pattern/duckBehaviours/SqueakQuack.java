package duckBehaviours;

import duckBehaviours.interfaces.QuackBehaviour;

public class SqueakQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("Squeaked Qucking");
    }
}
