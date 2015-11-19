package ecomerce;

import java.util.HashMap;

public class Valid implements BasketState {


    @Override
    public void addProductInBasket(int productId, int qty , HashMap<Integer,Integer> basketEntries)  {
        throw new UnsupportedOperationException("not allowed");
    }


    @Override
    public void removeProductFromBasket(int productId,HashMap<Integer,Integer> basketEntries) {
        throw new UnsupportedOperationException("not allowed");
    }


    @Override
    public void updateQuantityProductInBasket(int productId, int qty,HashMap<Integer,Integer> basketEntries) {
        throw new UnsupportedOperationException("not allowed");
    }

    @Override
    public void emptyBasket(HashMap<Integer,Integer> basketEntries) {
        throw new UnsupportedOperationException("not allowed");
    }

    @Override
    public boolean isvalid(){
        return true;
    }

    @Override
    public boolean isprevalid(){
        return false;
    }

    @Override
    public BasketState validate(){
        return this;
    }

    @Override
    public BasketState prevalidate(){
        return new SemiValid();
    }

}
