package pillars.accessspecifiers.example;

public class Parent {
    private int private_member;
    protected int protected_member;
    int default_member;
    public int public_member;

    public Parent(int priv, int prot, int def, int pub) {
        this.private_member = priv;
        this.protected_member = prot;
        this.default_member = def;
        this.public_member = pub;
    }

    public int getPrivateMember() {
        return this.private_member;
    }
}
