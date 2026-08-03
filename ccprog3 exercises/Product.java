/**
 * Product.java
 * Provided to students - do not modify.
 *
 * Abstract base class for every item sold in the store. It stores the
 * shared fields every product has, but deliberately leaves
 * calculateFinalPrice() abstract because every product category computes
 * its final price differently (tax, discount, both, or neither).
 */
public abstract class Product {
    protected String name;
    protected double basePrice;
    protected int quantity;

    public Product(String name, double basePrice, int quantity) {
        this.name = name;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    /**
     * Each concrete subclass MUST define how its final price
     * (basePrice * quantity, adjusted for tax/discount) is computed.
     */
    public abstract double calculateFinalPrice();

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("%-15s x%-3d  Php %9.2f", name, quantity, calculateFinalPrice());
    }
}
