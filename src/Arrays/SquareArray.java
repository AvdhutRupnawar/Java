package Arrays;

public class SquareArray {

	public static void main(String[] args) {
int [] a = {10,20,30,43,24,11,23,44};
{
	int sum =0;
	int r;
	for (int i=0; i<a.length;i++)
	{
		r= (a[i]*a[i]);
		sum = sum + r;
		System.out.println("a[" +i + "] : " + r);
	}
	System.out.println(" Total sum : " + sum);
	}
}

}
