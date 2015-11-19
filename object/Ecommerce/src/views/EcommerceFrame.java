package views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

import ecomerce.Basket;

public class EcommerceFrame extends JFrame{
    public void createAndShowGUI(List<Basket> t){
        /*create a this */
        this.setLayout(new GridLayout(0,2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new SallesPanel(t));
        this.add(new CatalogueView());

        this.pack();
        this.setVisible(true);
    }

    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

}
