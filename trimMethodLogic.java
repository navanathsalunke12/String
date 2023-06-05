package String;

public class trimMethodLogic {

	public static void main(String[] args) {

		String s1="     abc xyz   ";   // space remove 
		
		int start=0;     // start  with zero
		for(int i=0;i<s1.length();i++)  // use for loop starting with  zero
		{
			if(s1.charAt(i)==' ')    // check the space are equal equal  to s1.charAt(i) then start are ++
				start++;
			else                     // space are not find then break the loop
				break;
			
		}
		System.out.println(start);
		
		
		int end=s1.length()-1;      // end start with ending element  of s1.length()-1
		for(int i=s1.length()-1;i>=0;i--)    // use reverse for loop
		{
			if(s1.charAt(i)==' ')
				end--;      // end --
			else
				break;
		}
		System.out.println(end);
		
		
		
		for(int i=start;i<=end;i++)         
		{
			System.out.print(s1.charAt(i));
		}
		
		
		
		
		
		
		
	}

}
