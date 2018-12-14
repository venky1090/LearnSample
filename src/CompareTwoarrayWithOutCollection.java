
public class CompareTwoarrayWithOutCollection {

	public static void main(String[] args) {
		int a[] = {4,5,6};
		int b[] = {4,6,6};
		int count = 0;
		
		for(int i = 0; i < a.length ; i++){
		if(	a[i] == b[i]) {
			count = count + 1;
		}
		}
	
		if(count == (a.length)) {
			System.out.print("Two arrays have same elements and same order");
			
		}else
		{
			System.out.println("False");
			
			
		}
		

	}

}
