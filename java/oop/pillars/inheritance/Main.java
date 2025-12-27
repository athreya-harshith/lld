package pillars.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new WeightedBox(10, 20, 30, 100);
        // Not possible
        // System.out.println(obj.weight);
        box.getDimensions();

        // Type mismatch: cannot convert from Box to WeightedBoxJava
        // WeightedBox weightedBox = new Box(10, 20, 30)
        WeightedBox weightedBox = new WeightedBox(new WeightedBox(100, 200, 300, 500));
        weightedBox.invokeSuperMethods();
    }
}
