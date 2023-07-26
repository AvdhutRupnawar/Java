package Arrays;

public class MinimumEle {

	public static void main(String[] args) {
int [] arr= {20,35,2,40,30,50};
{int t=0;

	for (int i =0;i<arr.length;i++)
	{
		for (int j=i+1;j<arr.length;j++)
		{
			if(arr[i]> arr[j]);
			{t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}}}
	
System.out.println(arr[0]);
	}
}}
