
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f, f1 = 0,f2 =1 , n = 10;
		for(int i = 0 ; i < n ; i++) {
			
		f = f1;
		f1 = f2;
		f2 = f + f1;
		System.out.print(f2 + " ");
		
		}
		

	}

}
