package pattern.visitor;

public interface PriceCounterVisitor {
        int countPrice(Book book);
        int countPrice(Fruit fruit);
}


class PriceCounterVisitorImpl implements PriceCounterVisitor {

    @Override
    public int countPrice(Book book) {
        if (book.getPrice() > 50)
            return book.getPrice() - 10;
        return book.getPrice();
    }

    @Override
    public int countPrice(Fruit fruit) {
        return fruit.getPriceperKg() * fruit.getWeight() ;
    }
}