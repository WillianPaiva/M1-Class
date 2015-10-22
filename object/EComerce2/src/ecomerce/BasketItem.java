package ecomerce;

public class BasketItem {
    private int productId;
    private int quantity;
    public BasketItem(int productId , int quantity){
        this.productId = productId;
        this.quantity = quantity;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }


    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

}
