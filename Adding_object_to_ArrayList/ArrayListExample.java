package Adding_object_to_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args)
	{
		ArrayList<Car> list = new ArrayList<Car>();
		
		list.add(new Car("TAYOTA", 25));
		list.add(new Car("SUV", 29));
		list.add(new Car("TATA",35));
		list.add(new Car("OD", 55));
		
		System.out.println("Name:  Miles");
		for(Car car:list) 
		{
			car.printDetails();
		}




	}

}
class Car
{
	public String name;
	public int miles;
	public Car(String name,int miles)
	{
		super();
		this.name=name;
		this.miles=miles;
	}
	public Car()
	{
		super();
	}

	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
}
	public int getMiles()
	{
		return this.miles;
	}
	public void setMiles()
	{
		this.miles=miles;
	}
	
	public void printDetails()
	{
		System.out.println(""+name+" "+miles);
	}
}