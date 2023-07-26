package CollectionAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pract3 {

	public static void main(String[] args) {
		 //Map with non primitive data type
        /*{
            "empDetails": {
                         "name": "cyber",
                         "empId": 100,
                         "address":"pune",
                         "cities": ["pune", "mumbai"]
                         }
            }  [2,1,3,4,2,1,4], [2,1,3,4]
         */
		Map<String,Map<String,Object>> map1 = new HashMap<>();
		Map<String,Object> map2 = new HashMap<>();
		map2.put("name", "cyber");
		map2.put("empId", 100);
		map2.put("address","pune");
		map2.put("cities", Arrays.asList("pune", "mumbai"));
		
		map1.put("empDetails", map2);
		System.out.println(map1);
		
		
		
		
	}

}
