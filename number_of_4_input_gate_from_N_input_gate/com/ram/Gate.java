package com.ram;

import java.util.Scanner;

public class Gate {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of input");
		int gInp=sc.nextInt();
		int gateNumb=0;
		int finaleGateNumb=0;
		
		
		if(gInp<=4)
		{
		++finaleGateNumb;	
		}
		
		else 
		{
		while(gInp>4)
		{
		
		
		
			gateNumb= (gInp/4);
			if((gInp%4)!=0) 
			{
				gateNumb+=1;
			}
			gInp=gateNumb;
			finaleGateNumb =finaleGateNumb+gateNumb;
			
		
		if(gInp<=4)
		{
		++finaleGateNumb;	
		}
			
		}
	    }
		
	
		
    System.out.println(finaleGateNumb);
	}

}
