package Method;

public class MethodDemo {
	
	static void show(String name,String Lname,String city,int age)
	{
		System.out.println(name +":"+ Lname + ";"+ city + " ;" + age) ;
		
	}
	public static void main(String[] args) {
		String name = "Virat";
		String Lname = "kohli";
		String city = " Dehli";
		int age = 34;
		
		for(int i= 0; i<=10;i++) {
		show(name,Lname,city,age);
		System.out.println("------------------");
		
	}

}
}