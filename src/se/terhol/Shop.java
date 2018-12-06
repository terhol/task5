package se.terhol;

import java.util.Collection;

public interface Shop {
    /**
     * It adds a product to the customer's shopping cart. If the shopping
     * cart already contains the given product, the method increases quantity
     * of the product in the shopping cart by the quantity of the given product.
     *
     * @param customer
     * @param product
     * @throws NullPointerException if the customer or the product are null.
     */
    void addProductToBuy(Customer customer, Product product);

    /**
     * It returns a sum of prices of the products in the customer's shopping
     * cart and removes the customer and his/her shopping cart from the shop.
     *
     * @return Sum of prices of the products in the customers's shopping cart
     * or 0 if the customer is not active.
     * The sum is influenced by the quantity of the product.
     * @throws NullPointerException if the customer is null.
     */
    int buy(Customer customer);

    /**
     * It returns all active customers in the shop (the customers having not empty shopping
     * cart).
     *
     * @return An unmodifiable collection of the customers.
     */
    Collection<Customer> getActiveCustomers();

    /**
     * It returns products in the customer's shopping cart.
     *
     * @return An unmodifiable collection of the products
     * or null if the customer is not active
     * @throws NullPointerException if the customer is null.
     */
    Collection<Product> getProductsToBuy(Customer customer);
}
