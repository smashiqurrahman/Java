package misc;

public class ReverseString {
	public void makeTheStringReverse(String theString) {
		char c[] = theString.toCharArray();
		String theRev = "";
		
		for(int i = c.length-1; i >= 0; i--) {
			theRev += c[i];
		}
		
		System.out.println(theString);
		System.out.println(theRev); 
		
	}
}
