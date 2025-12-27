package pillars.inheritance;

public class WeightedBox extends Box {
    double weight;

    WeightedBox() {
        this.weight = -1;
    }

    WeightedBox(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    WeightedBox(WeightedBox obj) {
        super(obj);
        this.weight = obj.weight;
    }

    public void invokeSuperMethods() {
        System.out.println("Invoking the super methods");
        super.getDimensions();
    }
}
