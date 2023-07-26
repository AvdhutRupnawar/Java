package Arrays;

public class OccuranceArray {
public static void main(String[] args) {
	int [] a = {'x','c','d','e','r','e','x'};
	char ch = 'x' ;
	int cnt = 0;
	
	for ( int i= 0;i<a.length;i++)
	{
		if (a[i] =='x')
		{cnt++;
		}
	}System.out.println(ch + " has occures "+ cnt + " times");
	
}
}
