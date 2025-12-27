package pillars.polymorphism.overriding;

public class Circle extends Shape {
    // @Override ensures that the method is overriden
    @Override
    public void area() {
        System.out.println("The area is pie * r * r");
    }
}
