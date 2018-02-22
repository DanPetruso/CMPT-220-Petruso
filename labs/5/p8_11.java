import java.util.*;

public class p8_11 {
	
	public static int[][] getMatrix(int num){
		int[][] m = new int[3][3];
		int r = 0;
		int c = 0;
		for(int i = 256; i > 0; i/=2) {
			if(num >= i) {
				num -= i;
				m[r][c] = 1;	
			}
			if(c == 2) {
				r++;
				c = 0;
			}
			else 
				c++;
		}
		return m;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 511: ");
		int num = input.nextInt();
		
		int[][] m = getMatrix(num);
		
		for(int r = 0; r < m.length; r++) {
			for(int c = 0; c < m[0].length; c++) {
				System.out.print(m[r][c] == 1? "T ": "H ");
			}
			System.out.println();
		}
		
	}
}