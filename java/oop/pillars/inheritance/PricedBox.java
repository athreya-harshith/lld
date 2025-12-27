package pillars.inheritance;

//Multi level inheritance Box -> WeightedBox -> PricedBox
public class PricedBox extends WeightedBox {
    double price;

    PricedBox() {
        this.price = -1;
    }

    PricedBox(PricedBox obj) {
        super(obj);
        this.price = obj.price;
    }
}
