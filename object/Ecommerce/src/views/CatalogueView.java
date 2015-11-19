package views;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import ecomerce.procducts.Catalogue;
import ecomerce.procducts.Product;

public class CatalogueView extends JPanel{
    private JList<Product> list;
    private JButton t;
    public CatalogueView(){
        super(new BorderLayout() );
        DefaultListModel<Product> l = new DefaultListModel<Product>();
        for(Integer i : Catalogue.getUseItfInstance().listProduct()){
            l.addElement(Catalogue.getUseItfInstance().findProductById(i));
        }
        t = new JButton("insert");
        JLabel label = new JLabel("Catalogue");
        add(label, BorderLayout.PAGE_START);
        add(list , BorderLayout.CENTER);
        add(t, BorderLayout.PAGE_END);
    }

    public Product getSelected(){
        return list.getSelectedValue();
    }

    public void addListener(ActionListener cat){
       t.addActionListener(cat);
    }
}



