import java.util.*;

public class p8_5 {
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] m3 = new double[3][3];
		for(int r = 0; r < m3.length; r ++) {
			for(int c = 0; c < m3[0].length; c++) {
				m3[r][c] = a[r][c] + b[r][c];
			}
		}
		
		return m3;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] m1 = new double[3][3];
		double[][] m2 = new double[3][3];
		
		System.out.print("Enter matrix1: ");
		for(int r = 0; r < m1.length; r++) {
			for(int c = 0; c < m1[0].length; c++) {
				m1[r][c] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		for(int r = 0; r < m2.length; r++) {
			for(int c = 0; c < m2[0].length; c++) {
				m2[r][c] = input.nextDouble();
			}
		}
		
		double[][] m3 = addMatrix(m1, m2);
		
		System.out.println(m1[0][0] + " " + m1[0][1] + " " + m1[0][2] + "\t\t" + m2[0][0] + " " + m2[0][1] + " " + m2[0][2] + "\t\t" + m3[0][0] + " " + m3[0][1] + " " + m3[0][2]);
		System.out.println(m1[1][0] + " " + m1[1][1] + " " + m1[1][2] + "\t+\t" + m2[1][0] + " " + m2[1][1] + " " + m2[1][2] + "\t=\t" + m3[1][0] + " " + m3[1][1] + " " + m3[1][2]);
		System.out.println(m1[2][0] + " " + m1[2][1] + " " + m1[2][2] + "\t\t" + m2[2][0] + " " + m2[2][1] + " " + m2[2][2] + "\t\t" + m3[2][0] + " " + m3[2][1] + " " + m3[2][2]);
	}
}
