package StringBuilder;

public class UppendUse {
	public static void main(String[] args) {
	
String Str1 = "cyber success pvt ltd";
String [] Str2 = Str1.split(" ");
System.out.println(Str2);

StringBuilder word = new StringBuilder();
int	sl = 	Str1.length();
System.out.println(sl);
for(String s : Str2)
{
 word.append(Character.toUpperCase(s.charAt(0)))
 					.append(s.substring(1))
 					.append("#");
}
	String Result = word.toString().trim();
	
	
System.out.println(Result);

		
}}
