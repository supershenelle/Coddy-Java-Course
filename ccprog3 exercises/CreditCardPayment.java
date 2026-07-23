/**
 * Handles payments made via credit card.
 */
public class CreditCardPayment extends PaymentProcessor {

    private String cardNumber;
    private String expiryDate; // format: MM/YY
    private String cvv;

    public CreditCardPayment(String customerName, double amount,
                              String cardNumber, String expiryDate, String cvv) {
        super(customerName, amount);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    /**
     * TODO 1: Implement validatePaymentDetails().
     *
     * Rules to check:
     *   - cardNumber must contain exactly 16 digits (no spaces/dashes)
     *   - cvv must contain exactly 3 digits
     *   - expiryDate must not be null/blank (you do not need to check
     *     whether the date itself is in the future for this exercise)
     *
     * Hint: cardNumber.matches("\\d{16}") is a clean way to check this.
     */
    @Override
    public boolean validatePaymentDetails() {
        // TODO: replace this line with your real validation logic
        return false;
    }

    /**
     * TODO 2: Implement processPayment().
     *
     * Simply print a message simulating a charge to the card, e.g.:
     * "Charging PHP 1500.00 to card ending in 1234..."
     *
     * Hint: use cardNumber.substring(cardNumber.length() - 4) to get the
     * last 4 digits - do not print the full card number.
     */
    @Override
    protected void processPayment() {
        // TODO: implement this method
    }

    @Override
    public String getPaymentMethodName() {
        return "Credit Card";
    }
}
