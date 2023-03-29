//implementing inteface W\O LambdaExpressoin
/*interface Drawable
{

	public void draw();
}
public class LambdaExpression
{
public static void main(String[] args) 
{
	String name ="LambdaEx";	
Drawable d1= new Drawable(){//without lambda,Drawable implementation of interface by using of Anonymous class
	public void draw() 
	{
		System.out.println("Function = "+name);
	}
};
 
d1.draw();
}

}*/
//---------------------------------------------------------------------------------------------------------------------
 /*  //implement the above example with the help of Java lambda expression with no arguments.

interface Drawable
{

	public String draw();
}
public class LambdaExpression
{
public static void main(String[] args) 
{
	String name ="LambdaEx";	
Drawable d1= ()->
{
	//System.out.println("Function = "+name);
	return ""+name;
};
 
//d1.draw();
System.out.println(d1.draw());
}

}*/
//------------------------------------------------------------------------------------------------------------

//__________________________________----------------------------------------------------------------
/*interface Drawable
{

	public String draw(String s);
}
public class LambdaExpression
{
public static void main(String[] args) 
{
	String name1 ="LambdaEx";	
Drawable d1= (name)->
{
	//System.out.println("Function = "+name);
	return ""+name;
};
 
//d1.draw();
System.out.println(d1.draw("Lambda"));
}
}
*/
//---------------------------------------------------------------------------------------------------------
@FunctionalInterface//its optional
interface Drawable
{

public int add(int a, int b);
}
public class LambdaExpression
{
public static void main(String[] args) 
{
	
Drawable d1= (a,b)->(a+b);
Drawable d2= (int a,int b)->(a+b);
Drawable d3= (int a,int b)->
{
return (a+b);
};

//System.out.println("Function = "+name);
//return ""+name;
	
//d1.draw();
System.out.println(d1.add(15,20));
System.out.println(d2.add(150,200));
System.out.println(d3.add(150,200));
}
}


