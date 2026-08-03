/**
 * Taxable.java
 * Provided to students - do not modify.
 *
 * Any Product that is subject to Value-Added Tax (VAT) should implement
 * this interface.
 */
public interface Taxable {
    double VAT_RATE = 0.12; // 12% VAT, fixed for all taxable products

    /**
     * @return the amount of tax (in pesos) charged on this item.
     */
    double calculateTax();
}
