package Arrays;

public class SecondLargest {

	public static void main(String[] args) {
 int []a= {23,22,18,40,60};
 {int max= -100;
 int smax= 0;
 
	 for (int i= 0 ; i<a.length;i++)
	 {
		 if (a[i]> max)
		 {
			 smax=max;
			 max= a[i];
		 }
	 }
	 System.out.println("first Max : " + max );
	 System.out.println("Second max is  : " + smax);
 }
	}

}
