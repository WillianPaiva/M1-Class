package views;

import java.awt.GridLayout;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

import ecomerce.Basket;
import ecomerce.BasketItem;
import ecomerce.procducts.Catalogue;


public class SallesPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1656323725239244641L;

	public SallesPanel(List<Basket> titles){

        super(new GridLayout(1 , 1));
        JTabbedPane tabbedPane =  new JTabbedPane();
        for(Basket s : titles){
            JPanel x = new JPanel(new GridLayout(0,3));
            Iterator<BasketItem> it = s.getBasketEntries().iterator();
            while(it.hasNext()){
                BasketItem i = it.next();
                JLabel name = new JLabel(
                        Catalogue.getUseItfInstance().getTitle(i.getProductId()));
                
                JFormattedTextField qty = new JFormattedTextField(
                        new Double(i.getQuantity()));
                JLabel total = new JLabel(" "+
                        Catalogue.getUseItfInstance()
                        .getPrice(i.getProductId())*i.getQuantity() +" €");
                x.add(name);
                x.add(qty);
                x.add(total);
               }

                JButton command = new JButton("Command");
                x.add(command);
            tabbedPane.addTab("Basket #"+s.getId(),null,x,null);
            


        }
        add(tabbedPane);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
}
