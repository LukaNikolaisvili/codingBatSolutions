package CodingBatExcercises;

public class firstLast6 {
	public static void main(String[] args) {
		
//		firstLast6([1, 2, 6]) → true
//		firstLast6([6, 1, 2, 3]) → true
//		firstLast6([13, 6, 1, 2, 3]) → false
		
		int [] firstLast6 = {6, 1, 2, 3};
		
		System.out.println(firstLast6task(firstLast6));
		
		
	}
	
	public static boolean firstLast6task(int[] nums) {
		
//		for(int i = 0; i< nums.length; i++) {
//			for(int j = 0; j<nums.length-1;i++) {
				
				if(nums[0] == 6 || nums[nums.length-1] == 6) {
					return true;
				}
				
			
			
			
		
	
		
		
		return false;
		  
	}

}
