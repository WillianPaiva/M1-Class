package ecomerce.procducts;
import java.util.Iterator;
import java.util.TreeSet;

public class Catalogue {

    private TreeSet<Product> catalogue;

    public Catalogue() {
        this.catalogue = new TreeSet<Product>();
    }
    public void addItem(Product t) {
        this.catalogue.add(t);
    }
    protected void setCatalogue(TreeSet a){
        this.catalogue = a;
    }
    public TreeSet<Product> getList() {
        return this.catalogue;
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
