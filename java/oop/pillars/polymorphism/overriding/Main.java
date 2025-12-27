package pillars.polymorphism.overriding;

public class Main {
    public static void main(String[] args) {
        /*
         * O/P The area is pie * r * r
         * 
         * Base class reference type points to the child class instance. Since the
         * method is overrided in the child class, during the runtime the overrided
         * method is replaced with the one in the base class. This process is called as
         * Dynamic Method Dispatch.
         * 
         * And this process of assigning a base class reference variable to an instance
         * of its child class is called as upcasting
         */
        Shape circle = new Circle();
        circle.area();
    }
}
