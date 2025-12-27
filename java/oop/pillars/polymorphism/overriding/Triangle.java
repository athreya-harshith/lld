package pillars.polymorphism.overriding;

public class Triangle extends Shape {
    @Override
    public void area() {
        System.out.println("The area is 0.5 * b * h");
    }
}
