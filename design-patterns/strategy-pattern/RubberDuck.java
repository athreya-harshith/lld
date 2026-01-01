import duckBehaviours.NoFly;
import duckBehaviours.SqueakQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehaviour = new NoFly();
        this.quackBehaviour = new SqueakQuack();
    }

    public void display() {
        System.out.println("Looks like a Rubber Duck");
    }
}
