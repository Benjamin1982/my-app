package controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;

import particle.Vehicle;

import java.awt.Dimension;
import java.awt.EventQueue;

public class FlowLayoutEx extends JFrame 
{

	
    public FlowLayoutEx() 
    {
        initUI();
    }

    private void initUI() 
    {

    	JPanel panel = new JPanel();

      

        JTree tree = new JTree();
        tree.add(new Vehicle());
        panel.add(tree);

        JTextArea area = new JTextArea("Commando(s):");
        area.setPreferredSize(new Dimension(260,200));
        panel.setPreferredSize(new Dimension(400, 230));

        panel.add(area);

        add(panel);

        pack();

        setTitle("Fleet Manager Console");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

  
}