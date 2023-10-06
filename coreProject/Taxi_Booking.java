package com.coreProject;

import java.util.Scanner;

public class Taxi_Booking 
{
	private int count, trip, start, end, totalDistance;
	private float perKmCharge;
	Scanner sc;
	public Taxi_Booking() {
		sc = new Scanner(System.in);
	}
	
	public void fourSeater()
	{
		System.out.println("Enter charge per km : ");
		perKmCharge = sc.nextFloat();
		System.out.println("Enter the count of trips : ");
		count = sc.nextInt();
		System.out.println("Enter the starting km of the trip : ");
		start = sc.nextInt();
		System.out.println("Enter the closing km of the trip : ");
		end = sc.nextInt();
		
		totalDistance = end-start;
		
		System.out.println("Total trip count's : "+count);
		System.out.println("Total Km Driven Today : "+totalDistance);
		
		perKmCharge *= totalDistance;
		System.out.println("Total Charge : "+perKmCharge);
	}
	
	public void sevenSeater()
	{
		System.out.println("Enter charge per km : ");
		perKmCharge = sc.nextFloat();
		System.out.println("Enter the count of trips : ");
		count = sc.nextInt();
		System.out.println("Enter the starting km of the trip : ");
		start = sc.nextInt();
		System.out.println("Enter the closing km of the trip : ");
		end = sc.nextInt();
		
		totalDistance = end-start;
		
		System.out.println("Total trip count's : "+count);
		System.out.println("Total Km Driven Today : "+totalDistance);
		
		perKmCharge *= totalDistance;
		System.out.println("Total Charge : "+perKmCharge);
	}
	
	public void fiveSeater()
	{
		System.out.println("Enter charge per km : ");
		perKmCharge = sc.nextFloat();
		System.out.println("Enter the count of trips : ");
		count = sc.nextInt();
		System.out.println("Enter the starting km of the trip : ");
		start = sc.nextInt();
		System.out.println("Enter the closing km of the trip : ");
		end = sc.nextInt();
		
		totalDistance = end-start;
		
		System.out.println("Total trip count's : "+count);
		System.out.println("Total Km Driven Today : "+totalDistance);
		
		perKmCharge *= totalDistance;
		System.out.println("Total Charge : "+perKmCharge);
	}
	
	public void elevenSeater()
	{
		System.out.println("Enter charge per km : ");
		perKmCharge = sc.nextFloat();
		System.out.println("Enter the count of trips : ");
		count = sc.nextInt();
		System.out.println("Enter the starting km of the trip : ");
		start = sc.nextInt();
		System.out.println("Enter the closing km of the trip : ");
		end = sc.nextInt();
		
		totalDistance = end-start;
		
		System.out.println("Total trip count's : "+count);
		System.out.println("Total Km Driven Today : "+totalDistance);
		
		perKmCharge *= totalDistance;
		System.out.println("Total Charge : "+perKmCharge);
	}
	
	public void performOperation()
	{
		int ch;
		System.out.println("Welcome to XYZ services...");
		do {
			System.out.println("1. AP05 AE 8887(4) \t2. AP05 AE 8843(7) \t3. AP05 AE 8840(5) \t4. AP05 AE 8812(11) \t5.Exit");
			System.out.println("choose one option : ");
			ch = sc.nextInt();
			
			switch (ch) 
			{
				case 1 : System.out.println("VEH_NO : AP05 AE 8887");
						fourSeater();
				break;
				case 2 : System.out.println("VEH_NO : AP05 AE 8843");
						sevenSeater();
				break;
				case 3 : System.out.println("VEH_NO : AP05 AE 8840");
						fiveSeater();
				break;
				case 4 : System.out.println("VEH_NO : AP05 AE 8812");
						elevenSeater();
				break;
				case 5 : System.out.println("Thank You! visit again!");
					System.exit(0);
				break;
				default : System.out.println("Choose right option!");
				break;
			}
		} while (ch!=5);
	}
	
	public static void main(String[] args) {
		
		Taxi_Booking tb = new Taxi_Booking();
		tb.performOperation();
	}
}
