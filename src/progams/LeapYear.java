package progams;

public class LeapYear {

	public static void main(String[] args) {
//main condition: The year should be dvisible by 4 
		//another conditon: The leapyear shouldn't be a century year or should be divisible by 400. 

int yr= 2020;
if ( yr%4==0 && yr%400!=0)
{
	System.out.println(yr + " is a leap year");
}
else
	{
	System.out.println(yr + " is not a leap year");
	
     }
}
	
	}


