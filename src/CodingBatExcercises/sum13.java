package CodingBatExcercises;

public class sum13 {
	 public static void main(String[] args) {

		int[] numbers = {1,2,3};		
		
		System.out.println(sum13a(numbers));
			  
		}

	public static int sum13a(int[] nums) {
		
		int count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums.length == 0) {
				
				return count = 0;
			}
			
			else if(nums[i] == 13) {
				return count = count + 0;
			}
			
			else if (nums[i] == 13 && nums[i++] == nums.length) {
				return count = count + 0;
				
			}
			
			else{
				return i;
				
			}
			
		}
		
		
		return count;
		
		
		
		
	}
}
		


//Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
//
//
//sum13([1, 2, 2, 1]) → 6
//sum13([1, 1]) → 2
//sum13([1, 2, 2, 1, 13]) → 6
		
		
		
