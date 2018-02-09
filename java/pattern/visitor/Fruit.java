package pattern.visitor;

public class Fruit implements Product {
    private int priceperKg;
    private int weight;
    private String name;

    public Fruit(int priceperKg, String name, int weight) {
        this.priceperKg = priceperKg;
        this.name = name;
        this.weight = weight;
    }

    public int getPriceperKg() {
        return priceperKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(PriceCounterVisitor visitor) {
        return visitor.countPrice(this);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "priceperKg=" + priceperKg +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
