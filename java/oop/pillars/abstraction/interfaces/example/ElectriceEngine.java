package pillars.abstraction.interfaces.example;

public class ElectriceEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Started Electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Electric engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Electric engine");
    }

}
