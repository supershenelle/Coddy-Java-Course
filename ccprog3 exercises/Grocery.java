/**
 * Grocery.java
 * STUDENT TASK: complete the TODOs below.
 *
 * Groceries are never taxed, but they DO get a bulk discount:
 * if quantity >= 5, apply a 10% discount on the total.
 */
public class Grocery extends Product implements Discountable {

    public Grocery(String name, double basePrice, int quantity) {
        super(name, basePrice, quantity);
    }

    // TODO 3: Implement applyDiscount() from the Discountable interface.
    //         If quantity >= 5, return amount * 0.90 (10% off).
    //         Otherwise, return amount unchanged.
    @Override
    public double applyDiscount(double amount) {
        // your code here
        if (quantity >= 5)
            return amount * 0.90;
        return amount;
    }

    // TODO 4: Implement calculateFinalPrice() from the abstract Product class.
    //         Final price = applyDiscount(basePrice * quantity)
    @Override
    public double calculateFinalPrice() {
        // your code here
        return applyDiscount(basePrice * quantity);
    }
}
