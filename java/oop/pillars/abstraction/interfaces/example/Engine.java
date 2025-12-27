package pillars.abstraction.interfaces.example;

public interface Engine {

    /*
     * Not Allowed
     * This method requires a body instead of a semicolon
     */
    // static void engineDetails();

    static void engineDetails() {
        System.out.println("Engine can start, accelerate and stop.");
    }

    default public void start() {
        System.out.println("Engine Started.");
    }

    public void stop();

    public void accelerate();
}
