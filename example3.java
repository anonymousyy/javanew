package mark1;

public class example3 {
	
	public static void main(String[] args) {
	int m1[][] = new int[5][4];
	int i,j,k =0;
	for( i=0;i<5;i++) 
		for(j=0;j<4;j++) {
			m1[i][j]=k;
			k++;
		}
	
	for( i=0;i<5;i++) {
		for(j=0;j<4;j++)
				System.out.print(" "+m1[i][j]);
	System.out.println();
	}
	}
	

}
