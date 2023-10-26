package CodingBatExcercises;

import java.util.HashMap;
import java.util.Map;

public class word0 {

	public static void main(String[] args) {
		String[] str = { "world", "world", "where", "how" };
		System.out.println(word0(str));

		/*
		 * Given an array of non-empty strings, return a Map<String, String> with a key
		 * for every different first character seen, with the value of all the strings
		 * starting with that character appended together in the order they appear in
		 * the array.
		 * 
		 */

	}

	public static Map<String, String> word0(String[] strings) {

		Map<String, String> map = new HashMap();
		for (String s : strings) {
			String key = s.charAt(0) + "";
			if (map.containsKey(key)) {
				String value = map.get(key) + s;
				map.put(key, value);
			} else
				map.put(key, s);
		}
		return map;
	}
}
