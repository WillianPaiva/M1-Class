import java.util.ArrayList;
import java.util.Arrays;

import ecomerce.*;
import ecomerce.procducts.*;
import ecomerce.procducts.types.*;

import views.EcommerceFrame;

public class Main {
    public static void main(String[] args)
    {
        Product p = new Book("java","test1",158.0,Arrays.asList("A", "B", "C"), "aasdf") ;
        Product p2 = new CD("java2","test2",158.0,Arrays.asList("A", "B", "C"), "aasdf") ;
        Product p3 = new Game("LOL","test3",158.0,"aasdf") ;
        CatalogAdiminItf t = Catalogue.getAdminItfInstace();
        CatalogUserItf t2 = Catalogue.getUseItfInstance();
        t.addProductInCatalog(p);
        t.addProductInCatalog(p2);
        t.addProductInCatalog(p3);
        final Basket b = new BasketImpl(t2);

        for(int i : t2.listProduct()){
            System.out.println(t2.getTitle(i));
        }
    }
}
