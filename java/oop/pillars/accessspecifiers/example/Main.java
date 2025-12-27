package pillars.accessspecifiers.example;

public class Main {
    public static void main(String[] args) {
        Child obj = new Child(10, 20, 30, 40);
        Parent parent = new Parent(100, 200, 300, 400);
        /*
         * The protected members are accessible in Main class even though a non member
         * because its in the same package
         */
        System.out.println(
                "ChildClass - Protected " + obj.protected_member + " Default " + obj.default_member + " Public "
                        + obj.public_member);

        System.out.println(
                "ParentClass - Protected " + parent.protected_member + " Default " + parent.default_member + " Public "
                        + parent.public_member);
    }
}
