package staticexamples;

public class StaticInnerClass {
    static class Test {
        public String name;

        public Test() {
            this.name = "random";
        }
    }

    public static void main(String[] args) {
        /*
         * Possible because the class Test is static in the context of StaticInnerClass
         * Hence the Test class can be instantiated without requiring the instance of
         * StaticInnerClass
         */
        Test obj = new Test();
        System.out.println("Test Obj" + obj);
    }
}
/*
 * OuterClass cannot be static
 * Reason: Any member or class which are static requires another enclosing class
 * to provide a context. If we make the outer class as static there will be no
 * enclosing class for it hence by this convention the outer cannot be static.
 */