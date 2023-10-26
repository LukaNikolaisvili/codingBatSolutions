package CodingBatExcercises;

public class ArrayExcercise {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 4, 4, 3, 2, 2, 2, 2 };
		

		System.out.println(countClumps(nums));

	}

	public static int countClumps(int[] nums) {
		int count = 0;
		boolean ismatch = false;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == nums[i + 1] && !ismatch) {
				count++;
				ismatch = true;
			}

			else if (nums[i] != nums[i + 1]) {
				ismatch = false;
			}

		}

		return count;

	}

}
