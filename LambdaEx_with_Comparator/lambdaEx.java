package LambdaEx_with_Comparator;

import java.util.List;
import java.util.ArrayList;
class Product
{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class lambdaEx {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"HP Laptop",25000f));
		list.add(new Product(3,"Dell keyboard",15000f));
		list.add(new Product(2,"Apple mouse",24000f));
		System.out.println("List of Product");
		for(Product p:list)
		{
			System.out.println(" "+p.id+" "+p.name+" "+p.price);
		}

	}

}
