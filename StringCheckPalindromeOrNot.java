package String;

public class StringCheckPalindromeOrNot {

	public static void main(String[] args) {

		String s1="aba";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)  // string are use reverse for loop 
		{
			s2=s2+s1.charAt(i);  // s1 string are add to s2 blank string
		}
	
		
		if(s1.equals(s2))  // compare two string are  use the equal method 
			System.out.println("String are palindrome");
		else
			System.out.println("String are not palindrome");
	

		
		// second way 
		
//          boolean ans=s1.equals(s2);    // check equals two string and store the boolean ans
//	       if(ans==true)
 //        System.out.println("pali");
//	     else
//		   System.out.println("not");
	
	
	}
	

}
