package mark1;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in = new Scanner(System.in);
	   System.out.print("enter numer");
	   int input = in.nextInt();
	   System.out.println("number is"+input);*/
		
		
		String str = "coding 1234567";
		
		int cnt=0;
		
		for(int h=0;h<str.length();h++){
	
			if(Character.isDigit(str.charAt(h)));
			cnt++;
		
		}
	System.out.println("the count of digits in str is"+ cnt);
	}
	

}
