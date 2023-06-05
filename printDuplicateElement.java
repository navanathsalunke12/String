package String;

public class printDuplicateElement {

	public static void main(String[] args) {

		String s1="aba";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
			if(count!=0)   // count are not equal to 0 then the element are store the new string
			{
				s2=s2+s1.charAt(i);
			}
			
		}
		System.out.println("duplicate element "+s2);
		System.out.println("length of string s2 "+s2.length());
		
		
	}

}
