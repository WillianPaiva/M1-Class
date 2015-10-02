package ecomerce.procducts;
import java.util.TreeSet;

public class CatalogueByPrice extends Catalogue{

    public CatalogueByPrice() {
        super.setCatalogue(new TreeSet<Product>(new ProdCompPrice()));    
    }

}
