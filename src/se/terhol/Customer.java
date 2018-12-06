package se.terhol;

/**
 * This class represents a customer of a shop
 *
 * @author Jan Papousek
 */
public class Customer {
    private String name;

    /**
     * It create a new customer with specific name
     *
     * @throws NullPointerException if the name is null.
     */
    public Customer(String name) {
        if (name == null) {
            throw new NullPointerException("The parameter name is null.");
        }
        this.name = name;
    }

    /**
     * @return customer's name
     */
    public String getName() {
        return name;
    }
}
