package com.twoDArray;

import java.util.Scanner;

public class Two_D 
{
	Scanner sc;
	
	public Two_D() {
		sc= new Scanner(System.in);
	}
	
	public int[][] inputElement()
	{
		System.out.println("Enter row's size: ");
		int row = sc.nextInt();
		System.out.println("Enter col's size: ");
		int col= sc.nextInt();
		
		int arr[][]= new int[row][col];  
		
		System.out.println("Enter Elements in the array: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Original_Elements in the array: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		return arr;
	}
	
	public boolean isEqual(int[][] a, int b[][])
	{	
		int r1= a.length;
		int r2= b.length;
		int c1= a[0].length;
		int c2= b[0].length;
		
		return (r1==r2 && c1==c2) ? true: false;
	}
	
	public void addTwoMatrix(int a[][], int b[][])
	{
		try {
			
			if(!isEqual(a, b))
			{
				System.out.println("size of rows and coloums are not the same...! cannont perform operation.");
				return;			
			}
				
			int[][] add= new int[a.length][a[0].length];
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					add[i][j]= a[i][j]+b[i][j];
				}
			}
			
			for(int i=0;i<add.length;i++)
			{
				for(int j=0;j<add[0].length;j++)
				{
					System.out.print(add[i][j]+" ");
				}
				System.out.println();
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void subTwoMatrix(int a[][], int b[][])
	{
		try {
			
			if(!isEqual(a, b))
			{
				System.out.println("size of rows and coloums are not the same...! cannont perform operation.");
				return;			
			}
				
			int[][] sub= new int[a.length][a[0].length];
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					sub[i][j]= a[i][j]-b[i][j];
				}
			}
			
			for(int i=0;i<sub.length;i++)
			{
				for(int j=0;j<sub[0].length;j++)
				{
					System.out.print(sub[i][j]+" ");
				}
				System.out.println();
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void scalerMatrix(int a[][])
	{
		System.out.println("Enter a number to multiply with matrix: ");
		int n=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{	
				System.out.print(a[i][j]*n+" ");
			}
			System.out.println();
		}
	}
	
	public void multiplyTwoMatrix(int a[][], int [][]b)
	{
		if(!isEqual(a, b))
		{
			System.out.println("size of rows and coloums are not the same...! cannont perform operation.");
			return;			
		}
		
		int[][] mul= new int[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				mul[i][j]=0;
				
				for(int k=0;k<a.length;k++)
				{
					mul[i][j]+= a[i][k] * b[k][j];
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public void sumMainDiagonal(int a[][])
	{
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i==j)
				{
					sum+=a[i][j];
				}
			}
		}
		System.out.println("sum of Main_diagonal: "+sum);
	}
	
	public void sumMinorDiagonal(int a[][])
	{
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i+j==2)
				{
					sum+=a[i][j];
				}
			}
		}
		System.out.println("sum of Minor_diagonal: "+sum);
	}
	
	public void sumEachRowColoum(int a[][])
	{
		int l1= a.length;
		int l2= a[0].length;
		
		if(l1!=l2)
		{
			System.out.println("size must be same");
			return;
		}else 
		{
			int sumRow;
			
			for(int i=0; i<a.length;i++)
			{
				sumRow=0;
				for(int j=0;j<a[0].length;j++)
				{
					sumRow+=a[i][j];
				}
				System.out.println("sum of element of row_"+i+" : "+sumRow);
			}
			
			System.out.println("\n================================================\n");
			
			int sumCol;
			for(int i=0; i<a.length;i++)
			{
				sumCol=0;
				for(int j=0;j<a[0].length;j++)
				{
					sumCol+=a[j][i];
				}
				System.out.println("sum of element of col_"+i+" : "+sumCol);
			}
		}
	}
	
	public void interchangeDiagonal(int a[][])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			temp= a[i][i];
			a[i][i]= a[i][a.length-i-1];
			a[i][a.length-i-1]= temp;
		}
		
		System.out.println("Interchange Diagonal are: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void upperTriangularMatrix(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i>j)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public void LowerTriangularMatrix(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i<j)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public void sumUpperTriangularMatrix(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i<j)
				{
					sum+= a[i][j];
				}
			}
		}
		System.out.println("sum of upper_triangular Matrix: "+sum);
		
		sumLowerTriangularMatrix(a);
	}
	
	public void sumLowerTriangularMatrix(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i>j)
				{
					sum+= a[i][j];
				}
			}
		}
		System.out.println("sum of lower_triangular Matrix: "+sum);
	}
	
	public int[][] transposeMatrix(int a[][])
	{
		int temp[][]= new int[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				temp[j][i]= a[i][j];
			}
		}
		
		System.out.println("Transpose Matrix : ");
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp[0].length;j++)
			{
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		return temp;
	}
	
	public void calculateDeterminantMatrix(int a[][])
	{	
		int b,c,d,e,f,g,h,i,j;
	
//		b c d
//		e f g 				//  b(fj-gi)-c(ej-gh)+d(ei-fh)	
//		h i j
		
		b= a[0][0];
		c= a[0][1];
		d= a[0][2];
		e= a[1][0];
		f= a[1][1];
		g= a[1][2];
		h= a[2][0];
		i= a[2][1];
		j= a[2][2];
		
		int determinant= b*(f*j-g*i)-c*(e*j-g*h)+d*(e*i-f*h);
		System.out.println("Determinant of Matrix: "+determinant);	
	}
	
	public void identityMatrix(int a[][])
	{
		boolean identity= true;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i==j && a[i][j]!=1 || i!=j && a[i][j]!=0)
				{
					identity= false;
				}
			}
		}
		if(identity)
		{
			System.out.println("identity Matrix: ");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}else
		{
			System.out.println("given matrix is not a identity_Matrix");
		}
	}
	
	public void sparseMatrix(int a[][])
	{
		int count=0;
		int row= a.length;
		int col= a[0].length;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]==0)
					count++;
			}
		}
		System.out.println("count "+count);
		
		int l= a.length;
		System.out.println(l);
		if(count >= (row*col/2))
		{
			System.out.println("given matrix is sparse_Matrix");
		}
		else {
			System.out.println("given matrix is not sparse_Matrix");
		}
	}
	
	public void symmetricMatrix(int a[][])
	{
		int row= a.length, col= a[0].length;

		boolean symmetric= true;

		if(row !=col)
		{
			symmetric= false;
		}
		else if(a==null || a.length==0 )
		{
			symmetric= false;
		}
		else
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(a[i][j]!=a[j][i])
					{
						symmetric= false;
					}
				}
			}
		}	
		if(symmetric)
		{
			System.out.println("given matrix is symmetric_Matrix");
		}
		else
		{
			System.out.println("given matrix is not symmetric_Matrix");
		}
		
		
		
		
	}
	
	public void display()
	{
		int[][] a = inputElement();
//		int[][] b = inputElement();
		
//		System.out.println(isEqual(a, b));
		
//		addTwoMatrix(a, b);
//		subTwoMatrix(a, b);
//		scalerMatrix(a);
//		multiplyTwoMatrix(a, b);
		
//		sumMainDiagonal(a);
//		sumMinorDiagonal(a);
//		sumEachRowColoum(a);
//		interchangeDiagonal(a);
		
//		upperTriangularMatrix(a);
//		LowerTriangularMatrix(a);
//		sumUpperTriangularMatrix(a);
//		transposeMatrix(a);
//		calculateDeterminantMatrix(a);
//		identityMatrix(a);
//		sparseMatrix(a);
		symmetricMatrix(a);
	}
	
	public static void main(String[] args) {
		new Two_D().display();
	}
}
