  
public  class CompareTwoarrayWithOutCollection2 {
	
	
	public static boolean compareTwoArrays(int a[],int b[]) {

		int count = 0;
		
		for(int i = 0; i < a.length ; i++){
		if(	a[i] == b[i]) {
			count = count + 1;
		}
		}
		if(count == (a.length)) {
			return true;
		}else
		{
			return false;
		}
	
	}
	

	public static void main(String[] args) {
		int a[] = {4,5,6};
		int b[] = {4,5,6};
		
		//CompareTwoarrayWithOutCollection.compareTwoArrays(a, b);
		
	boolean	output = compareTwoArrays(a,b);
	if(output == true) {
		System.out.println("Two arrays have same elements and same order");
	}else
	{
		System.out.println("false");	
	}
	    
		
		

	}

}
