package String;

public class methodCreate1 {

	public static void main(String[] args) {


		String s1="  ";
		
		boolean blank=s1.isBlank();  // blank method is a consider a space then the print true blank method space consider blank string 
		System.out.println(blank);   // blank string are the chara num special symbol are the given string then print false 
		
		boolean empty=s1.isEmpty(); // empty method are the not condiser chara,number,symbol,space
		System.out.println(empty);
		
	boolean contains=s1.contains("ch");     // check the specific input string
	System.out.println(contains);
		
	boolean equal=s1.equals("abc");    // check the given string are same or not
	System.out.println(equal);
	
	int index=s1.indexOf("cd");   // Returns the index within this string of the first occurrence ofthe specified character. If a character with value ch occurs in the character sequence represented bythis String object
	System.out.println(index);  // index of element are the print the first element
	
	int lastindex=s1.lastIndexOf("fg"); // Returns the index within this string of the last occurrence ofthe specified character. For values of ch in therange from 0 to 0xFFFF (inclusive), the index (in Unicode codeunits) returned is the largest value k such that: 
	System.out.println(lastindex);     // print the given string last occurance string index print
	
	}

}
