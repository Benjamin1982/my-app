package particle;

public class MainClass
{

	public static void main(String[] args)
	{
		 HelperClass hc =new HelperClass("thomas cook"); // why not static 
		 System.out.println(hc.getKey());
		 System.out.print	("Show me the mark: ");
		 System.out.println (hc.getVersion());
		 hc.printAllItems();
		 
		 
		 Vehicle cart1 = new Vehicle();
		 Bicycle cart2 = new Bicycle(); 
	}

}
//cmd