package String;

public class RepeatThetwiceGivenString {

	public static void main(String[] args) {

		String s1="abcdefg";
		String s2="";
		
		for(int i=0;i<s1.length();i++) // s1.length() are the length of string
		{
	           	// 	char s3=s1.charAt(i);
		     	// s2=s2+s3+s3;
			    //	s2=s2.concat(s1.charAt(i)+""+s1.charAt(i)); // using concat method

			
			s2=s2+s1.charAt(i)+s1.charAt(i);    // charAt(i) is use  print the number of string
		}
		System.out.println(s2);
	}

}
