import java.util.List;

/**
 * Uses Kotlin library in {@link ../lib/kotlin-java-interop.jar}
 */
public class Main {

    public static void main(String[] args) {
        final Customer phil = new Customer(1, "Phil");
        final CustomerDatabase db = new CustomerDatabase();
        final List<Customer> customers = db.getCustomers();
        // Catching Exception from Kotlin
        try {
            db.addCustomer(phil);
        } catch (IllegalAccessException e) {
            System.out.println("Caught Exception");
        }

        customers
            .forEach(System.out::println);

        CustomerDatabase.helloWorld();
    }
}
