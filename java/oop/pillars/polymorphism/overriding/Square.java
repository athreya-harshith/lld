package pillars.polymorphism.overriding;

public class Square extends Shape {
    @Override
    public void area() {
        System.out.println("The area is a * a");
    }
}
