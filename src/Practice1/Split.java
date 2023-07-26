package Practice1;

public class Split {

	public static void main(String[] args) {
 
		
		String s = "cyber success pvt ltd";
		String [] s1 = s.split(" ");		
		
		StringBuilder cap= new StringBuilder();

        for (String S : s1) 
        
            cap.append(Character.toUpperCase(S.charAt(0)))
                              .append(S.substring(1))
                              .append("#");
        
        String result = cap.toString().trim();
        System.out.println(result);
    }}
		
		
