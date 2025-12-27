package staticexamples;

public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null)
            return new Singleton();
        return instance;
    }

    /**
     * The constructor Singleton() is not visibleJava(134217859)
     * staticexamples.Singleton.Singleton()
     */
    // Singleton obj = new Singleton();
}
