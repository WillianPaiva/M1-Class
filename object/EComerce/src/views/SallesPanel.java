package views;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.*;

public class SallesPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1656323725239244641L;

	public SallesPanel(List<String> titles){
        super(new GridLayout(1 , 1));
        JTabbedPane tabbedPane =  new JTabbedPane();
        for(String s : titles){
            tabbedPane.addTab(s,null,new JPanel( new GridLayout(1,1)),null);

        }
        add(tabbedPane);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
}
