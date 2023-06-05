package String;

public class reverseStringOp1 {

	public static void main(String[] args) {

	String s1="You all are very very good students";
		
		String [] s2=s1.split(" ");
		
		
		String s3="";
		
		
		// op1      students good very very are all You 

		for(int i=s2.length-1;i>=0;i--)
		{
			
			s3=s3+s2[i]+" ";   //  students good very very are all You 

		}
		System.out.println(s3);
	}

}
