package CodingBatExcercises;

public class SameFirstAndLast {

	public static void main(String[] args) {
		int [] numbers = {3};
		
		int [] numberOfPi;
		numberOfPi = new int[3];
		
		
		for(int i = 0; i<numberOfPi.length;i++) {
			
			
		}
			System.out.println(numberOfPi);
		
		System.out.println(sameFirstLastTask(numbers));
	}

	public static boolean sameFirstLastTask(int[] nums) {
		
			if (nums.length >= 1 && nums[0] == nums[nums.length-1]) {
				return true;
			}

	
	return false;
	
		}
	}


	


// Given an array of ints, return true if the array is length 1 or more,
// and the first element and the last element are equal.
