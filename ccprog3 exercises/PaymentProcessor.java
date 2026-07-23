import java.time.LocalDateTime;

/**
 * Abstract class representing a generic payment processor for an
 * e-commerce checkout system.
 *
 * Design pattern in use: TEMPLATE METHOD.
 * executeTransaction() below is "final" - it defines the fixed sequence
 * every payment goes through, no matter which payment method is used.
 * Subclasses only fill in the method-specific steps (validation and
 * fund transfer), not the overall flow.
 *
 * DO NOT modify this class. Your job is to complete the subclasses.
 */
public abstract class PaymentProcessor {

    protected String transactionId;
    protected double amount;
    protected String customerName;

    public PaymentProcessor(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
        this.transactionId = generateTransactionId();
    }

    // =========================================================
    // ABSTRACT METHODS — every subclass MUST implement these.
    // =========================================================

    /**
     * Check that the payment-method-specific details are valid
     * (e.g. card number length, e-mail format, account number format).
     * Return false (do NOT throw an exception) if details are invalid -
     * executeTransaction() below will handle the failure gracefully.
     */
    public abstract boolean validatePaymentDetails();

    /**
     * Simulate transferring the funds using this specific payment method.
     * You do not need to connect to any real payment gateway - just
     * print a message describing what would happen.
     */
    protected abstract void processPayment();

    /**
     * Return a short human-readable name for this payment method,
     * e.g. "Credit Card", "PayPal", "Bank Transfer".
     * Used in logs and receipts.
     */
    public abstract String getPaymentMethodName();

    // =========================================================
    // CONCRETE METHODS — shared behavior, already implemented.
    // =========================================================

    private String generateTransactionId() {
        return "TXN-" + System.currentTimeMillis();
    }

    protected void logTransaction(boolean success) {
        System.out.println("[" + LocalDateTime.now() + "] " + transactionId
                + " | " + getPaymentMethodName()
                + " | Customer: " + customerName
                + " | Amount: PHP " + String.format("%.2f", amount)
                + " | Status: " + (success ? "SUCCESS" : "FAILED"));
    }

    /**
     * TEMPLATE METHOD - defines the fixed steps every payment goes through:
     *   1. Validate payment details
     *   2. Process the payment (only if valid)
     *   3. Log the result
     *
     * This method is "final" on purpose: subclasses may NOT override the
     * sequence of steps, only the individual steps themselves (via the
     * abstract methods above).
     */
    public final boolean executeTransaction() {
        System.out.println("Starting transaction " + transactionId + " for " + customerName + "...");

        if (!validatePaymentDetails()) {
            System.out.println("Validation failed for " + getPaymentMethodName() + ".");
            logTransaction(false);
            return false;
        }

        processPayment();
        logTransaction(true);
        return true;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }
}
