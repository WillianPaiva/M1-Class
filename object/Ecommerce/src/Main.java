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
        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        CatalogAdiminItf t = Catalogue.getAdminItfInstace();
        CatalogUserItf t2 = Catalogue.getUseItfInstance();
        t.addProductInCatalog(p);
        t.addProductInCatalog(p2);
        t.addProductInCatalog(p3);
        final Basket b = new BasketImpl(t2);
        b.addProductInBasket(p.getId(),2);
        b.addProductInBasket(p2.getId(),2);
        b.addProductInBasket(p3.getId(),2);
        final Basket b1 = new BasketImpl(t2);
        b1.addProductInBasket(p.getId(),11);
        b1.addProductInBasket(p2.getId(),17);
        b1.addProductInBasket(p3.getId(),8);

        for(int i : t2.listProduct()){
            System.out.println(t2.getTitle(i));
        }
        final EcommerceFrame view = new EcommerceFrame();
        System.out.println(b.toString());
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                ArrayList<Basket> lis = new ArrayList<Basket>();
                lis.add(b1);
                lis.add(b);
                view.createAndShowGUI(lis);
            }
        });
    }
}
