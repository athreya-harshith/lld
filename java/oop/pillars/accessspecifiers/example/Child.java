package pillars.accessspecifiers.example;

public class Child extends Parent {
    public Child(int priv, int prot, int def, int pub) {
        super(priv, prot, def, pub);
    }

    public void getMemberDetails() {
        /* Not Accessible as its private */
        // this.private_member;

        System.out.println("Protected " + this.protected_member + " Default " + this.default_member + " Public "
                + this.public_member);
    }

}
