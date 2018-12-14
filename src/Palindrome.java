
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 237 , reverse = 0, a = n;
		while(n > 0) 
		{
			int reminder = n % 10;
			reverse = reverse * 10 + reminder ;
			n = n / 10 ;
		}
		
		System.out.println(reverse);
		
		if(a == reverse)
		{
			System.out.println("n is palindrome");
			
		}else
		{
			System.out.println("n is not palondrome");
		}	

	}

	public static void sample() {
		
	}
}
