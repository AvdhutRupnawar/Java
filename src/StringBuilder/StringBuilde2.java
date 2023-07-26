package StringBuilder;

public class StringBuilde2 {

	public static void main(String[] args) {

		int [] a = { 1,2,19,20,10,3,2,8,10};
		int t ;
		
		for(int i =0;i<a.length/2;i++)
		{
			for ( int j= i+1 ; j<a.length/2;j++) {
			//asc sort 
				
				if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			
			if(a[i]%2==1)
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			}	
		
		}
		
		
		for (int i = (a.length/2)+1;i<a.length;i++)
		{
			for (int j = i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			if(a[i]%2==1)
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			}	
			}
		for(int A : a)
			
			System.out.print(A + ",");
		
		}
		
		
		
		
		
	}


