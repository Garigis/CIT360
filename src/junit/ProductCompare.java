package junit;

import java.util.HashMap;

/**
 * Created by colbycooley on 5/25/16.
 */
public class ProductCompare {

    private HashMap<String, Product> products;



    public ProductCompare() {
        products = new HashMap<String, Product>();
    }

    public int ProductCompareSize() {
        int product = products.size();
        return product;
    }

    public void addProduct(Product product) {
        String key = product.getItemName() + ", " + product.getStoreName();
        products.put(key, product);
    }

    public int[] addingProduct() {
        int[] intArray = new int[10];
        int i = intArray[20];
        return intArray;
    }
}

