package String;

public class MethodCreate {

	public static void main(String[] args) {

		String s1="cbba";
		String s2="ab";
		
		
		char ch=s1.charAt(0);
		System.out.println(ch);
		
		
		
		int codepoint=s1.codePointAt(1);  // the method are use the char ascci value print of the index char
		System.out.println(codepoint);
		
		int codepointBefore=s1.codePointBefore(2);  // this method are print the index before char ascci value
		System.out.println(codepointBefore);
		
		
		int ans=s1.compareTo(s2);  // this method use the compare ascci value of the character 
		System.out.println(ans);  // value are positive this senerio s1 string greater 
		                          
	}

}
