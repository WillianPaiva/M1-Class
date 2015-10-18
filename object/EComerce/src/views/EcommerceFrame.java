package views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.*;

public class EcommerceFrame {
    public void createAndShowGUI(){
        /*create a frame */
        JFrame frame = new JFrame("CatalogView");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SallesPanel(Arrays.asList("tab1","tab2")),BorderLayout.CENTER);

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
