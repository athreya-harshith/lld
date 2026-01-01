import duckBehaviours.interfaces.FlyBehaviour;
import duckBehaviours.interfaces.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void swim() {
        System.out.println("Swimming");
    }

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour obj) {
        this.flyBehaviour = obj;
    }

    public void setQuackBehaviour(QuackBehaviour obj) {
        this.quackBehaviour = obj;
    }

    abstract public void display();
}
