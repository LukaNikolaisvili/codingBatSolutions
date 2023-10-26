package CodingBatExcercises;

public class plusTwo {
	public static void main(String[] args) {

		int[] a = { 3, 3 };

		System.out.println(double23(a));

	}

	public static boolean double23(int[] nums) {
		
		
		boolean answer = false;
		
		for(int i = 0; i<nums.length; i++) {
			
			if(nums.equals(null)) {
				
			}
			
			
			if((nums[i] == 2 && nums[i++] == 2) || (nums[i] == 3 && nums[i++] == 3)) {
				return true;
			}
			
			else {
				return false;
			}
				
			}
		
		return answer;
		
		
		
		  
	}

}
