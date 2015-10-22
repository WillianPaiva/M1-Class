package ecomerce;

import java.util.List;

public interface Basket {
    public void emptyBasket();
    public void addProductInBasket(int productId , int qty);
    public void updateQuantityProductInBasket(int productId, int qty);
    public void removeProductFromBasket(int productId);
    public double getTotal();
    public void validateBasket();
    public boolean isBasckeValid();
    public int getId();
    public List<BasketItem> getBasketEntries();
}
