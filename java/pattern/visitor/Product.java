package pattern.visitor;

public interface Product {
    int accept(PriceCounterVisitor visitor);
}
