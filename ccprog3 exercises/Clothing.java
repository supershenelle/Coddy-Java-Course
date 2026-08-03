/**
 * Clothing.java
 * STUDENT TASK: write this entire class.
 *
 * Clothing items are BOTH taxable (12% VAT) AND discountable:
 * - If quantity >= 3, apply a 20% discount on (basePrice * quantity)
 *   before tax is computed.
 * - Tax (VAT) is computed on the discounted amount.
 * - Final price = discounted amount + tax.
 *
 * TODO 5: Declare the class so it extends Product and implements
 *         BOTH Taxable and Discountable.
 * TODO 6: Write the constructor (name, basePrice, quantity), calling super().
 * TODO 7: Implement applyDiscount(double amount).
 * TODO 8: Implement calculateTax().
 * TODO 9: Implement calculateFinalPrice() using applyDiscount() and calculateTax().
 */
public class Clothing extends Product implements Taxable, Discountable {

    // your code here
    public Clothing(String name, double basePrice, int quantity)
    {
        super(name, basePrice, quantity);
    }

    @Override
    public double applyDiscount(double amount) {
        if (quantity >= 3)
            return amount * 0.80;
        return amount;
    }

    @Override
    public double calculateTax() {
        double subtotal = basePrice * quantity;
        double discountedAmount = applyDiscount(subtotal);
        return discountedAmount * VAT_RATE;
    }

    @Override
    public double calculateFinalPrice() {
        double subtotal = basePrice * quantity;
        double discountedAmount = applyDiscount(subtotal);
        return discountedAmount + calculateTax();
    }
}
