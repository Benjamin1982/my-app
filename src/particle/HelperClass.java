package particle;

public class HelperClass 
{	
	private double myFirstDouble = 5.0; // version of this class
	private double [] others = new double[7];// sum = 8 = 1 Byte
	 // no hashCode or equals();
	public final String key;
	
	
	
	public HelperClass (String key) 
	{ this.key = key; }
	   
	public double getVersion()
	{
		return myFirstDouble;
	}
	
	public String getKey()
	{
		//if key available all are assigned
		for (int i = 0 ; i < 7 ; i++)
		{
			others[i] = i;
		}
		return this.key;
	}
	public void printAllItems()
	{
		for (int x = 0 ; x < this.others.length ; x++)
		{
			System.out.println(this.others[x]);
		}
	}
	
}
