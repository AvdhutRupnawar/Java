package Practice1;

public class PrimeNo {

	public static void main(String[] args) {

		int no = 7
				;
		int r;
		boolean flag = false;
			for ( int div = 2; div<=no-1;div++)
			{
				r= no%div;
				if (r== 0)
				{
					flag = true;
				
				}
				}
				if (flag == false)
				{
					System.out.println(no + " is  prime No " );}
	
	else
	{			System.out.println((no + " is not a PRIME NO"));
	}
	}}
