package CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pract4 {

	public static void main(String[] args) {
	      /* {
	        "data": [
	            {
	               "ids": [2,1,3,4,5],
	               "department": "IT"
	            },
	            {
	               "ids": [22,12,32,42,52],
	               "department": "IT"
	            }
	        ],
	        "empDetails": {
	               "empId": 200,
	               "salary": 1000
	        },
	        "active":true
	       }*/
		Map<String, Object> map = new HashMap<>();
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> innerMap1 = new HashMap<>();
		List<Integer> innerList1 = Arrays.asList(2,1,3,4,5);
		innerMap1.put("ids", innerList1 );
		innerMap1.put("department", "IT");
		
		Map<String, Object> innerMap2 = new HashMap<>();
		List<Integer> innerList2 = Arrays.asList(21,11,31,41,51);
		innerMap1.put("ids", innerList2 );
		innerMap1.put("department", "IT");
		
		list.add(innerMap1);
		list.add(innerMap2);
		
		map.put("data", list);
		Map<String, Integer> innerMap3 = new HashMap<>();
		innerMap3.put("empId", 200);
		innerMap3.put("salary", 1000);
		map.put("empDetails", innerMap3);
		map.put("active", true);
		
		System.out.println(map);
		
		List<Map<String, Object>> mp = (List<Map<String, Object>>)map.get("data");
		for(Map<String, Object> mp1 : mp) {
			List<Integer> ls = (List<Integer>) mp1.get("ids");
			for(Integer x : ls) {
				Collections.sort(ls);
				System.out.print(x+" ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
