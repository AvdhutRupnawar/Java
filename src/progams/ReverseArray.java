package progams;

public class ReverseArray {
	static int [] copyrevArr(int [] arr3)
	
	{int [] arr4 = new int [arr3.length];
	for (int i=arr3.length-1;i>=0;i--)
arr4[arr3.length-1-i]= arr3[i];
	
	return arr4;
	}

	public static void main(String[] args) {

		int [] arr1 = {10,20,0,40,50};
		int [] arr2 = new int [arr1.length];
		arr2= copyrevArr(arr1);
		for (int x : arr2)
			System.out.println(x);
		                      
	}

}
