import duckBehaviours.FlyWithWings;
import duckBehaviours.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("Looks like a Redhead Duck");
    }
}
