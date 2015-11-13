package ecomerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ecomerce.procducts.CatalogUserItf;

public class BasketImpl implements Basket, basketPrevalid {
    private static int COUNTER = 1;
    private final int id = COUNTER++;
    private HashMap<Integer,Integer> basketEntries = new HashMap<Integer,Integer>();
    private CatalogUserItf cat;
    private boolean valid;
    private BasketState state;

    public BasketImpl(CatalogUserItf cat){
        this.cat = cat;
        this.valid = false;
        this.state = new NotValidated();
    }
    @Override
    public void validate(){
            this.state = new Valid();
    }

    @Override
    public void prevalider(){
        this.state = new SemiValid();
    }


    private boolean contains(int productId){
        return basketEntries.containsKey(productId);
    }
    @Override
    public void addProductInBasket(int productId, int qty) {
        state.addProductInBasket(productId, qty, basketEntries);
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
        state.emptyBasket(basketEntries);
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
        return this.valid;
    }

    @Override
    public void removeProductFromBasket(int productId) {
        state.removeProductFromBasket( productId, basketEntries);

    }

    @Override
    public void updateQuantityProductInBasket(int productId, int qty) {
        state.updateQuantityProductInBasket(productId, qty, basketEntries);
    }

    @Override
    public void validateBasket() {
        this.valid = true;
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
