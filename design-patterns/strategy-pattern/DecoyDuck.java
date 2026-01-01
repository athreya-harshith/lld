import duckBehaviours.MutedQuack;
import duckBehaviours.NoFly;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehaviour = new NoFly();
        this.quackBehaviour = new MutedQuack();
    }

    public void display() {
        System.out.println("Looks like a Decoy Duck ( Wooden Toy )");
    }
}
