package se.terhol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPart1 {
    @Test
    public void testProductEquals() {
        Product p1;
        Product p2;

        p1 = new Product("A", 1);
        assertFalse(p1.equals(null), "Produkt a null nemohou byt stejne.");
        assertFalse(p1.equals(new Object()), "Produkt a obecny objekt musi byt ruzne.");

        p1 = new Product("A", 1);
        p2 = new Product("B", 1);
        assertFalse(p1.equals(p2), "Produkty s ruznymi nazvy musi byt ruzne.");
        assertFalse(p2.equals(p1), "Produkty s ruznymi nazvy musi byt ruzne.");

        p1 = new Product("A", 1);
        p2 = new Product("A", 2);
        assertFalse(p1.equals(p2), "Produkty s ruznou cenou musi byt ruzne.");
        assertFalse(p2.equals(p1), "Produkty s ruznou cenou musi byt ruzne.");

        p1 = new Product("A", 1);
        p2 = new Product("A", 1);
        p1.setQuantity(2);
        assertTrue(p1.equals(p2), "Produkty se stejnym nazvem a cenou musi byt stejne.");
        assertTrue(p2.equals(p1), "Produkty se stejnym nazvem a cenou musi byt stejne.");
    }

    @Test
    public void testProductHashCode() {
        Product p1 = new Product("A", 1);
        Product p2 = new Product("A", 1);

        assertEquals(p1.hashCode(), p2.hashCode(), "hashCode() produktu vraci pro stejne produkty ruznou hodnotu.");
        p2.setQuantity(100);
        assertEquals(p1.hashCode(), p2.hashCode(), "hashCode() produktu vraci pro stejne produkty ruznou hodnotu.");
    }

    @Test
    public void testShoppingCartAdd() {
        ShoppingCart cart = new ShoppingCartImpl();
        Product p1 = new Product("A", 1);
        Product p2 = new Product("B", 1);

        try {
            cart.add(null);
            fail("Nakupni kosik musi pri pridani null polozky vyhodit vyjimku.");
        } catch (NullPointerException e) {
        } catch (Exception e) {
            fail("Nakupni kosik pri pridani null polozky vyhodil spatnou vyjimku: " + e.getClass().getName());
        }

        assertTrue(cart.add(p1), "Pridani polozky do prazdneho kosiku musi vratit true.");
        assertFalse(cart.add(p1), "Pridani polozky, ktera uz v kosiku je, musi vratit false.");
        assertTrue(cart.add(p2), "Pridani polozky, ktera jeste v kosiku neni, musi vratit true.");
    }

    @Test
    public void testShoppingCartContains() {
        ShoppingCart cart = new ShoppingCartImpl();
        Product p1 = new Product("A", 1);
        Product p2 = new Product("B", 1);

        assertFalse(cart.contains(null), "Nakupni kosik hlasi, ze obsahuje null polozku.");
        assertFalse(cart.contains(p1), "Prazdny nakupni kosik hlasi, ze obsahuje polozku.");
        cart.add(p1);
        assertFalse(cart.contains(p2), "Nakupni kosik hlasi, ze obsahuje polozku, kterou by ale obsahovat nemel.");
        assertTrue(cart.contains(p1), "Nakupni kosik hlasi, ze neobsahuje polozku, kterou by ale obsahovat mel.");
    }

    @Test
    public void testShoppingCartGetPrice() {
        ShoppingCart cart = new ShoppingCartImpl();
        assertEquals(0, cart.getPrice(), "Cena produktu v prazdnem kosku musi byt 0.");
        Product[] products = new Product[]{new Product("A", 1), new Product("B", 2), new Product("C", 3), new Product("D", 4)};
        int expectedPrice = 0;
        int counter = 1;
        for (Product p : products) {
            p.setQuantity(counter);
            counter++;
            expectedPrice += p.getPrice() * p.getQuantity();
            cart.add(p);
        }
        assertEquals(expectedPrice, cart.getPrice(), "Cena produktu v kosiku neodpovida mnozstvi a cene techto produktu.");
    }

    @Test
    public void testShoppingCartGetProducts() {
        ShoppingCart cart = new ShoppingCartImpl();
        Product[] products = new Product[]{new Product("A", 1), new Product("B", 1), new Product("C", 1), new Product("D", 1)};
        for (Product p : products) {
            cart.add(p);
        }
        for (Product p : products) {
            cart.add(p);
        }

        assertEquals(products.length, cart.getProducts().size(), "Kosik obsahuje jiny pocet polozek nez byl do nej vlozen.");

        try {
            cart.getProducts().add(new Product("E", 1));
            fail("getProducts() vraci modifikovatelnou kolekci.");
        } catch (UnsupportedOperationException e) {
        }
    }
}
