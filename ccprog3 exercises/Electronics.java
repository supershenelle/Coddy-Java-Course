/**
 * Electronics.java
 * STUDENT TASK: complete the TODOs below.
 *
 * Electronics are taxable (12% VAT) but never discounted.
 */
public class Electronics extends Product implements Taxable {

    public Electronics(String name, double basePrice, int quantity) {
        super(name, basePrice, quantity);
    }

    // TODO 1: Implement calculateTax() from the Taxable interface.
    //         Tax should be computed on (basePrice * quantity) using VAT_RATE.
    @Override
    public double calculateTax() {
        // your code here
        return basePrice * quantity * VAT_RATE;
    }

    // TODO 2: Implement calculateFinalPrice() from the abstract Product class.
    //         Final price = (basePrice * quantity) + calculateTax()
    @Override
    public double calculateFinalPrice() {
        // your code here
        return (basePrice * quantity) + calculateTax();
    }
}
