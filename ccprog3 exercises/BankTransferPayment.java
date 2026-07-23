/**
 * Handles payments made via direct bank transfer.
 *
 * TODO 5: This class is intentionally left mostly blank. Using
 * CreditCardPayment.java and PayPalPayment.java as your reference,
 * complete this class so that it:
 *
 *   1. Becomes a subclass of PaymentProcessor.
 *   2. Stores two private attributes: accountNumber (String) and
 *      bankCode (String).
 *   3. Has a public constructor that takes
 *      (customerName, amount, accountNumber, bankCode) and calls
 *      super(customerName, amount) before setting its own attributes.
 *   4. Implements validatePaymentDetails():
 *        - accountNumber must contain only digits and be between
 *          10 and 12 digits long
 *        - bankCode must not be null or blank
 *   5. Implements processPayment(): print a message simulating an
 *      interbank transfer, e.g.
 *      "Transferring PHP 1500.00 via bank code BDO to account
 *      ending in 4321..."
 *   6. Implements getPaymentMethodName() to return "Bank Transfer".
 */
public class BankTransferPayment {

    // TODO: declare the private attributes described above

    // TODO: write the constructor

    @Override
    public boolean validatePaymentDetails() {
        // TODO: implement this method
        return false;
    }

    @Override
    protected void processPayment() {
        // TODO: implement this method
    }

    @Override
    public String getPaymentMethodName() {
        // TODO: implement this method
        return null;
    }
}
