package particle;

import java.awt.EventQueue;

import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;

import controller.FlowLayoutEx;

public class MainClass
{

	public static void main(String[] args)   throws Exception 
	{
		 HelperClass hc =new HelperClass("Some test output here .."); // why not static 
		 System.out.println(hc.getKey());
		 System.out.print	("Show me the mark: ");
		 System.out.println (hc.getVersion());
		 hc.printAllItems();
		 
		 
		 Vehicle cart1 = new Vehicle();
		 Bicycle cart2 = new Bicycle(); 
		 Car     cart3 = new Car();
		 // tell jvm to do this
		 UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		        EventQueue.invokeLater(() -> 
		        {
		            FlowLayoutEx ex = new FlowLayoutEx();
		            ex.setVisible(true);
		        });
		    
	}

}
//cmd