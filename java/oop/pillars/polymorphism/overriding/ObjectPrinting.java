package pillars.polymorphism.overriding;

public class ObjectPrinting {
    int num;

    public ObjectPrinting(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrinting { num: " + this.num + " }";
    }

    public static void main(String[] args) {
        ObjectPrinting obj = new ObjectPrinting(10);
        /*
         * O/P pillars.polymorphism.overriding.ObjectPrinting@1dbd16a6
         * 
         * This is without overriding the toString method from Object class
         * 
         * O/P ObjectPrinting { num: 10 }
         * 
         * This is after overriding the toString method
         */
        System.out.println(obj);
    }
}
