package CodingBatExcercises;

public class endOther {
	public static void main(String[] args) {
	
		System.out.println(endOther1("Hello", "llo"));
		
		
	}
		
		
	public static boolean endOther1(String a, String b) {
		boolean equals = false;
		if(a.toLowerCase().endsWith(b.toLowerCase())) {
			return equals = true;
		}
		
		else if(b.toLowerCase().endsWith(a.toLowerCase())) {
			return equals = true;
		}
		
		return equals;
		
	
		
		
			  
		}
		
		
	}


