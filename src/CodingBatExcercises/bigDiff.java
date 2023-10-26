package CodingBatExcercises;

public class bigDiff {
	public static void main(String[] args) {
		
		
		int[] numbers = {1,9,39,4,5,6};		
		
		System.out.println(bigDifference(numbers));
		
		
	}
	
	
	public static int bigDifference (int[] nums) {
		int diffmax = 0;
		int diffmin = 0;
		int max = nums[0];
		int min = nums[0];
		for(int i = 0; i < nums.length;i++) {
				
			if (nums[i] > max) {
				max = nums[i];
			}
			
				else if(nums[i]<max) {
					min = nums[i];
					
					diffmax = Math.max(max, min);
					diffmin = Math.min(max, min);
					
				}
			}
			 
				
			
		
		
		
		return diffmin + diffmax ;
		  
		
		
	}
	
	
/*Given an array length 1 or more of ints, 
 * return the difference between the largest and smallest values in the array. Note: 
 * the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or 
 * larger of two values.
bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8  */	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
