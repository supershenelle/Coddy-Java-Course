import java.util.ArrayList;
import java.util.List;

/**
 * Simulates a checkout page that accepts several payment methods.
 * Notice that this class only ever talks to the "PaymentProcessor"
 * type - it doesn't know or care whether it's holding a
 * CreditCardPayment, a PayPalPayment, or a BankTransferPayment.
 * That's polymorphism at work.
 */
public class CheckoutDemo {

    public static void main(String[] args) {
        List<PaymentProcessor> checkoutQueue = new ArrayList<>();

        // A valid credit card payment
        checkoutQueue.add(new CreditCardPayment(
                "Maria Santos", 2500.00, "4532015112830366", "09/28", "123"));

        // An invalid credit card payment (bad card number) - should fail validation
        checkoutQueue.add(new CreditCardPayment(
                "Juan Dela Cruz", 1200.00, "1234", "11/27", "45"));

        // A valid PayPal payment
        checkoutQueue.add(new PayPalPayment(
                "Ana Reyes", 899.50, "[email protected]"));

        // TODO 6: Add at least two more PaymentProcessor objects to this
        // queue once you've completed BankTransferPayment:
        //   - one with valid bank details
        //   - one with invalid bank details (e.g. account number too short)
        // Example:
        // checkoutQueue.add(new BankTransferPayment(
        //         "Carlo Tan", 5000.00, "1234567890", "BDO"));

        System.out.println("=== Processing checkout queue (" + checkoutQueue.size() + " transactions) ===\n");

        int successCount = 0;
        for (PaymentProcessor payment : checkoutQueue) {
            boolean result = payment.executeTransaction();
            if (result) {
                successCount++;
            }
            System.out.println();
        }

        System.out.println("=== Summary: " + successCount + "/" + checkoutQueue.size()
                + " transactions succeeded ===");
    }
}
