package junit;


/**
 * Created by colbycooley on 5/25/16.
 */
public class Product {

    // Declare variables
    String itemName;
    Double price;
    String storeName;

    public Product(String itemName, Double price, String storeName) {
        this.itemName = itemName;
        this.price = price;
        this.storeName = storeName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

}
