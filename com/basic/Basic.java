package com.basic;

import java.util.Scanner;

public class Basic 
{
	static Scanner sc= new Scanner(System.in);

	static void calculatorOperatons()
	{
		System.out.println("Enter x value: ");
		float x= sc.nextFloat();
		System.out.println("Enter y value: ");
		float y= sc.nextFloat();
		
//		calculator operations:-> 
		float add, sub, mul, divide, modulus, sq_root;

		try {
			
			add= x+y;
			sub= x-y;
			mul= x*y;
			
			try {
				divide= x/y;
			}catch(Exception e)
			{
				System.out.println(e+" divisor can't be zero.... choose another number!");
				int z= sc.nextInt();			
				divide= x/z;
			}

			try {
				modulus= x%y;
			}catch(Exception e)
			{
				System.out.println(e+" divisor can't be zero.... choose another number!");
				float z= sc.nextInt();			
				modulus= x%z;
			}
			
			sq_root=  (float) Math.sqrt(x);
			
			System.out.println("Addition of Two numbers: "+add);
			System.out.println("Difference of Two numbers: "+sub);
			System.out.println("Product of Two numbers: "+mul);
			System.out.println("Divide : "+divide);
			System.out.println("Modulus : "+modulus);
			System.out.println("Square_Root of "+x+" "+sq_root);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}		
	}
	
	public void printsWeekMonthYear()
	{
		System.out.println("Enter Day's to cal");
		int day= sc.nextInt();
		
		int year, month, week;
		
		try {
			year= day/365;
			month= day/30;
			week= day/7;
			
			System.out.println(year+"  "+month+"  "+week);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	public void calculatePower()
	{
		System.out.println("Enter base : ");
		int base= sc.nextInt();
		System.out.println("Enter Exponant: ");
		int expo= sc.nextInt();
		
		int f=1;
		
		for(int i=1;i<=expo;i++)
		{
			f*=base;
		}
		System.out.println("power of "+base+" is:-> "+f);
	}
	
	public void enter5SubMarks()
	{
		System.out.println("Math Marks: ");
		float math= sc.nextFloat();
		System.out.println("Hindi Marks: ");
		float hindi= sc.nextFloat();
		System.out.println("Science Marks: ");
		float sci= sc.nextFloat();
		System.out.println("Physics Marks: ");
		float phy= sc.nextFloat();
		System.out.println("Chemistry Marks: ");
		float chem= sc.nextFloat();
		
		System.out.println("outOf : ");
		float outOf= sc.nextFloat();

		float total, average, percentage;
		
		try {
			int count=1;
			if(math<33 || hindi<33 || sci<33 || phy<33 || chem<33)
			{
				count++;
			}else {
				total= math+hindi+sci+phy+chem;
			
				average= total/5;
				
				percentage= (total*100)/outOf;
				
				System.out.println("Total_Marks: "+total);
				System.out.println("Average_Marks: "+average);
				System.out.println("calculated_Percentage: "+percentage);
			}
			if(count>2)
			{
				System.out.println("student is fail to pass test.. work hard! see you soon");
			}else {
				System.out.println("congrates! you crossed one more level ");
			}	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void simpleInterest()
	{
		System.out.println("Enter Principle_Amount: ");
		float p= sc.nextFloat();
		System.out.println("Enter Rate_of_Interset: ");
		float r= sc.nextFloat();
		System.out.println("Enter Time_Taken: ");
		float t= sc.nextFloat();
		
		float si= (p*r*t)/100;
		System.out.println("Simple Interset: "+si);
	}
	
	public void compoundInterset()
	{
		System.out.println("Enter Principle_Amount: ");
		float p= sc.nextFloat();
		System.out.println("Enter Rate_of_Interset: ");
		float r= sc.nextFloat();
		System.out.println("Enter Time_Taken: ");
		float t= sc.nextFloat();
		
		float n=100;
		
		float ci= (float) (p* (Math.pow((1+r/n), t))); 
		System.out.println("Compound_Interset: "+ci);
	}
	
	public void display()
	{
//		calculatorOperatons();
//		printsWeekMonthYear();
//		calculatePower();
//		enter5SubMarks();
//		simpleInterest();
		compoundInterset();
	}
	
	public static void main(String[] args) 
	{
		new Basic().display();
	}	
}
