package particle;

public class Car extends Vehicle
{
	public Car()
	{
		System.out.println("Create a derived class of Vehicle");
		System.out.println("Name: "+ this.getClass().getSimpleName());
		
	}
}
