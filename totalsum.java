package mark2;
//import java.util.Scanner;
public class totalsum {
	int total(int num) {
		String temp = Integer.toString(num);
		int[] newnum = new int[temp.length()];
		for(int k=0;k<temp.length();k++)
		{
			newnum[k] = temp.charAt(k) - '0';
		}
		//int length = new String(String.valueOf(num)).length();
        //num1 = Integer.toString(num)
		int sum=0, tsum=0;
		for(int i=0;i<newnum.length;i++) {
			for(int j=i;j<newnum.length;j++) {
				sum = sum +  newnum[j];
				}
			System.out.println(""+sum);
		}
		tsum= tsum+sum;
		
	return tsum;
	}
	
	

	public static void main(String[] args) {
		 totalsum s = new totalsum();
		 System.out.println(s.total(84567));
		
	
		
}
}	

