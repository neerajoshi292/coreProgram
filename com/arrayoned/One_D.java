package com.arrayoned;

import java.util.Arrays;
import java.util.Scanner;

public class One_D 
{
	Scanner sc;
	
	public One_D() 
	{
		sc= new Scanner(System.in);
	}
	
	public int[] enterElement()
	{
		System.out.println("Enter Array Size: ");
		int size= sc.nextInt();
		
		int arr[]= new int[size];
		
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		/*
		 * System.out.println("Array Elements are: "); for(int i=0;i<arr.length;i++) {
		 * System.out.print(arr[i]+" "); }
		 */	
		return arr;
	}
	
	public void negativeElement()
	{	
		int[] x = enterElement();

		for(int i=0;i<x.length;i++)
		{
			if(x[i]<0)
			{
				System.out.print(x[i]+" ");
			}
		}
	}
	
	public void sumElement()
	{
		int[] x = enterElement();
		int sum=0;
		
		for(int i=0;i<x.length;i++)
		{
			sum+=x[i];
		}
		System.out.println("sum of Array elements are: "+sum);	
	}
	
	public void maxMin()
	{
		int[] x = enterElement();
		
		int min= x[0];
		int max= x[0];
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max= x[i];
			}
			else if(x[i]<min) 
			{
				min=x[i];
			}
		}
		System.out.println("max_Element: "+max+"\n min_Element: "+min);
	}
	
	/*
	 * public void secondLargest() { int[] x = enterElement(); Arrays.sort(x);
	 * 
	 * if(x.length>=2) { System.out.println("second largest: "+x[x.length-2]); }else
	 * { System.out.println("Array has less than two element!"); } }
	 * 
	 * public void secondLargest() { int[] x = enterElement(); int temp=0; for(int
	 * i=0;i<x.length;i++) { for(int j=i;j<x.length;j++) { if(x[i]>x[j]) { temp=
	 * x[i]; x[i]=x[j]; x[j]= temp; } } }
	 * 
	 * for(int i=0;i<x.length;i++) { System.out.print(x[i]+" "); }
	 * 
	 * if(x.length>=2) { System.out.println("second largest: "+x[x.length-2]); }else
	 * { System.out.println("Array has less than two element!"); } }
	 */	
	
	public void secondLargest() 
	{   
		int[] x = enterElement();   
//		int x[]= {9,5,1,3,7};
		
	    int max = x[0];
	    int secMax= x[0];
//	    int secMax = Integer.MIN_VALUE; 				// if i use this the no need to use 3rd else_if 
	    
	    for (int i = 0; i < x.length; i++) {
	        if (x[i] > max)
	        {
	            secMax = max;
	            max = x[i];
	        }
	        else if (x[i] > secMax && x[i] < max) 
	        {
	            secMax = x[i];
	        }
	        else if(max == secMax && secMax > x[i])
	        {
	        	secMax=x[i];
	        }
	        
	    }
	    System.out.println("The two largest elements in the array are : " + max + " " + secMax);
	}
	
	public int[] countOddEven(int[] x)
	{
//		int[] x= enterElement();
		
		int odd=0, even=0;
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}
//		System.out.println("Even element: "+even+"\n Odd Element: "+odd);
		
		int counts[]= new int[2];
		counts[0]= even;
		counts[1]= odd;
		return counts;
	}
	
	public void copyArrayELement()
	{
		int[] x = enterElement();
		int temp[]= new int[x.length];
		
		for(int i=0;i<x.length;i++)
		{
			temp[i]=x[i];
			System.out.print(temp[i]+" ");
		}
	}
	
	public void insertElement()
	{
		int[] x = enterElement();
		
		int[] temp= new int[x.length+1];
		
		System.out.println("Enter index_no to insert element: ");
		int in= sc.nextInt();
		System.out.println("Enter Element: ");
		int ele= sc.nextInt();
		
		for(int i=0;i<x.length+1;i++)
		{
			if(i<in)
			{
				temp[i] = x[i];
			}
			else if(i==in)
			{
				temp[i]=ele;
			}
			else 
			{
				temp[i]= x[i-1];
			}
		}
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
	
	public void deleteElement()
	{
		int[] x = enterElement();
		
		int temp[]= new int[x.length-1];

		System.out.println("Enter index_no to insert element: ");
		int in= sc.nextInt();
		
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
			{
				temp[i]= x[i];
			}
			else if(i==in)
			{
				continue;
			}
			else 
			{
				temp[i-1] = x[i];
			}
		}

		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}		
	}
	
	
	public void countFrequency()
	{
		int x[]= enterElement();
		
		int visit=-1, count;
		int freq[]= new int[x.length];
		
		for(int i=0;i<x.length;i++)
		{
			count=1;
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					count++;
					freq[j]= visit;
				}
			}
			
			if(freq[i]!=visit)
			{
				freq[i]= count;
			}
		}
		
		System.out.println("Element - Frequency");
		
		for(int k=0;k<freq.length;k++)
		{
			if(freq[k]!=visit)
			{
				System.out.println("      "+x[k]+"  -  "+freq[k]);
			}
		}
	}
	
	public void uniqueElements()
	{
//		int x[]= {1,3,5,2,7,5,3,1};
		
		int[] x = enterElement();
		
		int freq[] = new int[x.length];
		
		int count, visit=-1 ;
		for(int i=0;i<x.length;i++)
		{
			count=1;
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					count++;
					freq[j]= visit;
					break;
				}
			}
			
			if(freq[i]!=visit)
			{
				freq[i]= count;
			}
		}
		
		System.out.println("Unique elements are: ");
		for(int k=0;k<freq.length;k++)
		{
			if(freq[k]==1)
			{
				System.out.print(x[k]+" ");
			}
		}
	}
	
	public void countDuplicateElement()
	{
		int x[]= enterElement();
		int count=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println("Duplicate element in the array: "+count);
	}
	
	public void deleteAllDuplicateElement()
	{
		int[] x = enterElement();
		
		int visit=-1;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j] && i!=j)
				{
					x[j]= visit;
				}
			}		
			if(x[i] != visit)
			{
				System.out.print(x[i]+" ");
			}
		}
	}
	
	public void mergeTwoArray()
	{
		int[] x = enterElement();
		int[] y = enterElement();
		
		int l1= x.length;
		int l2= y.length;
		
		int l3= l1+l2;
		
		int z[]= new int[l3];
		

		for(int i=0;i<x.length;i++)
		{
			z[i] = x[i];
		}
		
		for(int i=0;i<y.length;i++)
		{
			z[l1+i] = y[i];
		}
	
		System.out.println("Merge Two Array: ");
//		Arrays.sort(z);
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
	
	public void printReverseElement()
	{
		int[] x = enterElement();
		
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
	}
	
	public void seprateOddEven(int[] x, int counts[] )
	{
//		int[] x = enterElement();

		int oddCount= counts[1];
		int evenCount= counts[0];
		
//		int oddCount=0, evenCount=0;
//		for(int i=0;i<x.length;i++)
//		{
//			if(x[i] % 2 == 0)
//			{
//				evenCount++;
//			}
//			else
//			{
//				oddCount++;
//			}
//		}
//		System.out.println(oddCount+"  "+evenCount);
		
		int oddA[]= new int[oddCount];
		int[] evenA= new int[evenCount];
		
		int oddIndex=0, evenIndex=0;
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				evenA[evenIndex]= x[i];
				evenIndex++;
			}
			else
			{
				oddA[oddIndex]= x[i];
				oddIndex++;
			}
		}
