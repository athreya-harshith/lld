package basics;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("The Student Obj Contents" + obj);
        checkGarbageCollection();
    }

    public static void checkGarbageCollection() {
        Student obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new Student();
        }
    }
}
