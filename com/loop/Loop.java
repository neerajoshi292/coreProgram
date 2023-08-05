package com.loop;

import java.util.Scanner;

public class Loop 
{
	Scanner sc;
	
	public Loop() {
		sc= new Scanner(System.in);
	}
	
	public void printNatnum()
	{
		for(int i=1;i<=20;i++) 
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=20;i>=1;i--) 
		{
			System.out.print(i+" ");
		}
	}
	
	public void printAtoZ()
	{
		int ch=65;
//		int countWords=0;
		while(ch<=90)
		{
//			countWords++;
			System.out.print((char)ch+" ");
			ch++;
			
		}
//		System.out.println(countWords);
	}
	
	public void printEven()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\nsum of all even numbers: "+sum);
	}
	
	public void printOdd()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\nsum of all odd numbers: "+sum);
	}
	
	public void  multipicationTable()
	{
		System.out.println("Enter a number to print the Table(1-n): ");
		int table= sc.nextInt();
		
		for(int j=2;j<=table;j++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(j+" x "+i+" = "+(j*i));
			}
			System.out.println("_____________________________________");
		}
	}
	
	public long countDigits(long num)
	{
//		System.out.println("Enter a number: ");
//		long num= sc.nextLong();
		long count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
//		System.out.println("Total_digits: "+count);
		return count;
	}
	
	public void firstLastDigit()
	{
		System.out.println("Enter a number: ");
		long num= sc.nextLong();

		long count = countDigits(num);
		
		long lastDigit= num%10;
		System.out.println("Last_Digit: "+lastDigit);
		
		long firstDigit = (long) (num/Math.pow(10, --count));
		System.out.println("First_Digit: "+firstDigit);		
	}
	
	public void swapTwoNum()
	{
		int x=45, y=31, temp=0;;
		
//		one method:->
//		x^=y;
//		y^=x;
//		x^=y;
		
//		second method:->
		
//		x=x+y;
//		y= x-y;
//		x= x-y;
		
//		3rd method:->
		
//		temp = x;
//		x=y;
//		y=temp;
		
		System.out.println("value of X: "+x);
		System.out.println("value of Y: "+y);
	}
	
	public void sumProduct()
	{
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		int sum=0, product=1;
		
		while(num>0)
		{
			int digit= num%10;

			sum+=digit;
			product*=digit;
			
			num/=10;
		}
		System.out.println("Sum of number: "+sum);
		System.out.println("product of number: "+product);
	}
	
	public void reverseNumber()
	{
		System.out.println("Enter a number: ");						//input:-> 2314
		int num= sc.nextInt();
		
		int reverse=0, firstDigit, lastDigit, swappedNum;
		
		long count= countDigits(num);
		System.out.println(count);		
		lastDigit = num%10;
		System.out.println(lastDigit);
		
		firstDigit= (int) (num/Math.pow(10, --count));
		System.out.println(firstDigit);
		
		swappedNum= lastDigit;
		System.out.println(swappedNum);
		swappedNum*= Math.pow(10, count);
		System.out.println(swappedNum);
		swappedNum+= num%Math.pow(10, count);
		System.out.println(swappedNum);
		swappedNum-=lastDigit;
		System.out.println(swappedNum);
		
		swappedNum+=firstDigit;
		
		System.out.println(swappedNum);								// output:-> 4312
	}
	
	public void palindromeNumber()
	{
		System.out.println("Enter a number: ");
		int num= sc.nextInt();

		int temp= num;
		int drome=0;
		
		long count = countDigits(num);
		
		while(temp!=0)
		{
			int value= temp%10;
			drome+=value*Math.pow(10, --count);
			temp/=10;
		}
		String msg= (checkStatus(num, drome) ? "palindrome number" : "not a palindrome number");
		System.out.println(msg);
	}
	
	public void numberInWords()
	{
		System.out.println("Enter a number: ");
		int num= sc.nextInt();

		String msg= "";
		switch(num)
		{
			case 0: msg= "zero";
			break;
			case 1: msg= "one";
			break;
			case 2: msg= "two";
			break;
			case 3: msg= "three";
			break;
			case 4: msg= "four";
			break;
			case 5: msg= "five";
			break;
			case 6: msg= "six";
			break;
			case 7: msg= "seven";
			break;
			case 8: msg= "eight";
			break;
			case 9: msg= "nine";
			break;
			case 10: msg= "Ten";
			break;
		}
		System.out.println(msg);
	}
	
	public void printASCII()
	{
		for(int i=1;i<=255;i++)
		{
			System.out.println(i+"   "+(char)i);
		}		
	}
	
	public void findFactor()
	{
		System.out.println("Enter number: ");
		int num= sc.nextInt();
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}
	}
	
	public void factorialNumber()
	{
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int f=1;
		for(int i=num;i>=1;i--)
		{
			f*=i;
		}
		System.out.println("factorial of "+num+" is "+f);
	}
	
	public void primeNumber()
	{
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				break;
		}
		String msg= (num>1) ? "prime number" : "not a prime number";
		System.out.println(msg);
	}
	
	public void armstrongNumber()
	{
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int temp= num;
		
		int sum=0;
		long count= countDigits(num);
		
		while(temp!=0)
		{
			int digit= temp%10;
			sum+= Math.pow(digit, count);
			temp/=10;
		}
		System.out.println(sum);
		String msg= checkStatus(num, sum) ? "ArmStrong number" : "not a Armstrong number";
		System.out.println(msg);
	}
	
	public void perfectNumber()
	{
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int perfect=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				perfect+=i;
		}
		String msg= num==perfect?"perfect number": "not a perfect number";
		System.out.println(msg);
	}
	
	
	public void strongNumber()
	{
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int temp= num;
		int sum=0;
		
		while(temp!=0)
		{
			int digit= temp%10;
			int f=1;
				for(int i=digit;i>=1;i--)
				{
					f*=i;
				}
			sum+=f;	
			temp/=10;
		}
		String msg= (num==sum)?"Strong number" : "not a Strong number";
		System.out.println(msg);
	}
	
	public void fibonacciSeries()
	{
		int a=0, b=1, c=0;
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(c+" ");
			a=b;
			b=c;
			c= a+b;
		}
	}
	
	public boolean checkStatus(int num, int sum)
	{
		return num==sum?true:false;
	}
	
	public void display()
	{
//		printNatnum();
//		printAtoZ();
//		printEven();
//		printOdd();
//		multipicationTable();
//		firstLastDigit();
//		swapTwoNum();
//		sumProduct();
//		reverseNumber(); 
//		palindromeNumber();
//		numberInWords();
//		printASCII();
//		findFactor();
//		factorialNumber();
//		primeNumber();
//		armstrongNumber();
//		perfectNumber();
//		strongNumber();
		fibonacciSeries();
	
	}
	public static void main(String[] args) {
		
		new Loop().display();
	}
}
