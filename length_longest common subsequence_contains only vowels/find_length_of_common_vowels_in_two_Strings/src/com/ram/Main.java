package com.ram;

import java.util.Scanner;

public class Main {
	
	static char ch='b';
	public static boolean vowels(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		         return true;
		return false;
	}
	

	public static int LCS(StringBuilder str1,StringBuilder str2,int x,int y)
	{
		int count=0;
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				if(str1.charAt(i)==str2.charAt(j)&& vowels(str1.charAt(i)))
				{
					
                    str1.setCharAt(i,ch);
                    str2.setCharAt(j,ch);
                  
					count+=1;
				}
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int x,y=0;

System.out.println("Enter string one");
StringBuilder str1 = new StringBuilder(sc.next());

//str1=str1.toLowerCase();
x= str1.length();

System.out.println("Enter string two");
StringBuilder str2 = new StringBuilder(sc.next());
//str2=str2.toLowerCase();
y=str2.length();

System.out.println(LCS(str1,str2,x,y));


	}

}
