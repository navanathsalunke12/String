package String;

import java.util.Arrays;

public class StringSortUsingCompareMethod {

	public static void main(String[] args) {

		String [] a= {"hi","welcome","to","hefshine"};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				// 1 way 
				// String s1=a[i];
				// String s2=a[j];
				
				// if(s1.compareTo(s2)>0)
				
			   // 2 way
				
			 	if(a[i].compareTo(a[j])>0)  // .compareToIngonreCase this method are use the ingore uppercase letter or lowercase letter
							
				{
					// swap
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		
		
	//	System.out.println(Arrays.toString(a));  // print ARRAY
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}
