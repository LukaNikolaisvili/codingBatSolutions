package CodingBatExcercises;

public class missingChar {
	public static void main(String[] args) {
		
		String word = "Chocolate";
		System.out.println(frontBack(word));
		
		
		
	}
	
	
	
	public static String frontBack(String str) {
		String newWord = "";
		String front = null;
		 
		if (str.length() >= 3) {
			front = str.substring(0, 3);
			
		}
			
//		else {
//			front = str;
//		}
		   
		  
		  // last + mid + first
		  return front+front+front;//str.charAt(str.length()-1) + mid + str.charAt(0);
		

			
		
		

		
		  
	}
	
//	frontBack("code") → "eodc"
//	frontBack("a") → "a"
//	frontBack("ab") → "ba"

}
