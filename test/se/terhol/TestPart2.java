package se.terhol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Jan Papousek
 */
public class TestPart2 {
    /*
    private static Product[] products;
    private static Customer[] customers;
    private static Shop shop;

    @BeforeEach
    public void setUp() {
        products = new Product[]{
                new Product("A", 1),
                new Product("B", 2),
                new Product("C", 3),
                new Product("D", 4),
                new Product("E", 4),
                new Product("F", 4),
        };
        customers = new Customer[]{
                new Customer("A"),
                new Customer("B")
        };
        shop = new ShopImpl();
    }

    @Test
    public void testCustomerEquals() {
        Customer c1 = new Customer("A");
        Customer c2 = new Customer("A");
        Customer c3 = new Customer("B");

        assertFalse(c1.equals(null), "Zakaznik nesmi byt stejny jako null.");
        assertFalse(c1.equals(c3), "Zakaznini s ruznymi jmeny nesmi byt stejni.");
        assertTrue(c1.equals(c2), "Zakaznini se stejnymi jmeny musi byt stejni.");
    }

    @Test
    public void testHashCode() {
        Customer c1 = new Customer("A");
        Customer c2 = new Customer("A");

        assertEquals(c1.hashCode(), c2.hashCode(), "Zakaznici se stejnymi jmeny musi mit stejny hash code.");
    }

    @Test
    public void testShopAddNull() {
        try {
            shop.addProductToBuy(null, new Product("A", 1));
            fail("Pri vkladani produktu k null zakaznikovi nebyla vyhozena vyjimka.");
        } catch (NullPointerException e) {
        } catch (Exception e) {
            fail("Pri vkladani produktu k null zakaznikovi byla vyhozena neocekavana vyjimka " + e.getClass().getName());
        }

        try {
            shop.addProductToBuy(new Customer("A"), null);
            fail("Pri vkladani null produktu nebyla vyhozena vyjimka.");
        } catch (NullPointerException e) {
        } catch (Exception e) {
            fail("Pri vkladani null produktu byla vyhozena neocekavana vyjimka " + e.getClass().getName());
        }
    }

    @Test
    public void testShopBuyNull() {
        try {
            shop.buy(null);
            fail("Pri nakupu null zakaznika nebyla vyhozena vyjimka.");
        } catch (NullPointerException e) {
        } catch (Exception e) {
            fail("Pri nakupu null zakaznika byla vyhozena neocekavana vyjimka " + e.getClass().getName());
        }
    }

    @Test
    public void testShopGetProductsToBuyNull() {
        try {
            shop.getProductsToBuy(null);
            fail("Pri navratu produktu null zakaznika nebyla vyhozena vyjimka.");
        } catch (NullPointerException e) {
        } catch (Exception e) {
            fail("Pri navratu produktu null zakaznika byla vyhozena neocekavana vyjimka " + e.getClass().getName());
        }
    }

    @Test
    public void testCommonUsing() {
        int expectedPrice = 4;

        int i = 0;
        for (Customer c : customers) {
            shop.addProductToBuy(c, products[i * 2]);
            shop.addProductToBuy(c, products[i * 2]);
            shop.addProductToBuy(c, products[i * 2 + 1]);
            i++;
        }

        assertEquals(customers.length, shop.getActiveCustomers().size(), "Pocet aktivnich zakazniku neodpovida");
        for (Customer c : customers) {
            assertTrue(shop.getActiveCustomers().contains(c), "Mezi aktivnimi zakazniky neni zakaznik, ktery by mezi nimi mel byt.");
        }
        assertNull(shop.getProductsToBuy(new Customer("AAAA")), "Metoda getProductsToBuy() musi vratit pro neaktivniho zakaznika null.");
        assertEquals(2, shop.getProductsToBuy(customers[0]).size(), "Pocet polozek v kosiku zakaznika neodpovida.");
        assertEquals(expectedPrice, shop.buy(customers[0]), "Cena nakoupeneho zbozi zakaznika neodpovida.");
        assertFalse(shop.getActiveCustomers().contains(customers[0]), "Zakaznik nebyl po nakupu vyrazen z aktivnih zakazniku");
    }
    */
}
