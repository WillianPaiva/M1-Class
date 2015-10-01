package ecomerce.procducts;
import java.util.TreeSet;

public class CatalogueByPrice extends Catalogue{

    public CatalogueByPrice() {
        super();    
    }
    @Override
    public TreeSet<Product> getList(){
        TreeSet<Product> ts = new TreeSet<Product>(new ProdCompPrice()) ;
        ts.addAll(super.getList());
        return ts;
    }

}
