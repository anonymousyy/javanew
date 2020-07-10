# javanew
Exploring java with this repository
import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			
			System.out.print("enter the no of integers in string:");
			int N = scan.nextInt();
			
			
			System.out.print("enter the strings with numbers(seperated by ,):");
			scan.nextLine();
			String str =scan.nextLine();
			
			String temp = "";
			int count =0;
			int[] numbers = new int[N];
			
			for(int i=0;i<str.length();i++) {
				
				if(str.charAt(i)!=',') {
				temp = temp + str.charAt(i);
			}
			
			else {
				numbers[count] = Integer.parseInt(temp);
				count++;
				temp = "";
			}
			}
			numbers[count] = Integer.parseInt(temp);
			
			for(int j=0;j<numbers.length;j++) {
				System.out.println(numbers[j]);
			}
	}

}

