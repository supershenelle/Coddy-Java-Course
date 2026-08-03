import java.util.ArrayList;
import java.util.List;

/**
 * BillingSystemDriver.java
 * STUDENT TASK: complete the TODOs below.
 *
 * This class prints a receipt for a shopping cart made up of different
 * Product subclasses, demonstrating polymorphism (a List<Product> holding
 * Electronics, Grocery, and Clothing objects), plus a separate tax
 * breakdown for items that implement Taxable.
 */
public class BillingSystemDriver {

    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        cart.add(new Electronics("Wireless Mouse", 799.00, 2));
        cart.add(new Grocery("Canned Sardines", 35.50, 6));
        cart.add(new Grocery("Instant Noodles", 15.00, 3));
        cart.add(new Clothing("Cotton T-Shirt", 299.00, 4));

        System.out.println("=========================================");
        System.out.println("           MABUHAY MART - RECEIPT        ");
        System.out.println("=========================================");

        double grandTotal = 0.0;

        // TODO 10: Loop through `cart` and, for each Product:
        //   a) print the product using its toString() (already provided)
        //   b) add its calculateFinalPrice() to grandTotal
        for (Product p : cart) {
            // your code here
            System.out.println(p.toString());
            grandTotal += p.calculateFinalPrice();
        }

        System.out.println("-----------------------------------------");
        System.out.printf("GRAND TOTAL:               Php %9.2f%n", grandTotal);
        System.out.println("=========================================");

        // TODO 11: Print a "Tax Breakdown" section below that lists ONLY
        // the products in `cart` that implement Taxable, showing each
        // product's name and the tax amount from calculateTax().
        // Hint: use `if (p instanceof Taxable taxableItem) { ... }`
        System.out.println();
        System.out.println("Tax Breakdown (VAT):");
        // your code here
        for (Product p : cart)
        {
            if (p instanceof Taxable taxableItem)
                System.out.println(p.name + "       Php " + taxableItem.calculateTax());
        }
    }
}
