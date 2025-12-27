package staticexamples;

public class Human {
    private static int population;
    public String name;

    // Static block to initialize the static data members
    static {
        Human.population = 0;
        System.out.println("Invoked the static block");
    }

    public Human() {
        Human.population++;
        this.name = "";
    }

    public Human(String name) {
        Human.population++;
        this.name = name;
    }

    public void greeting() {
        System.out.println("Hello " + this.name + " Total population is " + Human.population);
    }

    public static void getPopulationCount() {
        // Cannot use this in a static contextJava(536871112)
        // System.out.println("Hello " + this.name);
        System.out.println("Pupulation Count is " + Human.population);
    }
}
