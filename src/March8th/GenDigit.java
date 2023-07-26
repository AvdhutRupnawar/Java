package March8th;

import java.util.Random;

public class GenDigit {

	public static  String genDigit(int maxlen) {
String charSet = "0123456789";
Random rnd = new Random ();
String gs= "";
char ch ;
while (maxlen >0)
{
	 int x = rnd.nextInt(charSet.length());
	ch = charSet.charAt(x);
	gs = gs + ch;
	maxlen--;
}	

	return gs;
	}
public static void main(String[] args) {
	String StrNo= genDigit(5);
	int no = Integer.parseInt(StrNo);
	System.out.println(StrNo + " : " +(StrNo+ 10) + ":"+ no +":" + (no +10));
}
}
