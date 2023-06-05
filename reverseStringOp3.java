package String;

public class reverseStringOp3 {

	public static void main(String[] args) {

	String s1="You all are very very good students";
		
		String [] s2=s1.split(" ");
		
		String s3="";
		
		
		// op3             stneduts doog yrev yrev era lla uoY

		for(int i=s1.length()-1;i>=0;i--)
		{
			s3=s3+s1.charAt(i);
		}
		System.out.println(s3);		
	}

}
