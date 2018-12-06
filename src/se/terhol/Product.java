package se.terhol;

/**
 * Product in shop.
 *
 * @author Jan Papousek
 */
public class Product {
    private String name;
    private int price;
    private int quantity;

    /**
     * It creates a new product with specific name and price.
     *
     * @param name  The name of the product.
     * @param price The price of the product.
     * @throws NullPointerException     if the name is null.
     * @throws IllegalArgumentException if the price isn't a positive number.
     */
    public Product(String name, int price) {
        if (name == null) {
            throw new NullPointerException("The parameter [name] is null.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("The parameter [price] has to be a positive number.");
        }
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    /**
     * @return The name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * @return The price of the product
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return The quantity of the product
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * It sets a quantity of the product (number of pieces which the customer wants to buy).
     *
     * @param quantity A new quantity
     * @throws IllegalArgumentException if the quantity isn't a positive number
     */
    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("The parameter [quantity] has to be a positive number.");
        }
        this.quantity = quantity;
    }
}
