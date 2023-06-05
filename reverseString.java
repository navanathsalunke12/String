package String;

public class reverseString {

	public static void main(String[] args) {

		String s1="You all are very very good students";
		
		String [] s2=s1.split(" ");
		
		
		
		
		
	
		String Mstr="";
	// op2   uoY lla era yrev yrev doog stneduts 
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];    // store the s2[i] in new string
			
           	String s3="";             
			for(int j=temp.length()-1;j>=0;j--)     // new string the revrse loop
			{
				s3=s3+temp.charAt(j);   // store the new string
			}
			Mstr=Mstr+s3+" ";    // store the new string
			
			
		}
		
		
		
		System.out.println(Mstr);   //print the STring
		
		
		
		
		
	
		
		
		
		
		
	}

}