//		System.out.println(oddIndex+"  "+evenIndex);
		
		System.out.println("Even_Elements: ");
		Arrays.sort(evenA);
		for(int i=0;i<evenA.length;i++)
		{
			System.out.print(evenA[i]+" ");
		}
		
		System.out.println("\nOdd_Elements: ");
		Arrays.sort(oddA);
		for(int i=0;i<oddA.length;i++)
		{
			System.out.print(oddA[i]+" ");
		}
	}
	
	public void searchElement(int x[])
	{
		System.out.println("Enter Element to search: ");
		int s= sc.nextInt();
		
		int f=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==s)
			{
				System.out.println(s+" found at index "+i);
				f=1;
			}
		}
		if(f==0)
			System.out.println("elemenet not found in given list");
	}
	
	public void sortAssendingDesending(int x[])
	{
		int temp=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					temp= x[i];
					x[i]= x[j];
					x[j]= temp;
				}
			}
		}
		System.out.println("Asending order :-> ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println("\n_________________________________________________");
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
					temp= x[i];
					x[i]= x[j];
					x[j]= temp;
				}
			}
		}
		System.out.println("Desending order :-> ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
	}
	
	public void leftRotate(int x[])
	{
		int n=3;

		while(n>=1)
		{
			int first= x[0];
			for(int i=0;i<x.length-1;i++)
			{
				x[i]= x[i+1];
			}
			x[x.length-1]= first;
			
			System.out.println("Left Rotation of array: ");
			for(int j=0;j<x.length;j++)
			{
				System.out.print(x[j]+" ");
			}
			
			setSleepTime();
		
			System.out.println();
			n--;
		}
	}
	
	public void rightRotate(int x[])
	{	
		int n=1;
		while(n<=3)
		{
			int last= x[x.length-1];
			for(int i=x.length-1;i>0;i--)
			{
				x[i]= x[i-1]; 
			}
			x[0] = last;
			
			System.out.println("Right Rotation of array: ");
			for(int j=0;j<x.length;j++)
			{
				System.out.print(x[j]+" ");
			}
			
			setSleepTime();
			System.out.println();
			
			n++;
		}
	}
	
	public void setSleepTime()
	{
		try
		{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void display()
	{
		int[] arr = enterElement();
//		negativeElement();
//		sumElement();
//		maxMin();
//		secondLargest();

//		copyArrayELement();
//		insertElement();
//		deleteElement();
//		countFrequency();	
//		uniqueElements();
//		countDuplicateElement();
//		deleteAllDuplicateElement();
//		mergeTwoArray();
//		printReverseElement();
		

//		int[] counts = countOddEven(arr);		
//		seprateOddEven(arr, counts);
		
//		searchElement(arr);
//		sortAssendingDesending(arr);
//		leftRotate(arr);
		rightRotate(arr);
	
	}
	public static void main(String[] args) {

		new One_D().display();
	}
}
