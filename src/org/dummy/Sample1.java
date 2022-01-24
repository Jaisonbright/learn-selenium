package org.dummy;

public class Sample1 {

	public static void main(String[] args) {
		
		int i = 123321; int sum =0;
		
		while (i>0) {
		 
		int a = i/10;
		
		int b = i%10;
		 
		sum = b+(sum*10);
		
		i=a;
			
	}

	System.out.println(sum);
}
}