package Arrays;

public class MultipleArray {

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
		System.out.println("---------\n------");
		
		for(int i=0 ; i<a.length;i++)
		{
			for ( int j=0; j<a[0].length; j++)
			{
				for(int k=0; k<a.length;k++)
				{
					c[i][j]= a[j][k]*b[j][k];
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				System.out.print(c[i][j] + "\t");
				System.out.println();
			}
		}
		
		
		
		
		
		
	}

}
