package com.coreProject;

import java.util.Scanner;

public class ElectricityBill 
{
	private String meterNumber;
	private int units;
	private float agriSurCharge, resiSurCharge, commSurCharge, totalBill;
	Scanner sc;
	
	public ElectricityBill() {
		sc = new Scanner(System.in);
		totalBill = 0;
		agriSurCharge = 25;
		resiSurCharge = 35;
		commSurCharge = 50;
	}
	
	public void agriculture()
	{
		sc.nextLine();
		System.out.println("Enter Meter_Number : ");
		meterNumber = sc.nextLine();
		System.out.println("Enter units : ");
		units = sc.nextInt();

		if(units>0 && units<=50)
		{
			totalBill = (float) ((units*0.70)+agriSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
		else if(units > 50 && units <=100)
		{
			totalBill = (float) ((units*1.20)+agriSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
		else if(units >100 && units<= 200)
		{
			totalBill = (float) ((units*2.50)+agriSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
		else if(units > 200)
		{
			totalBill = (float) ((units*4.40)+agriSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
	}
	
	public void residence()
	{
		sc.nextLine();
		System.out.println("Enter Meter_Number : ");
		meterNumber = sc.nextLine();
		System.out.println("Enter units : ");
		units = sc.nextInt();

		if(units>0 && units<=50)
		{
			totalBill = (float) ((units*1.95)+resiSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
		else if(units > 50 && units <=100)
		{
			totalBill = (float) ((units*3.20)+resiSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
		else if(units >100 && units<= 200)
		{
			totalBill = (float) ((units*4.50)+resiSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
		else if(units > 200)
		{
			totalBill = (float) ((units*6.50)+resiSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
	}
	
	public void commericial()
	{
		sc.nextLine();
		System.out.println("Enter Meter_Number : ");
		meterNumber = sc.nextLine();
		System.out.println("Enter units : ");
		units = sc.nextInt();

		if(units>0 && units<=50)
		{
			totalBill = (float) ((units*4.70)+commSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
		else if(units > 50 && units <=100)
		{
			totalBill = (float) ((units*6.50)+commSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
		else if(units >100 && units<= 200)
		{
			totalBill = (float) ((units*9.50)+commSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
		else if(units > 200)
		{
			totalBill = (float) ((units*12.50)+commSurCharge);
			System.out.println("Bill of "+units+" is : "+totalBill);
		}
	}
	
	public void performOperations()
	{
		int ch;
	
		try {
			System.out.println("Welcome to PSPCL Board...");
			
			Thread.sleep(1500);
			do {
				System.out.println("1. Agriculture \t2. Residance \t3 Commercial \t4. Exit");
				System.out.println("Choose option to perform : ");
				ch = sc.nextInt();
				
				switch(ch)
				{
					case 1 : agriculture();
						break;
					case 2 : residence();
						break;
					case 3 : commericial();
						break;
					case 4 : System.out.println("Thank you for choosing our service's");
							System.exit(0);
					break;
					default : System.out.println("please choose valid option!");
						break;
				}
			} while (ch!=4);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ElectricityBill eb = new ElectricityBill();
		eb.performOperations();
	}
}
