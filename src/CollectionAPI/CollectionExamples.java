package CollectionAPI;

import java.util.ArrayList;
import java.util.List;

public class CollectionExamples {

	public static void main(String[] args) {
		
		//List
		 List list = new ArrayList <> ();
	        list.add(89);
	        list.add(true);
	        list.add("abc");
	        
	        System.out.println(list);    
	        

	        List<String> arrayList1 = new ArrayList(); // [Pune, Mumbai]
	        arrayList1.add("Pune1");
	        arrayList1.add("Mumbai1");
	        System.out.println(arrayList1);
	        

	        System.out.println(arrayList1.get(0));
	        System.out.println(arrayList1.get(1));
//	        arrayList.remove("Pune");
//	        arrayList.remove(1);
	     //   arrayList1.addAll(arrayList2);
	     //   System.out.println(arrayList2);
	        System.out.println(arrayList1);
		
		
		
		
	}

}
