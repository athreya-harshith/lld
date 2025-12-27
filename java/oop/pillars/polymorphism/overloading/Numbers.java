package pillars.polymorphism.overloading;

public class Numbers {

    public int sum(int a, int b) {
        return a + b;
    }

    // Duplicate method sum(int, int) in type Numbers
    /*
     * Though this and above differ in the return types this is not valid
     * overloading in java because, it will be ambiguous for compiler to determine
     * which method to invoke as both the methods accepts same type of arguments
     * public float sum(int a, int b) {
     * return a + b;
     * }
     */

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println("The integer sum " + obj.sum(10, 20));
        System.out.println("The double sum " + obj.sum(20.00, 30));

    }
}
