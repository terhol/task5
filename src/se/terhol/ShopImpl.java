package se.terhol;

import java.util.*;

/**
 * @author Tereza Holm
 */
public class ShopImpl implements Shop {
    HashMap<Customer, ShoppingCart> shop = new HashMap<>();

    @Override
    public void addProductToBuy(Customer customer, Product product) {
        if (customer == null || product == null) {
            throw new NullPointerException("Customer and product cannot be null.");
        }

        if (shop.containsKey(customer)) {
            if (shop.get(customer).contains(product)) {
                product.setQuantity(product.getQuantity() + 1);
            } else {
                shop.get(customer).add(product);
            }
        } else {
            shop.put(customer, new ShoppingCartImpl());
            shop.get(customer).add(product);
        }
    }

    @Override
    public int buy(Customer customer) {
        if (customer == null) {
            throw new NullPointerException("Customer cannot be null.");
        }
        int finalPrice = shop.get(customer).getPrice();
        shop.remove(customer);
        return finalPrice;
    }

    @Override
    public Collection<Customer> getActiveCustomers() {
        Set<Customer> activeCustomers = new HashSet<>();
        for (Customer customer : shop.keySet()) {
            if (shop.get(customer).getPrice() != 0) {
                activeCustomers.add(customer);
            }
        }
        return Collections.unmodifiableSet(activeCustomers);
    }

    @Override
    public Collection<Product> getProductsToBuy(Customer customer) {
        if (customer == null) {
            throw new NullPointerException("Customer cannot be null.");
        }

        if (!shop.containsKey(customer) || shop.get(customer).getPrice() == 0) {
            return null;
        } else {
            return shop.get(customer).getProducts();
        }
    }
}



