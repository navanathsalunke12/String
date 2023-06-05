package String;

public class stringStartWithCheck1 {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="abc";
		
		if(s1.length()>=s2.length())   // check length s1 length are always greater to string s2
		                            // s2 length are the greater then the false print 
		
		{
			int count=0;
			for(int i=0;i<s2.length();i++)  // s2 length are use the for loop because checking the element are the s2 string to s1
			{
				if(s2.charAt(i)==s1.charAt(i))   // check one by one element
				
				{
					count++;
				}
			}
			
			if(s2.length()==count)  // count are the same of the string s2 length then print the true
				System.out.println(true);
			else
			    System.out.println(false);
			
		}
		else
			System.out.println(false);
		
		
	}

}
