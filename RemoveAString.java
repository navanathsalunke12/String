package String;

public class RemoveAString {

	public static void main(String[] args) {

		String s1="abcdabcba";
		char ch='a';
		
		
	
	String s2="";	
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=ch)
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		
	
		
	}

}
