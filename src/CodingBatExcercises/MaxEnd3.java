package CodingBatExcercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class MaxEnd3 {
	public static void main(String[] args) {

		//System.out.println(mapBully());

//	Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. 
//	In all cases remove the key "c", leaving the rest of the map unchanged.

	}
	
	//swap the first and last elements in the array.
	public int[] swapEnds(int[] nums) {
		
//			  int size = nums.length;
			  
//			  int[] arr = new int[size];
		int size = nums.length;
		
		int [] arr = new int[size];
		
			  nums[0] = nums[-1];
			  nums[-1] = nums[0];
			
			  
			  
			  
			  return arr;
		}


//			Modify and return the given map as follows: if the keys "a" and "b" 
//			have values that have different lengths,
//			then set "c" to have the longer value. If the values exist and have the
//			same length, change them both to the empty string in the map.
//		  

	public Map<String, String> mapAB4(Map<String, String> map) {
		if ((map.containsKey("a") && map.containsKey("b")) && ((map.get("a").length() != (map.get("b").length())))) {
			if (map.get("a").length() > map.get("b").length()) {
				map.put("c", map.get("a"));
			} else if (map.get("a").length() < map.get("b").length()) {
				map.put("c", map.get("b"));
			}
		} else if ((map.containsKey("a") && map.containsKey("b"))
				&& ((map.get("a").length() == (map.get("b").length())))) {
			map.put("a", "");
			map.put("b", "");

		}
		return map;
	}
}
