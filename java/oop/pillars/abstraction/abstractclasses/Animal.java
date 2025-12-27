package pillars.abstraction.abstractclasses;

abstract public class Animal {
    protected final String NAME;
    public int age;

    public Animal(int age, String name) {
        this.age = age;
        this.NAME = name;
    }

    public void nature() {
        System.out.println("Its an Animal and it can be sensitive");
    }

    public static void appearance() {
        System.out.println("Has eyes, nose and ears");
    }

    abstract public void species();

}
