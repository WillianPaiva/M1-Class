package ecomerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ecomerce.procducts.CatalogUserItf;

public class BasketImpl implements Basket {
    private static int COUNTER = 1;
    private final int id = COUNTER++;
    private HashMap<Integer,Integer> basketEntries = 
        new HashMap<Integer,Integer>();
    private CatalogUserItf cat;

    public BasketImpl(CatalogUserItf cat){
        this.cat = cat;
    }

    private boolean contains(int productId){
        return basketEntries.containsKey(productId);
    }
    @Override
    public void addProductInBasket(int productId, int qty) {
        if(!contains(productId)){
            basketEntries.put(productId,qty);
        } else {
            basketEntries.put(productId, basketEntries.get(productId) + qty);
        }
    }

    @Override
    public List<BasketItem> getBasketEntries() {
        List<BasketItem> l = new ArrayList<BasketItem>();
        for(Map.Entry<Integer,Integer> basketEntry : 
                basketEntries.entrySet()){
            l.add(new BasketItem(basketEntry.getKey(), basketEntry.getValue()));
                }
        return l;
    }

    @Override
    public void emptyBasket() {
        basketEntries.clear();

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getTotal() {
        double res = 0;
        for (Map.Entry<Integer,Integer> basketEntry : 
                basketEntries.entrySet()){
            res += cat.getPrice(basketEntry.getKey())* basketEntry.getValue();
                }
        return res;
    }

    @Override
    public boolean isBasckeValid() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void removeProductFromBasket(int productId) {
        if (basketEntries.remove(productId) == null){
            throw new UnsupportedOperationException("invalid Product");
        }

    }

    @Override
    public void updateQuantityProductInBasket(int productId, int qty) {
        if(!contains(productId)){
            throw new UnsupportedOperationException("Product not in the basket");
        } else {
            basketEntries.put(productId,qty);
        }
    }

    @Override
    public void validateBasket() {
        // TODO Auto-generated method stub

    }
    
    @Override
    public String toString(){
        String s = new String();
        for(Map.Entry<Integer,Integer> basketEntry :
                basketEntries.entrySet()){
            s = s.concat(cat.getDescription(basketEntry.getKey()) + ":" 
                    + cat.getPrice(basketEntry.getKey()) + "(" + 
                    basketEntry.getValue() + ")\n");
                }
        return s;
    }

}
