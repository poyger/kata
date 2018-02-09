package pattern.visitor;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        final List<Product> products = List.of(new Book(100, "Utvandrarna"), new Fruit(10, "Apelsiner", 2));
        products.stream().forEach(o -> {
            final int price = o.accept(new PriceCounterVisitorImpl());
            System.out.println(o + " price " + price);
        });
    }
}
