package Arrays;
//Even and Odd Numbers
public class EvenNo {

	public static void main(String[] args) {
		int [] arr= {20,30,15,2,50,45,35,57};
		{int r;
		for (int i=0; i<arr.length;i++)
		{
			
		
		r= arr[i]%2;
			if (r==0)
				System.out.println(arr[i]+ ":"+ "even No");
			
			else
				System.out.println(arr[i]+ ":"+ "Odd No");
		}
	}

	}}
