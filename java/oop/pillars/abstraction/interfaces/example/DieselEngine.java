package pillars.abstraction.interfaces.example;

public class DieselEngine implements Engine {

    /*
     * Since start has a default implementation, it need not be compulsorily
     * overridden
     */
    // @Override
    // public void start() {
    // System.out.println("Started Diesel engine");
    // }

    @Override
    public void stop() {
        System.out.println("Stopped Diesel engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Diesel engine");
    }

}
