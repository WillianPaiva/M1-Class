package views;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import ecomerce.procducts.Catalogue;

public class CatalogueView extends JPanel{
    public CatalogueView(){
        super( new GridLayout(1,1));
        DefaultListModel l = new DefaultListModel();
        for(Integer i : Catalogue.getUseItfInstance().listProduct()){
            l.addElement(Catalogue.getUseItfInstance().getTitle(i) + "  price  "+ 
                    Catalogue.getUseItfInstance().getPrice(i));
        }
        JList list = new JList(l);
        add(list);
    }
}
