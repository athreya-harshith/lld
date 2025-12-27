package staticexamples;

public class Main {
    public static void main(String[] args) {
        Human firstHuman = new Human("Alice");
        firstHuman.greeting();

        Human secondHuman = new Human("Bob");
        // The static method getPopulationCount() from the type Human
        // should be accessed in a static wayJava
        // secondHuman.getPopulationCount();

        Human.getPopulationCount();

        /**
         * The constructor Singleton() is not visibleJava(134217859)
         * staticexamples.Singleton.Singleton()
         */
        // Singleton obj = new Singleton();
    }
}
