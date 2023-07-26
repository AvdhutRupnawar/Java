package CollectionAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pract2 {

	public static void main(String[] args) {

        // [ { "ids": [1,2,3,4]}]  List<Map<String, List<Integer>>>


        List<Map<String, List<Integer>>> arrayList4 = new ArrayList<>();

        Map<String, List<Integer>>  map =  new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);  // [1,2,3]
        map.put("ids",list1 );  // { "ids": [1,2,3]}
        arrayList4.add(map); //[{ "ids": [1,2,3,4]}]

        System.out.println(arrayList4);
	}

}
