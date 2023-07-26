package progams;

import java.util.Scanner;

public class ArmstrongNoDemo {

	static int findExp (int n,int len)
	{
		int sum =1 ;
		for (int i=1;i<=len;i++)
			sum = sum *n;
		return sum;
		
	}
	static boolean verifyArmstrongNo (int no)
	{
		int len = String.valueOf(no).length() ;
		double sum =0;
		int r=0, orgNo=no;
		
		while(no>0)
		{
			r=no%10;
			//sum = sum + Math.pow(r,len);
			sum = sum+findExp(r,len);
			no=no/10;
		}
		
		if (sum == orgNo)
			return true;
		else
			
			return false;
			
	}

	public static void main(String[] args) {
	int  a,b;
		
		
		Scanner Sc = new Scanner (System.in);
	System.out.println("Enter first No ");
	a = Sc.nextInt();
			
	}

}
