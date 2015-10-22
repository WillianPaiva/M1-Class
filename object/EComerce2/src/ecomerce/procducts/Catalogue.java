package ecomerce.procducts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Catalogue implements CatalogUserItf , CatalogAdiminItf {

    private static volatile Catalogue instance = null;
    private SortedSet<Product> catalogue;

    public Catalogue() {
        this.catalogue = new TreeSet<Product>();
    }
    public final static CatalogUserItf getUseItfInstance(){
        if(Catalogue.instance == null){
            synchronized (Catalogue.class){
                if(Catalogue.instance == null){
                    Catalogue.instance = new Catalogue();
                }
            }
        }
        return Catalogue.instance;
    }

    public final static CatalogAdiminItf getAdminItfInstace(){
        if(Catalogue.instance == null){
            synchronized (Catalogue.class){
                if(Catalogue.instance == null){
                    Catalogue.instance = new Catalogue();
                }
            }
        }
        return Catalogue.instance;
    }

    @Override
    public List<Integer> listProduct(){
        ArrayList<Integer> p = new ArrayList<Integer>();
        for (Product x : catalogue){
            p.add(x.getId());
        }
        return p;
    }

    @Override
    public int addProductInCatalog(Product t) {
        this.catalogue.add(t);
        return t.getId();
    }
    
    @Override
    public void removeProductInCatalog(int productId){
        removeProduct(findProductById(productId));
    }

    @Override
    public double getPrice(int productId){
        return findProductById(productId).getPrice();
    }

    @Override
    public String getDescription(int productId){
        return findProductById(productId).getDescrption();
    }


    @Override
    public String getTitle(int productId){
        return findProductById(productId).getTitle();
    }

    @Override
    public List<Integer> findProductByType(String type){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(Product p : catalogue){
            if(p.getType().equals(type)){
                res.add(p.getId());
            }
        }
        return res;
    }


    @Override
    public List<Integer> listProductByIcreasingPrice(){
        TreeSet<Product> t = new TreeSet<Product>(new ProdCompPrice());
        t.addAll(catalogue);
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(Product p : t){
            res.add(p.getId());
        }
        return res;
    }

    protected void setCatalogue(SortedSet<Product> a){
        this.catalogue = a;
    }
    public SortedSet<Product> getList() {
        return Collections.unmodifiableSortedSet(catalogue);
    }

    private void removeProduct(Product o){
        this.catalogue.remove(o);
    }


    public Product findProductById(int id) {
        Iterator<Product> e = this.catalogue.iterator();
        while(e.hasNext()){
            Product temp = e.next();
            if(temp.getId() == id){
                return temp;
            }
        }
        return null;
    }
}
