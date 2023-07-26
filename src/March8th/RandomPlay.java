package March8th;

import java.util.Scanner;
import java.util.Random;
public class RandomPlay {

	public static void main(String[] args) {
Scanner Ab = new Scanner(System.in);
System.out.println(" Enter 0 for Rock "+" Enter 1 for Paper "+" Enter 2 for Scissor");
int UserInput = Ab.nextInt();

Random Rd = new Random ();
int computerInput = Rd.nextInt(3);
System.out.println("computerInput : "+ computerInput);

if (UserInput == computerInput)
{	System.out.println("Draw");
	}
else if (UserInput == 0 && computerInput ==3 || UserInput == 1 && computerInput ==0 || UserInput == 2 && computerInput ==1) 
{
	System.out.println("You Win");
}
else
{System.out.println("Computer Win");
}
//System.out.println("computerInput : "+ computerInput);
{
	

}
Ab.close();
;
	}

}
