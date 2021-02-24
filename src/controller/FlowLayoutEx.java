package controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import particle.Vehicle;

import java.awt.Dimension;
import java.awt.EventQueue;

public class FlowLayoutEx extends JFrame 
{
    private String cmpyName = "IN GMBH";
	
    public FlowLayoutEx(String param) 
    {
    	cmpyName = param;
        initUI();
    }

    private void initUI() 
    {
    	//https://www.onlinetutorialspoint.com/java/how-to-add-dynamic-files-to-jtree.html
    	JPanel panel = new JPanel();
    	DefaultMutableTreeNode root, parent, child, node; // necessary!
    	TreePath tp  ;									  // necessary, too
      
    	root = new DefaultMutableTreeNode("PROFILE FOR COMPANY "+cmpyName);
    	
    	// build the tree statically:
    	parent = new DefaultMutableTreeNode("ALL_VEHICLES");

         child = new DefaultMutableTreeNode("Bike 1");
    	 child = new DefaultMutableTreeNode("Bike 11");
         parent.add(child);

         child = new DefaultMutableTreeNode("Bike 22");
         parent.add(child);
         child = new DefaultMutableTreeNode("Bike 400");
         parent.add(child);
         root.add(parent);

         parent = new DefaultMutableTreeNode("ALL_DRIVERS");

         child = new DefaultMutableTreeNode("Rick Chennai");
         parent.add(child);

         root.add(parent);
        JTree tree = new JTree(root);
       
        panel.add(tree);
        JTextArea area = new JTextArea("Check List:\n\nA bike is useful");
        area.setPreferredSize(new Dimension(360,200));
        panel.setPreferredSize(new Dimension(600, 230));

        panel.add(area);

        add(panel);

        pack();

        setTitle("                Fleet Manager Console");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

  
}