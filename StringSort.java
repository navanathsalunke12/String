package String;

public class StringSort {

	public static void main(String[] args) {
		

		String s1="54321";
		
		    //  char [] ch = null;  // create null ch array
		 
		char []	ch=s1.toCharArray();  // convert the string to array using toCharArray method
		                                // convert the string to character array
		
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])    // using swap method 
				{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
				
				
			}
		}
		
		
		
		String s2=new String(ch); // char array convert the new String and char array is only array convert the String
		System.out.println(s2);
	}

}
