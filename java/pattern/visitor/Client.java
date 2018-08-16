package pattern.visitor;

import java.util.List;

/**
 * kata for testing visitor pattern, visitor can be used for detaching functionality outside the domain class, in this case
 * we counting the price for Fruit and Book with a price counter visitor.
 */
public class Client {
    public static void main(String[] args) {
        final List<Product> products = List.of(new Book(100, "Utvandrarna"), new Fruit(10, "Apelsiner", 2));
        products.stream().forEach(o -> {
            final int price = o.accept(new PriceCounterVisitorImpl());
            System.out.println(o + " price " + price);
        });
    }
}
