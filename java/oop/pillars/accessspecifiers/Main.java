package pillars.accessspecifiers;

import pillars.accessspecifiers.example.Child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(10, 20, 30, 40);
        /**
         * Accessible: public visible everywhere
         * Non Accessible: protected, default and private
         */
        System.out.println("ChildClass - Public " + child.public_member);

        /*
         * Accessible: public
         * Non Accessible: private, default and protected ( Protected access is only in
         * the subclasses even though diff package but Main is not subclass )
         */
        SubClass subClass = new SubClass(1, 2, 3, 4);

        System.out.println("SubClass - public" + subClass.public_member);

    }
}
