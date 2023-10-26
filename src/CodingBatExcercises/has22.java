package CodingBatExcercises;

public class has22 {
	public static void main(String[] args) {
		
		int [] numbers = {2,2,2};
		
		
	System.out.println(has22a(numbers));
		
		
		
		
		
	}
	
	public static boolean has22a(int[] nums) {
		boolean trueorfalse = false;
		for(int i = 0; i < nums.length;i++) {
			
			if(nums[i] ==2 && nums[i++] == 2) {
				return trueorfalse = true;
			}
				else {
					return trueorfalse;
				}
				
			}
		return false;
		}
		
		
		
		
	}

