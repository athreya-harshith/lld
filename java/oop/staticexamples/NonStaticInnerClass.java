package staticexamples;

public class NonStaticInnerClass {
    class Test {
        public String name;

        public Test() {
            this.name = "random";
        }
    }

    public void instatiateTest() {
        // Possible because the instantiateTest is a non static member
        // Has a context ( aka this reference )
        Test obj = new Test();
        System.out.println("Test Obj" + obj);
    }

    public static void main(String[] args) {
        /*
         * No enclosing instance of type NonStaticInnerClass is accessible. Must qualify
         * the allocation with an enclosing instance of type NonStaticInnerClass (e.g.
         * x.new A() where x is an instance of NonStaticInnerClass)
         */
        // Since there is no instance of class NonStaticInnerClass, the Test class
        // cannot be instantiated within a static method.
        // Test obj = new Test();
    }
}
