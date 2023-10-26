package CodingBatExcercises;

public class endUp {
	public static void main(String[] args) {

		// Given a string, return a new string where the last 3 chars are now in upper
		// case. If the string has
//		less than 3 chars, uppercase whatever is 
//		there. Note that str.toUpperCase() returns the uppercase version of a string.
		String word = "hellooou";
		System.out.println(endUpString(word));

	}

	public static String endUpString(String str) {

		String result = "";

		if (str.length() < 3) {
			return result = str.toUpperCase();
		}

		else {
			int cut = str.length() - 3;
			String front = str.substring(0, cut);
			String back = str.substring(cut);

			return front + back.toUpperCase();
		}

	}

	// Return false if Array at specific indexes contain either 2 or 3 else return
	// true

	public boolean no23(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 || nums[i] == 3)
				return false;
		}

		return true;
	}

	public int[] biggerTwo(int[] a, int[] b) {

		int SumofA = 0;
		int SumofB = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; i < b.length; j++) {
				SumofA = SumofA + a[i];
				SumofB = SumofB + b[j];

				if (SumofA > SumofB) {
					return a;
				}

				else if (SumofB > SumofA) {
					return b;
				}

			}
		}
		return a;

	}

}
