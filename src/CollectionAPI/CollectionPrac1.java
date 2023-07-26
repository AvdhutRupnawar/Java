package CollectionAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionPrac1 {

	public static void main(String[] args) {
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
		
		/*
	    [
	    {num1:1,num2:2},
	    {num1:15,num2:23},
	    {num1:13,num2:22}
	    ]
	    List<Map<String, Integer>>
	*/

		List<Map<String,Integer>> arraylist3 = new ArrayList<>();
		Map<String,Integer>map1= new HashMap<>();
		map1.put("num1",1);
        map1.put("num2",2); 
        arraylist3.add(map1);
        
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("num1",3);
        map2.put("num2",4);
        arraylist3.add(map2);
        
		System.out.println(map2.get("num1").hashCode());
		System.out.println(map2.get("num2").hashCode());
		
		 Map<String, Integer> map3 = new HashMap<>();
	        map3.put("num1",3);
	        map3.put("num2",6);
	        arraylist3.add(map3);

	        System.out.println(arraylist3);
		
		
		
	}

}
