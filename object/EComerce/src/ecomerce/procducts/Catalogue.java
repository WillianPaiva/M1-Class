package ecomerce.procducts;

import java.util.TreeSet;

public class Catalogue {

    private TreeSet<Product> catalogue;

    public Catalogue() { 
        this.catalogue = new TreeSet<Product>();
    }

    public void addItem(Product t){
        this.catalogue.add(t);
    }

    public TreeSet<Product> findProduct(int type){

    }
    
    public TreeSet<Product> findProduct(double price){

    }

    public Product findProduct(String title){

    }


}
