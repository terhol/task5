package se.terhol;

import java.util.Collection;

/**
 * This class represents a shopping cart
 *
 * @author Jan Papousek
 */
public interface ShoppingCart {
    /**
     * It adds a new product to the shopping cart
     *
     * @param product A new product which customer wants to add to the shopping cart
     * @return true if the product has been successfully added,
     * false otherwise (the product is already in the shopping cart)
     * @throws NullPointerException if the product is null
     */
    boolean add(Product product);

    /**
     * It checks whether the shopping cart contains the given product.
     *
     * @param product
     * @return true if the shopping cart contains the given product,
     * false otherwise
     */
    boolean contains(Product product);

    /**
     * It returns price of the content of the shopping cart.
     *
     * @return Sum of prices of the products in the shopping cart.
     * The sum is influenced by the quantity of the product.
     */
    int getPrice();

    /**
     * It returns all products which the shopping cart contains
     *
     * @return An unmodifiable collection of the products.
     */
    Collection<Product> getProducts();
}
