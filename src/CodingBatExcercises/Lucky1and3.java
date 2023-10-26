package CodingBatExcercises;

public class Lucky1and3 {
	public static void main(String[] args) {
		
		int[] lucky13 = {1, 2, 3};
		
		
		System.out.println(lucky13(lucky13));
		

	}
	
	public static boolean lucky13(int[] nums) {
		boolean tf = false;
		for(int i = 0; i < nums.length;i++) {
			for(int j = 0; j< nums.length-1; j++) {
			if(nums[i] == 1 || nums[j] == 3) {
				return tf;
				
				}
		
			else if(nums[i] == 3 && nums[j] == 1 || nums[j] == 1 && nums[i] ==3)  {
				return tf;
			}
			
		
		}
	
		
		}
		
		return tf = true;
	}
}

	
	
	
	
	
//	
//	Given an array of ints, return true if the array contains no 1's and no 3's.
//
//
//			lucky13([0, 2, 4]) → true
//			lucky13([1, 2, 3]) → false
//			lucky13([1, 2, 4]) → false

