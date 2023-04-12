package reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String reversString="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		
		String str= sc.next();
		
		for(int i=0;i<str.length();i++)
		{
			reversString= str.charAt(i)+reversString;
			
		}
		System.out.println(reversString);

	}

}
