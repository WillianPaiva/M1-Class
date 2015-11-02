package views;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import ecomerce.procducts.Catalogue;

public class CatalogueView extends JPanel{
    private JList list;
    public CatalogueView(){
        super(new BorderLayout() );
        DefaultListModel l = new DefaultListModel();
        for(Integer i : Catalogue.getUseItfInstance().listProduct()){
            l.addElement(Catalogue.getUseItfInstance().findProductById(i));
        }
        list = new JList(l);
        JLabel label = new JLabel("Catalogue");
        add(label, BorderLayout.PAGE_START);
        add(list , BorderLayout.CENTER);
    }
}



