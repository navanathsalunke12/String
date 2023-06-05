package String;

public class stringEndWithCheck {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="cd";
		
	
	if(s1.length()>=s2.length())
		
	{
		
		int count=0;
		int s1index=s1.length()-1;     
		for(int i=s2.length()-1;i>=0;i--)   // end with , for loop start with  s2.length-1
		{
			if(s2.charAt(i)==s1.charAt(s1index))
			{
				count++;
			}
			s1index--;
		}
		if(s2.length()==count)
			System.out.println(true);
		else
			System.out.println(false);
		
	}
	else
		System.out.println(false);
	}

}
