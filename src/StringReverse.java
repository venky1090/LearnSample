
public class StringReverse {
	
	public static void main(String[] args) {
		String str = "Bhavana", rev = "";
		
		int strLength = str.length();
		//System.out.println(strLength);
		for(int i = strLength-1 ; i >= 0 ; i-- ) {
		   rev = rev +str.charAt(i);
		}
		
		System.out.println(rev);

	}
	
	public static sample() {
	}
}
