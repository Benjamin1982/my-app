package particle;

import java.awt.EventQueue;

import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;

import controller.FlowLayoutEx;

public class MainClass
{

	private static String inp;
	public static void main(String[] args)   throws Exception 
	{
		
		 // tell jvm to do this
		 UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		        EventQueue.invokeLater(() -> 
		        {
		        	try
		        	{
		        	if(args[0]!=null)
		        	{
		        		inp = args[0];
		        	}
		        	else
		        	{
		        		inp = "MY-AG";
		        	}
		        	}
		        	catch(Exception u){
		        		// second channel;
		        		inp = "MY-AG";
		        		
		        	}
		        	finally
		        	{
		        		
		        	}
		            FlowLayoutEx ex = new FlowLayoutEx(inp);
		            ex.setVisible(true);
		        });
		    
	}

}
//cmd