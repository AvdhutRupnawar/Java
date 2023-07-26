package Method;

public class Tables {
	static void showTable(int no){
		int sum;
		
		for(int i=1;i<=10;i++)
		{
			sum = no*i;
			System.out.print(sum + " ");
			System.out.println();
		}
			//System.out.print();
}

	

	public static void main(String[] args) {
		showTable(29);
		showTable(22);
		showTable(23);
		showTable(19);
	
	
	}

}
