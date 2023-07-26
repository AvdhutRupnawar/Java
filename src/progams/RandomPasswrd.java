package progams;

import java.util.Random;

public class RandomPasswrd {

	public static void main(String[] args) {
String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String Lowercase= "abcdefghijklmnopqurstuvwxyz";
String Number = "0123456789";
String Specialchar =" !@#$%^&*?";
String Combination = Uppercase + Lowercase + Number + Specialchar;
int len =7;
char[] Password =new char[len];

Random Pass = new Random ();
for (int i=0;i<len ; i++)
{
	Password[i]= Combination.charAt(Pass.nextInt(Combination.length()) );
	
}
System.out.println("Generated Password is :"+ new String (Password));
	}

}
