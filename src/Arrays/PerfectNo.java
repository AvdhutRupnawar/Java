package Arrays;

public class PerfectNo {

	public static void main(String[] args) {
int [] a = { 10,20,30,22,11,54,57,62};
int sum=0;
int r;
for(int i =0;i<a.length;i++) {
for ( int div=1;div<a[i]; div++)
{
	r=(a[i]%div);
			if (r==0) 
			sum = sum + div;

{
		if (sum == a[i])
		
			System.out.println(a[i] + "is a perfect No");		}
}
}
	}}

