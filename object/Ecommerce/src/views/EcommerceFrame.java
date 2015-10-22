package views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

import ecomerce.Basket;

public class EcommerceFrame {
    public void createAndShowGUI(List<Basket> t){
        /*create a frame */
        JFrame frame = new JFrame("CatalogView");
        frame.setLayout(new GridLayout(0,2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SallesPanel(t));
        frame.add(new CatalogueView());

        frame.pack();
        frame.setVisible(true);
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
