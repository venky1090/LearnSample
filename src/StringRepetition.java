
public class StringRepetition {
	
	public static  int stringS2RepetedinStringS1(String s1 , String s2){
		int i = 0, j = 0 , repeat = 0 , reset = 0;
	
		
		while(j < s1.length()) {
				
			   if(s2.charAt(i) == s1.charAt(j))
			   {
				       if(i == s2.length()-1) 
					   {
						  i = reset;
						  repeat = repeat + 1;
					   }
				       if(i < s2.length()) {
				  j++;
				  i++;
				       }
				  
			   }else
				    {
		             j++;
		             i = reset;
				    }
					
			}
			
			return repeat;
		}
		
		

public static void main(String[] args) {
		String s2 ="xyz";
		String s1 = "She has a pen and has a pencil has";
		
		int numoftimes = stringS2RepetedinStringS1( s1 , s2);
		
	System.out.println(numoftimes);
		
		
	}
}


	




