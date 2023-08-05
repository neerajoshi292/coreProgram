package com.conditionloop;

import java.util.Scanner;

public class ConditionLoop 
{
	Scanner sc;
	
	public ConditionLoop() {
		sc= new Scanner(System.in);
	}
	
	public void maxBTwo()
	{
		try {
			System.out.println("Enter x value: ");
			float x= sc.nextFloat();
			System.out.println("Enter y value: ");
			float y= sc.nextFloat();
			
			float max= Math.max(x, y);
			
			System.out.println("Max b/w Two values: "+max);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	public void maxBThree()
	{
		System.out.println("Enter x value: ");
		float x= sc.nextFloat();
		System.out.println("Enter y value: ");
		float y= sc.nextFloat();
		System.out.println("Enter z value: ");
		float z= sc.nextFloat();
		
		float max= x>y && x>z ? x: y>z ? y:z;
				 
		System.out.println("Max b/w three number: "+max);
	}
	
	
	public void findPositiveZeroNegative()
	{
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		String value= num>0 ? "Positive_number" : num==0 ? "Zero_number" : "Negative_Number";
		System.out.println(num+" is a "+value);
	}
	
	public void divisible5r11()
	{
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
	
		String status= ((num%5 | num%11)==0 ? "divisible by 5 and 11" : "not divisible by 5 and 11"); 
		
		System.out.println(status);
	}
	
	public void findOddEven()
	{
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
	
		String value= num%2==0 ? "Even number": "Odd number";
		System.out.println(value);
	}
	
	public void leapYearOrNot()
	{
		System.out.println("Enter a Year: ");
		int year= sc.nextInt();
		
		String getYear= (year%4==0 && year%100!=0) ? "leap year" : year%400==0 ? "leap year" : "not a leap year";  
		System.out.println(year+" is "+getYear);
	}
	
	public void checkAlphabet()
	{
		System.out.println("Enter a Alphabet: ");
		char ch= sc.next().charAt(0);
		
		String find= (ch>=65 && ch<=90) || (ch>=97 && ch<=122) ? "is Alphabet" : "is not a Alphabet";
		System.out.println(find);
	}
	
	public void vowelConsonant()
	{
		System.out.println("Enter a Alphabet: ");
		char ch= sc.next().charAt(0);
	
		switch(ch) 
		{
			case 'A' : 
			case 'E' : 
			case 'I' : 
			case 'O' : 
			case 'U' : 
			case 'a' : 
			case 'e' : 
			case 'i' : 
			case 'o' : 
			case 'u' : System.out.println("is Vowel"); 
			break;
			default: System.out.println("is Consonant");	
			break;
		}
	}
	
	public void alphabetDigitSpecialChar()
	{
		System.out.println("Enter a char: ");
		char ch= sc.next().charAt(0);
		
		String content= (ch>=65 && ch<=90 || ch>=97 && ch<=122 ) ? "is Alphabet" : (ch>=48 && ch<=57) ? "is number" : "special char";
		System.out.println(content);
	}
	
	public void upperLowerCase()
	{
		System.out.println("Enter a Alphabet: ");
		char ch= sc.next().charAt(0);
		
		String word= (ch>=65 && ch<=90) ? "upper case" :  (ch>=97 && ch<=122) ? "lower case" : "please enter valid value"; 
		System.out.println(word);
	}
	
	public void printWeekDays()
	{
		System.out.println("Enter a number(1-7) : ");
		int day= sc.nextInt();
		
		switch(day)
		{
			case 1: System.out.println("Sunday");
			break;
			case 2: System.out.println("Monday");
			break;
			case 3: System.out.println("Tuesday");
			break;
			case 4: System.out.println("Wednesday");
			break;
			case 5: System.out.println("Thursday");
			break;
			case 6: System.out.println("Friday");
			break;
			case 7: System.out.println("Saturday");
			break;
			default: System.out.println("please enter valid value(1-7)");
			break;
		}
	}
	
	public void checkValidTriangle()
	{
		System.out.println("Enter A angle");
		int a= sc.nextInt();
		System.out.println("Enter B angle");
		int b= sc.nextInt();
		System.out.println("Enter C angle");
		int c= sc.nextInt();
		
		String triangleStatus= (a+b+c==180) ? "valid triangle" : "not a valid triangle";
		System.out.println(triangleStatus);
	}
	
	public void checkValidTriangle1()
	{
		System.out.println("Enter A side");
		int a= sc.nextInt();
		System.out.println("Enter B side");
		int b= sc.nextInt();
		System.out.println("Enter C side");
		int c= sc.nextInt();
		
		String triangleSide= ((a+b>c) || (a+c>b) || (b+c>a)) ? "Valid triangle" : "not a valid triangle";
		System.out.println(triangleSide);
	}
	
	public void checkTriangle()
	{
		System.out.println("Enter A angle");
		int a= sc.nextInt();
		System.out.println("Enter B angle");
		int b= sc.nextInt();
		System.out.println("Enter C angle");
		int c= sc.nextInt();
		
		String triangle=  (a == b && b == c && a == c)? "Equilateral Triangle" :(a==b || a==c || b==c)? "Isosceles Triangle" : "Scalean Triangle";
		System.out.println(triangle);
	}
	
	public void profitLoss()
	{
		System.out.println("Enter Cost_Price: ");
		float cp= sc.nextFloat();
		System.out.println("Enter Selling_Price: ");
		float sp= sc.nextFloat();
		
		String status= (sp-cp > 0)? "profit" : (sp-cp<0) ? "loss" : "no profit no loss";
		System.out.println(status);
	}
	
	public void inputMarks()
	{
		System.out.println("Enter Physics marks : ");
		float phy= sc.nextFloat();
		System.out.println("Enter Chemistry marks : ");
		float che= sc.nextFloat();
		System.out.println("Enter Math marks : ");
		float math= sc.nextFloat();
		System.out.println("Enter Biology marks : ");
		float bio= sc.nextFloat();
		System.out.println("Enter Computer marks : ");
		float com= sc.nextFloat();
		
		float totalMarks= phy+che+math+bio+com;
		
		int percentage= (int) (totalMarks*100)/500;
		
		if(percentage>=90)
		{
			System.out.println("Grade A");
		}
		else if(percentage>=80)
		{
			System.out.println("Grade B");
		}
		else if(percentage>=70)
		{
			System.out.println("Grade C");
		}
		else if(percentage>=55)
		{
			System.out.println("Grade D");
		}
		else if(percentage>=33)
		{
			System.out.println("Grade E");
		}
		else if(percentage<33)
		{
			System.out.println("Grade F");
		}
	}
	
	public void findGrossSalary()
	{

		System.out.println("Enter Basic Salary: ");
		float salary= sc.nextFloat();
		float grossSalary, da=0, hra=0;		
		
		if(salary<=10000)
		{
			da= (float) (salary*0.8);
			hra= (float) (salary*0.2);
		}
		else if(salary <=20000)
		{
			da= (float) (salary*0.9);
			hra= (float) (salary*0.25);
		}
		else
		{
			da= (float) (salary*0.95);
			hra= (float) (salary*0.3);
		}
		grossSalary = salary+ da +hra;
		
		System.out.println("Gross_Salary: "+grossSalary);
	}
	
	public void electricityBill()
	{
		System.out.println("Enter Units: ");
		int unit = sc.nextInt();
		
		float charge= 0;
		float surcharge= 0;
		
		if(unit<=50)
		{
			charge= (float) (unit*0.5);  
		}
		else if(unit<=150)
		{
			charge = (float) (25+ ((unit-50)*0.75));
		}
		else if(unit<=250)
		{
			charge = (float) (100+ ((unit-150)*1.20));
		}
		else 
		{
			charge = (float) (220+ ((unit-250)*1.50));
		}
		
		surcharge = (float) (charge*0.20);
		float totalBill= charge+surcharge;
		
		System.out.println("your electricity bill of "+unit+" units are "+totalBill);
	}
	
	
	
	
	public void display()	
	{
//		maxBTwo();
//		maxBThree();
//		findPositiveZeroNegative();
//		divisible5r11();
//		findOddEven();
//		leapYearOrNot();
//		checkAlphabet();
//		vowelConsonant();
//		alphabetDigitSpecialChar();
//		upperLowerCase();
//		printWeekDays();
//		checkValidTriangle();
//		checkValidTriangle1();
//		checkTriangle();
//		profitLoss();
//		inputMarks();
//		findGrossSalary();
		electricityBill();
	}
	public static void main(String[] args) {
		
		new ConditionLoop().display();
	}
}
