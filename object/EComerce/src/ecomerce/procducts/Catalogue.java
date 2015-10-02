package ecomerce.procducts;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Catalogue {

    private SortedSet<Product> catalogue;

    public Catalogue() {
        this.catalogue = new TreeSet<Product>();
    }
    public void addItem(Product t) {
        this.catalogue.add(t);
    }
    protected void setCatalogue(SortedSet<Product> a){
        this.catalogue = a;
    }
    public SortedSet<Product> getList() {
        return Collections.unmodifiableSortedSet(catalogue);
    }

    public void removeProduct(Product o){
        this.catalogue.remove(o);
    }

    public void removeProductByTitle(String s){
        removeProduct(findProduct(s));
    }
    public Product findProduct(String title) {
        Iterator e = this.catalogue.iterator();
        while(e.hasNext()){
            Product temp = (Product) e.next();
            if(temp.getTitle() == title){
                return temp;
            }
        }
        return null;
    }
}
