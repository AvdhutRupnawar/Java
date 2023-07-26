package Arrays;

public class PrimeArray {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 2, 35, 40, 56, 76, 45 };
		{
			int r;
			boolean f = false;

			for (int i = 0; i < arr.length; i++) {
				int div = 2;
				while (div < i) {
					r = arr[i] % div;
					if (r == 0) {
						f = true;
						break;
					}
					div++;
				}
				if (f == true) {
					System.out.println(arr[i] + " is a Prime No");
				} else {
					System.out.println(arr[i] + " is a Not Prime No");
				}
			}
		}
	}
}
