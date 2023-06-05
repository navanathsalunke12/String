package String;

public class frquencyOfString {

	public static void main(String[] args) {

		String s1="abcdabcaba";
		
		for(int i=0;i<s1.length();i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))     // using removeduplicate
				{
					count++;
				}		
			}
			if(count==0)   
			{
				int count1=0;
				for(int k=0;k<s1.length();k++)  // create the new loop for the unique element
				{
					if(s1.charAt(i)==s1.charAt(k))  // find frequency of unique element 
					{
						count1++;
					}
				}
				System.out.println(s1.charAt(i)+" "+count1);  // print the element and the frequency
			}
		}
		
	}

}
