package progams;

public class MethosDemo {

	public static int addition (int a,int b)
	{
	int	sum = a+b;
	return sum;
	}
	public static int substraction (int a,int b )
	{int sub = a-b;
	return sub ;
	}
	public static int multiplication ( int a,int b)
	{
		int mul = a* b;
		return mul;
		
	}
	public static int division(int a,int b)
	{
		int  div = a/b ;
		return div ;
	}
	public static void main(String[] args) {
	//	for (int i =0; i<=3; i++)
		
		System.out.println("sum : "+ addition(10,40	));
		System.out.println("sub :" + substraction(10,40));
		System.out.println("mul :" + multiplication(10,40));
		System.out.println("div :" + division(45,10));

	}

}
