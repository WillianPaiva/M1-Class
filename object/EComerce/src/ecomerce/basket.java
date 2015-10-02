package ecomerce;

import java.util.TreeMap;

import ecomerce.procducts.Product;

public class basket {
    
    private TreeMap<Product,Integer> cart;
    /**
     *
     */
    public basket() {
        this.cart = new TreeMap<Product,Integer>();
    }


    public void addItem(Product o){
        addItem(o,1);
    }

    public void addItem(Product o, int a){
        if(this.cart.containsKey(o)){
            this.cart.put(o,this.cart.get(o) + a);
        }else{
            this.cart.put(o,a);
        }
    }

    public void removeItem(Product o){
        removeItem(o,1);
    } 

    public void removeItem(Product o,int a){
        if(this.cart.get(o)>a){
            this.cart.put(o,this.cart.get(o)-a);
        }else{
            this.cart.remove(o);
        }
    } 

    public double getPrice(){
        double total = 0;
        double temp = 0;
        for(Product p:this.cart.keySet()){
            temp = (this.cart.get(p)*p.getPrice());
            total = total + temp;
        }
        return total;
    }

    public void printCart(){
        for(Product p:this.cart.keySet()){
            System.out.println(p +"   quantite -->"+this.cart.get(p));
        }
    }
}
