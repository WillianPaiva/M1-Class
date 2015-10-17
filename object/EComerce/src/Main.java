import java.util.Arrays;

import ecomerce.Basket;
import ecomerce.BasketImpl;
import ecomerce.procducts.CatalogAdiminItf;
import ecomerce.procducts.CatalogUserItf;
import ecomerce.procducts.Catalogue;
import ecomerce.procducts.CatalogueByPrice;
import ecomerce.procducts.Product;
import ecomerce.procducts.types.Book;
import ecomerce.procducts.types.CD;
import ecomerce.procducts.types.Game;

public class Main {
    public static void main(String[] args)
    {
        Product p = new Book("java","test",158.0,Arrays.asList("A", "B", "C"), "aasdf") ;
        Product p2 = new CD("java","test",158.0,Arrays.asList("A", "B", "C"), "aasdf") ;
        Product p3 = new Game("LOL","test",158.0,"aasdf") ;
        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        Catalogue ct = new Catalogue();
        CatalogAdiminItf t = ct.getAdminItfInstace();
        CatalogUserItf t2 = ct.getUseItfInstance();
        t.addProductInCatalog(p);
        t.addProductInCatalog(p2);
        t.addProductInCatalog(p3);

        for(int i : t2.listProduct()){
            System.out.println(t2.getTitle(i));
        }
        
        Basket b = new BasketImpl(t2);
        b.addProductInBasket(p.getId(),32);
        b.addProductInBasket(p2.getId(),32);
        b.addProductInBasket(p3.getId(),32);
        System.out.println(b.toString());
    } 
}
