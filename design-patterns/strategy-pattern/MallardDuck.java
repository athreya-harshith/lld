import duckBehaviours.FlyWithWings;
import duckBehaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("Looks like a Mallard Duck");
    }

}
