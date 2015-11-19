package ecomerce;

import java.util.HashMap;

public class SemiValid implements BasketState {


    @Override
    public void addProductInBasket(int productId, int qty , HashMap<Integer,Integer> basketEntries)  {
        throw new UnsupportedOperationException("not allowed");
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

    @Override
    public boolean isvalid(){
        return false;
    }

    @Override
    public boolean isprevalid(){
        return true;
    }

    @Override
    public BasketState validate(){
        return new Valid();
    }

    @Override
    public BasketState prevalidate(){
        return this;
    }

}
