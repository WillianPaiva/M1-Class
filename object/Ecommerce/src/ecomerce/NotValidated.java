package ecomerce;

import java.util.HashMap;

public class NotValidated implements BasketState {


    @Override
    public void addProductInBasket(int productId, int qty , HashMap<Integer,Integer> basketEntries)  {
        if(!basketEntries.containsKey(productId)){
            basketEntries.put(productId,qty);
        } else {
            basketEntries.put(productId, basketEntries.get(productId) + qty);
        }
    }


    @Override
    public void removeProductFromBasket(int productId,HashMap<Integer,Integer> basketEntries) {
        if (basketEntries.remove(productId) == null){
            throw new UnsupportedOperationException("invalid Product");
        }

    }


    @Override
    public void updateQuantityProductInBasket(int productId, int qty,HashMap<Integer,Integer> basketEntries) {
        if(!basketEntries.containsKey(productId)){
            throw new UnsupportedOperationException("Product not in the basket");
        } else {
            basketEntries.put(productId,qty);
        }
    }

    @Override
    public void emptyBasket(HashMap<Integer,Integer> basketEntries) {
        basketEntries.clear();
    }

}
