package com.patterns;

public class Pattern {

	public static void pattern1()
	{
		System.out.println("Pattern 1\n");

		for(int i = 0; i <7; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(j+1 + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void pattern2()
	{
		System.out.println("Pattern 2\n");

		for(int i = 0; i <=7; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void pattern3()
	{
		System.out.println("Pattern 3\n");

		int rows = 7;
		//Print upper half of pattern
		for(int i = 1; i <=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		//Print lower half of pattern
		for(int i = rows-1; i >= 1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void pattern4()
	{
		System.out.println("Pattern 4\n");

		int rows = 7;
		
		for(int i = rows; i >= 1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void pattern5()
	{
		System.out.println("Pattern 5\n");

		int rows = 7;
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void pattern6()
	{
		System.out.println("Pattern 6\n");

		int rows = 7;
		
		for(int i = rows; i >= 1; i--)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void pattern7()
	{
		System.out.println("Pattern 7\n");

		int rows = 7;
		
		for(int i = rows; i >= 1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void pattern8()
	{
		System.out.println("Pattern 8\n");

		int rows = 7;
		
		//Printing upper half of the pattern
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
         
        //Printing lower half of the pattern
        for (int i = 2; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
		System.out.println("");
	}
	
	public static void pattern9()
	{
		System.out.println("Pattern 9\n");

		int rows = 7;
		
		for (int i = 1; i <= rows; i++) 
        {
            //Printing first half of the row
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(j+" "); 
            }
             
            //Printing second half of the row 
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
		System.out.println("");
	}
	
	public static void pattern10()
	{
		System.out.println("Pattern 10\n");

		int rows = 7;
		
		for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
		System.out.println("");
	}
	
	public static void pattern11()
	{
		System.out.println("Pattern 11\n");

		int rows = 7;
		
		//Printing upper half of the pattern
        
        for (int i = 1; i <= rows; i++) 
        {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            //Printing i to rows value at the end of each row
            for (int j = i; j <= rows; j++) 
            { 
                System.out.print(j); 
            } 
            System.out.println(); 
        } 
         
        //Printing lower half of the pattern 
        for (int i = rows-1; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            //Printing i to rows value at the end of each row
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("");
	}
	
	public static void pattern12()
	{
		System.out.println("Pattern 12\n");

		int rows = 7;
		
		//Printing upper half of the pattern
        for (int i = 1; i <= rows; i++) 
        {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            //Printing i to rows value at the end of each row
            for (int j = i; j <= rows; j++) 
            { 
                System.out.print(j+" "); 
            } 
            System.out.println(); 
        }
        
        //Printing lower half of the pattern 
        for (int i = rows-1; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            //Printing i to rows value at the end of each row
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("");
	}
	
	public static void pattern13()
	{
		System.out.println("Pattern 13\n");

		int rows = 7;
		
		for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        System.out.println("");
	}
	
	public static void pattern14()
	{
		System.out.println("Pattern 14\n");

		int rows = 7;
		
		for (int i = 1; i <= rows; i++) 
        {
            int num;
            if(i%2 == 0)
            {
                num = 0;
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;
                }
            }
            else
            {
                num = 1;
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;
                }
            }
            System.out.println();
        }
        System.out.println("");
	}
	
	public static void pattern15()
	{
		System.out.println("Pattern 15\n");

		int rows = 7;
		
		for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(1);
            }
             
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("");
	}
	
	public static void pattern16()
	{
		System.out.println("Pattern 16\n");

		int rows = 7;
		
		for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < rows; j++)
            {
                if(i == j)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        System.out.println("");
	}
	
	public static void pattern17()
	{
		System.out.println("Pattern 17\n");

		int rows = 5;
		
		for (int i = 1; i <= rows; i++) 
        {
            int num = i;
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num+" ");
                num = num+rows-j;
            }
            System.out.println();
        }
        System.out.println("");
	}
	
	public static void pattern18()
	{
		System.out.println("Pattern 18 - Floyd's Triangle\n");
		//https://javaconceptoftheday.com/how-to-print-floyds-triangle-in-java/
		int rows = 5;
		int value = 1;
        
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
	}
	
	
}
