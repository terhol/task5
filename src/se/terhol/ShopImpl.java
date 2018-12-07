package se.terhol;

import java.util.*;

/**
 * @author Tereza Holm
 */
public class ShopImpl implements Shop {
    HashMap<Customer, ShoppingCart> myShop = new HashMap<>();

    @Override
    public void addProductToBuy(Customer customer, Product product) {
        if (customer == null || product == null) {
            throw new NullPointerException("Customer and product cannot be null.");
        }

        if (myShop.containsKey(customer)) {
            if (myShop.get(customer).contains(product)) {
                product.setQuantity(product.getQuantity() + 1);
            } else {
                myShop.get(customer).add(product);
            }
        } else {
            ShoppingCartImpl shoppingCart = new ShoppingCartImpl();
            myShop.put(customer, shoppingCart);
            myShop.get(customer).add(product);
        }
    }

    @Override
    public int buy(Customer customer) {
        if (customer == null) {
            throw new NullPointerException("Customer cannot be null.");
        }
        int finalPrice = myShop.get(customer).getPrice();
        myShop.remove(customer);
        return finalPrice;
    }

    @Override
    public Collection<Customer> getActiveCustomers() {
        Set<Customer> activeCustomers = new HashSet<>();
        for (Customer customer : myShop.keySet()) {
            if (myShop.get(customer).getPrice() != 0) {
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

        if (!myShop.containsKey(customer) || myShop.get(customer).getPrice() == 0) {
            return null;
        } else {
            return myShop.get(customer).getProducts();
        }
    }
}



