package particle;

public class Bicycle extends Vehicle
{
	public Bicycle()
	{
		System.out.println("Create a derived class of Vehicle");
		System.out.println("Name: "+ this.getClass().getSimpleName());
	}
}
