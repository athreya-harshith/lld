package pillars.abstraction.abstractclasses;

public class Main {
    public static void main(String[] args) {
        Animal obj = new Human();
        obj.species();
        obj.nature();
        Animal.appearance();
    }
}
