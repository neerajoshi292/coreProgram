package com.pattern;

public class StarPattern {

	
//	Square Star Pattern :->
	
	public static void squarePattern()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void hollowSquarePattrn()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollowSquareStarPatternWithDiagonal()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5 || i==j || j==5-i+1)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void rhombusStarPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("-");
			}
			for(int k= 1;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void hollowRhombusStarPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("-");
			}
			for(int k= 1;k<=5;k++)
			{
				if(i==1 || i==5 || k==1 || k==5)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void mirroredRhombusStarPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	public static void hollowMirroredRhombusStarPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++)
			{
				if(i==1 || i==5 || k==1 || k==5)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
// =====================================================================================	
		
//		Triangle Star Pattern :->
		
		public static void rightTriangleStarPattern()
		{
			for(int i =1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void hollowRightTriangleStarPattern()
		{
			for(int i =1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(j==1 || i==j || i==5)
					{
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		public static void mirroredRightTriangleStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void hollowMirroredRightTriangleStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					if(k==1 || i==k || i==5)
					{
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		public static void invertedRightTriangleStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<=5;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void hollowInvertedRightTriangleStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int k=i;k<=5;k++)
				{
					if(i==k || k==5 || i==1)
					{
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		public static void invertedMirroredRightTriangleStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=i;k<=5;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}	
		}
		
		public static void hollowInvertedMirroredRightTriangleStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=i;k<=5;k++)
				{
					if(i==1 || i==k || k==5)
					{
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		public static void pyramidStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=(2*i-1);k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void pyramidStarPattern1()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		public static void pyramidStarPattern2()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=5;j>=1;j--)
				{
					if(i>=j)
					{
						System.out.print("* ");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		public static void hollowPyramidStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print("-");
				}
				for(int k=1;k<=(2*i-1);k++)
				{
					if(k==1 || i==5 || k==(2*i-1))
					{
						System.out.print("*");
					}else {
						System.out.print("=");
					}
				}
				System.out.println();	
			}
		}
		
		public static void hollowPyramidStarPattern1()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					if(i==5 || k==1 || i==k || k==5)
					{
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
			
		public static void invertedPyramidStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=i;k<=5;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		public static void hollowInvertedPyramidStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=i;k<=5;k++)
				{
					if(i==1 || k==i || k==5)
					{
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
		
		public static void invertedPyramidStarPattern1()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=((5*2) -(2*i-1));k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void hollowInvertedPyramidStarPattern1()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=((5*2)-(2*i-1));k++)
				{
					if(i==1 || k==1 || k==((5*2)-(2*i-1)))
					{
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		public static void halfDiamondStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<=5;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		public static void mirroredHalfDiamondStarPattern() 
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=i;k<=5;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void diamondStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=(2*i-1);k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=5-1;i>=1;i--)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=((2*i-1));k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void hollowDiamondStarPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<=5;j++)
				{
					System.out.print("*");
				}
				for(int k=1;k<=(2*i-1);k++)
				{
					System.out.print(" ");
				}
				for(int j=i;j<=5;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				for(int k=(2*i-1);k<(2*5-2);k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void hollowDiamondStarPattern1()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=(2*i-1);k++)
				{
					if(k==1 || k==(2*i-1))
					{
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			for(int i=5-1;i>=1;i--)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=((2*i-1));k++)
				{
					if(k==1 || k==(2*i-1))
					{
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		public static void plusPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(i==3 || j==3 )
					{
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
		
		
		public static void xPattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(i==j || i+j==6)
					{
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
		
		public static void eightStarPattern()
		{
			for(int i=1;i<=5*2;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if((i==1 && (j==1 || j==5)) || (i==5 && (j==1 || j==5)) ||  (i==5*2-1 && (j==1 || j==5)))
				    {
		                System.out.print(" ");
				    }
		            else if(i==1 || i==5 || i==(5*2)-2 || j==1 || j==5)
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
				}
				System.out.println();
			}
		}
			
	
	public static void display()
	{
		
//		Square Star Pattern :->
		
//		squarePattern();
//		hollowSquarePattrn();
//		hollowSquareStarPatternWithDiagonal();
//		rhombusStarPattern();
//		hollowRhombusStarPattern();
//		mirroredRhombusStarPattern();
//		hollowMirroredRhombusStarPattern();

//		Triangle Star Pattern :->
		
//		rightTriangleStarPattern();
//		hollowRightTriangleStarPattern();
//		mirroredRightTriangleStarPattern();
//		hollowMirroredRightTriangleStarPattern();
//		invertedRightTriangleStarPattern();
//		hollowInvertedRightTriangleStarPattern();
//		invertedMirroredRightTriangleStarPattern();
//		hollowInvertedMirroredRightTriangleStarPattern();

//		pyramidStarPattern();
//		pyramidStarPattern1();
//		pyramidStarPattern2();
		
//		hollowPyramidStarPattern();
//		hollowPyramidStarPattern1();
		
//		invertedPyramidStarPattern();
//		hollowInvertedPyramidStarPattern();
//		invertedPyramidStarPattern1();
//		hollowInvertedPyramidStarPattern1();
		
//		halfDiamondStarPattern();
//		mirroredHalfDiamondStarPattern();
//		diamondStarPattern();
//		hollowDiamondStarPattern();
//		hollowDiamondStarPattern1();
		
//		plusPattern();
//		xPattern();
		eightStarPattern();
		
			
		
		
		
	}
	
	public static void main(String[] args) {
		
		display();
		
	}
}
