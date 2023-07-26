package progams;

import java.util.Scanner;

public class UserEvenOdd {

	public static void printEven(int no,String Prefix)
	{
		if (no%2==0)
			System.out.println(Prefix + no);
	}
	public static void printOdd(int no,String Prefix)
	{
		if (no%2==1)
			System.out.println(Prefix + no);
	}
	public static void main(String[] args) 
	{
	
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter either Even or odd");
		String Input=Sc.next();
		if (Input.equals("even"))
		{int i;
		String Prefix = "Even No :";
		for( i=0;i<=10;i++);
		printEven(i,Prefix);
	}
	 else if (Input.equals("odd"))
		{int i;
		String Prefix = "Odd No :";
			for( i=0;i<=10;i++);
			printOdd(i,Prefix);
		}	
		Sc.close();
		}}

