package ecomerce;
import java.util.List;


public interface basketPrevalid {

    public void emptyBasket();
    public void reduceQuantity(int productId, int qty);
    public void removeProductFromBasket(int productId);
    public double getTotal();
    public void validateBasket();
    public boolean isBasckeValid();
    public int getId();
    public List<BasketItem> getBasketEntries();
}
