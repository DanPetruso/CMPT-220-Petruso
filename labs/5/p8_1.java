import java.util.*;

public class p8_1 {
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for(int i = 0; i < m.length; i++) 
			sum += m[i][columnIndex];
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] arr = new double [3][4];
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[0].length; c++) {
				arr[r][c] = input.nextDouble();
			}
		}
		for(int i = 0; i < arr[0].length; i++)
			System.out.println("The sum of elements at column " + i + " is " + sumColumn(arr, i));

	}
}
