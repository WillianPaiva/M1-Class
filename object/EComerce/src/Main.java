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
        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
       
        CatalogAdiminItf t = Catalogue.getAdminItfInstace();
        CatalogUserItf t2 = Catalogue.getUseItfInstance();
        t.addProductInCatalog(p);
        t.addProductInCatalog(p2);
        t.addProductInCatalog(p3);

        for(int i : t2.listProduct()){
            System.out.println(t2.getTitle(i));
        }
        EcommerceFrame view = new EcommerceFrame();        
        Basket b = new BasketImpl(t2);
        b.addProductInBasket(p.getId(),32);
        b.addProductInBasket(p2.getId(),32);
        b.addProductInBasket(p3.getId(),32);
        System.out.println(b.toString());
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                view.createAndShowGUI();
            }
        });
    } 
}
