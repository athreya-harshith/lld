package pillars.abstraction.abstractclasses;

public class Human extends Animal {
    public Human() {
        super(0, "Human");
    }

    @Override
    public void species() {
        System.out.println("This is a " + this.NAME);
    }

    @Override
    public void nature() {
        System.out.println("A social animal");
    }
}
