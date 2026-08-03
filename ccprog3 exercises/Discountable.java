/**
 * Discountable.java
 * Provided to students - do not modify.
 *
 * Any Product that can have a discount applied to it should implement
 * this interface.
 */
public interface Discountable {
    /**
     * Applies a discount to the given amount.
     *
     * @param amount the original amount before discount
     * @return the discounted amount
     */
    double applyDiscount(double amount);
}
