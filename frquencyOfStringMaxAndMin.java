package String;

public class frquencyOfStringMaxAndMin {

	public static void main(String[] args) {

		String s1="abcdabcaba";
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		char ch=0;
		char ch1=0;
		for(int i=0;i<s1.length();i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;  // calculate the count is duplicate element
				}
				
			}
			if(count==0)
			{
				int count1=0;
				for(int k=0;k<s1.length();k++)
				{
					if(s1.charAt(i)==s1.charAt(k))
					{
						count1++;   // calculate the  count of unique element
					}
				} 
				if(count==0)    // calculate the min and max
				{
					if(count1>max)  
					{
						max=count1;
						ch=s1.charAt(i);  // store the max element
					}
					
					if(count1<min)    // store the min element
					{
						min=count1;
						ch1=s1.charAt(i);
					}
				}
			}
			
			
			
		}
		
		
		System.out.println("max of given string is "+ch+" "+max);
		System.out.println("min of given string is "+ch1+" "+min);
		
		
	}

}
