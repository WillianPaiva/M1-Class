package ecomerce;

import java.util.HashMap;

public interface  BasketState {

    public void addProductInBasket(int productId, int qty , HashMap<Integer,Integer> basketEntries);


    public void removeProductFromBasket(int productId,HashMap<Integer,Integer> basketEntries);

    public void updateQuantityProductInBasket(int productId, int qty,HashMap<Integer,Integer> basketEntries);

    public void emptyBasket(HashMap<Integer,Integer> basketEntries);

    public boolean isvalid();

    public boolean isprevalid();

    public void validate();

    public void prevalidate();
}
