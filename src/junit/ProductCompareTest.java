package junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by colbycooley on 5/25/16.
 */
public class ProductCompareTest {

    ProductCompare aProductCompare;
    ProductCompare bProductCompare;
    ProductCompare cProductCompare;
    Product one, two, three, four, five;

    @Before
    // Adding Products from ProductCompare.java
    public void setUp() throws Exception {
        one = new Product("Thin Mints", 1.00, "Girl Scouts");
        two = new Product("Cookies", 1.25, "Wal-mart");
        three = new Product("Cookies", 1.50, "Target");
        four = new Product("Cookies", 1.75, "Smiths");
        five = new Product("Cookies", 2.00, "Albertsons");
    }

    // Test that adds to a collection in a different method
    // This has assertEquals
    @Test
    public void testEqauls() {
        aProductCompare = new ProductCompare();
        aProductCompare.addProduct(one);
        int numProducts = aProductCompare.ProductCompareSize();
        assertEquals(1, numProducts);

        aProductCompare.addProduct(two);
        aProductCompare.addProduct(three);
        aProductCompare.addProduct(four);
        numProducts = aProductCompare.ProductCompareSize();
        assertEquals(4, numProducts);

        // This is supposed to fail.
        assertEquals(3, numProducts);
    }

    @Test
    public void testNotEquals() {
        // Tests whether aProductCompare and bProduct compare are the same, when first making new products.
        aProductCompare = new ProductCompare();
        bProductCompare = new ProductCompare();
        assertNotEquals(aProductCompare, bProductCompare);

        // Sets cProductCompare to equal aProductCompare and tests to see if they are not the same.
        cProductCompare = aProductCompare;
        assertNotEquals(aProductCompare, cProductCompare);
    }

    @Test
    public void testTrue() {
        // Adding items to aProductCompare, then testing the size of hashmap that there are > 0 items in it.
        aProductCompare = new ProductCompare();
        aProductCompare.addProduct(two);
        aProductCompare.addProduct(three);
        aProductCompare.addProduct(four);
        int numProducts = aProductCompare.ProductCompareSize();
        assertTrue(numProducts > 0);

        // This is supposed to fail
        assertTrue(numProducts == 5);
    }

    @Test
    public void testFalse() {
        // Adding items to aProductCompare and using assertFalse
        aProductCompare = new ProductCompare();
        aProductCompare.addProduct(two);
        aProductCompare.addProduct(three);
        aProductCompare.addProduct(four);
        int numProducts = aProductCompare.ProductCompareSize();
        assertFalse(numProducts == 0);

        // This is supposed to fail
        assertFalse(numProducts >= 3);
    }

    @Test
    public void testSame() {
        aProductCompare = new ProductCompare();
        bProductCompare = new ProductCompare();
        aProductCompare.addProduct(one);
        aProductCompare.addProduct(two);
        bProductCompare.addProduct(three);

        // This will fail
        assertSame(aProductCompare, bProductCompare);

        // This passes because cProductCompare and aProductCompare refer to the same object. The reason in this case is
        // because cProductCompare is a copy of aProductCompare.
        cProductCompare = aProductCompare;
        assertSame(aProductCompare, cProductCompare);
    }

    @Test
    public void testNotSame() {
        aProductCompare = new ProductCompare();
        bProductCompare = new ProductCompare();
        aProductCompare.addProduct(one);
        aProductCompare.addProduct(two);
        bProductCompare.addProduct(three);

        // This will pass
        assertNotSame(aProductCompare, bProductCompare);
        assertNotSame("Hello World", "hello world");

        // This will fail
        cProductCompare = bProductCompare;
        assertNotSame(cProductCompare, bProductCompare);
        assertNotSame("Hi", "Hey");
    }

    // write class to see if method throws exception
    @Test(expected = IndexOutOfBoundsException.class)
    public void TestException() {
        aProductCompare = new ProductCompare();
        aProductCompare.addingProduct();

    }

    @Test
    public void AnotherExceptionTest() {
        try{
            aProductCompare = new ProductCompare();
            aProductCompare.addingProduct();
            fail("Should throw IndexOutOfBoundsException");
        }
        catch (Exception e) {

        }
    }
}
