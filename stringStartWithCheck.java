package String;

public class stringStartWithCheck {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="abc";
		
	boolean startWith=s1.startsWith(s2);  // startWith method are use the check to String are starting same the another string
	System.out.println(startWith);    // print true or false
	
	
	
	
	boolean endWith=s1.endsWith(s2);  // endWith method are the use the check the ending element are the same to another String
	System.out.println(endWith);    // print true or false
	}

}
