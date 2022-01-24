package org.dummy;

public class Sample2 {
	
	public static void main(String[] args) {
	
	int i = 12421;
	
	int reverse = 0; 
	
	int temp = i;
	
	while (i>0){
	
 	int a = i/10;
	
	int b = i%10;
	
	reverse = b+(reverse*10);
	
	i = a;}
	
	System.out.println(reverse);
	
	if (temp==reverse) {
		System.out.println("palindrome number");
	}
	else {
		System.out.println("not a palindrome number");
	}
	}
}
	
	

