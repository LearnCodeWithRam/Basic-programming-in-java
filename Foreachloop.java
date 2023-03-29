/*import java.util.ArrayList;
import java.util.List;

public class Foreachloop {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		 list.add("ram");
		 list.add("syam");
		 list.add("rethu");
		 list.add("divya");
		 
		 list.forEach((n)-> System.out.println(n));

	}

}*/

interface Sayable
{
	String say(String name);
}
public class Foreachloop {

	public static void main(String[] args) {// multiple statements in body
		Sayable s1 =(name)->{
			String sr1 = "hello ";
			return sr1+name;
		};
		
	
System.out.println(s1.say(" Ram "));
	}
	}