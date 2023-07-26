package Arrays;

public class Occurance1 {
public static void main(String[] args) {
	int [] a= { 20,2,3,40,13,23,22,20,20,20,20,20};
	{
		int x = 20;
		int cnt = 0;
		for (int i= 0; i<a.length; i++)
		{
			if (a[i]==x)
			{cnt =cnt +1;
			}
		}
		System.out.println(x + " has occures "+ cnt + " times");
	}
}
}
