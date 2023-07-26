package progams;

public class OddEvenMethod {
	
public static void printEvenOdd(int no)
	{
		if (no%2==0)
			System.out.println(no);
	}
	

	public static void main(String[] args) {
		System.out.println("Below are nosbetween 0 t 10");
		for (int i=0;i<=10;i++)
		{
			printEvenOdd(i);
		}
	}

}

