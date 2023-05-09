package com.ram;

import java.util.ArrayList;
import java.util.List;

class Product
{
int id;
String name;
float price;

public Product(int id,String name, float price)
{
this.id=id;
this.name=name;
this.price=price;
}
}
public class JavaStreamExample {

	public static void main(String[] args)
	{
	
List<Product> productlist = new ArrayList<Product>();

productlist.add(new Product(1,"soap",45f));
productlist.add(new Product(2,"hair oil",48f));
productlist.add(new Product(3,"sampoo",50f));
productlist.add(new Product(4,"face cream",55f));
productlist.add(new Product(5,"hand wash",70f));
List<Float> productpricelist = new ArrayList<Float>();
for(Product pd:productlist )
{
	if(pd.price>=48)
	{
		productpricelist.add(pd.price);	
	}
	
	}
System.out.println(productpricelist);

	}

}
