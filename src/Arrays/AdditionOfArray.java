package Arrays;

public class AdditionOfArray {
	
	static void show()
	{
		
		for(int i= 0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				}
		}
	}

	public static void main(String[] args) {

		int [] [] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		                 };
		
		int [] [] b = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
							};
		int [] [] c= new int[a.length][a[0].length];
		System.out.println("c.row: " + c.length);
		System.out.println("c.col : " + c[0].length);
		
		System.out.println("--------------------------\n------");
		
	/*	for(int i= 0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				}
		}
		*/
		AdditionOfArray.show();
		for (int i = 0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
				System.out.print(c[i][j] + "\t" );
			System.out.println();
		}
		
	}

}
