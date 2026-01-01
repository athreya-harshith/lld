import duckBehaviours.RocketedFly;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        rubberDuck.setFlyBehaviour(new RocketedFly());
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
