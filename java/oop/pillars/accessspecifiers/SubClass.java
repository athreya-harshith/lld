package pillars.accessspecifiers;

import pillars.accessspecifiers.example.Parent;

public class SubClass extends Parent {
    public SubClass(int priv, int prot, int def, int pub) {
        // In order to do this the constructor must be public
        super(priv, prot, def, pub);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10, 20, 30, 40);
        /**
         * Accessible: public and protected since its a subclass outside package
         * Non Accessible: private and default ( default is only uptill the subclasses
         * of same package )
         */
        System.out.println("SubClass - Public " + obj.public_member + " Protected " + obj.protected_member);
    }
}
