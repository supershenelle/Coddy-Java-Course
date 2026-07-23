/**
 * Handles payments made via PayPal.
 */
public class PayPalPayment extends PaymentProcessor {

    private String email;

    public PayPalPayment(String customerName, double amount, String email) {
        super(customerName, amount);
        this.email = email;
    }

    /**
     * TODO 3: Implement validatePaymentDetails().
     *
     * Rules to check:
     *   - email must not be null or blank
     *   - email must contain exactly one "@" and at least one "." after it
     *
     * Hint: a simple regular expression like "^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$"
     * is good enough for this exercise (this is not meant to be a
     * production-grade email validator).
     */
    @Override
    public boolean validatePaymentDetails() {
        // TODO: replace this line with your real validation logic
        return false;
    }

    /**
     * TODO 4: Implement processPayment().
     *
     * Print a message simulating redirecting to PayPal and completing
     * the payment, e.g.:
     * "Redirecting [email protected] to PayPal to authorize PHP 1500.00..."
     */
    @Override
    protected void processPayment() {
        // TODO: implement this method
    }

    @Override
    public String getPaymentMethodName() {
        return "PayPal";
    }
}
