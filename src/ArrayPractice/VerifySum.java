package ArrayPractice;

public class VerifySum {

	public static void main(String[] args) {

		int[] a = {10,20,30,40,50};
		int No = 70;
		for ( int i = 0; i<a.length;i++)
		{
			for(int j=i+1 ; j<a.length;j++)
			{
				int sum = a[i]+a[j];
				if (sum==No)
				{
					System.out.println("Numbers are = " + a[i] + " & " + a[j]);
				}
			}
		}
		
		
	}

}
