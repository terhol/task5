package se.terhol;

import se.terhol.Product;
import se.terhol.ShoppingCart;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Tereza Holm
 */
public class ShoppingCartImpl implements ShoppingCart {


    private Set<Product> products = new HashSet<>();

    @Override
    public boolean add(Product product) {
        if (product == null) {
            throw new NullPointerException("Product cannot be null.");
        }
        return products.add(product);
    }

    @Override
    public boolean contains(Product product) {
        return products.contains(product);
    }

    @Override
    public int getPrice() {
        int finalSum = 0;
        for (Product product : products) {
            finalSum = finalSum + (product.getPrice() * product.getQuantity());
        }
        return finalSum;
    }

    @Override
    public Collection<Product> getProducts() {
        return Collections.unmodifiableSet(products);
    }
}
