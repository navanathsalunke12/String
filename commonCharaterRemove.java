package String;

public class commonCharaterRemove {

	public static void main(String[] args) {

		String s1="aacdb";
		String s2="gafd";
		
		String s3=s1+s2;
		String s4="";
		for(int i=0;i<s3.length();i++)
		{
		
			int count=0;
		
		    for(int j=i+1;j<s3.length();j++)
		    	
		    	
		    {
		    	if(s3.charAt(i)==s3.charAt(j))
		    	count++;
		    }
		    
		    
		    
		    int count1=0;
		    
		    for(int k=0;k<i;k++)
		    {
		    	if(s3.charAt(i)==s3.charAt(k))
		    	{
		    		count1++;
		    	}
		    }
		    
		    
		    if(count==count1)
		    	s4=s4+s3.charAt(i);
		}
		System.out.println(s4);
	}

}
