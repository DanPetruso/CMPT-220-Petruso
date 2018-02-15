import java.util.*;

public class p7_11 {
	
	public static double mean(double[] x) {
		double sum = 0;
		for(double i : x) {
			sum += i;
		}
		return sum / x.length;
	}
	
	public static double deviation(double[] x) {
		double mean = mean(x);
		double dev = 0;
		for(double i : x) {
			dev += Math.pow(i - mean, 2);
		}
		return Math.sqrt(dev/(x.length-1));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		double[] arr = new double[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
		}
		
		System.out.printf("The mean is %.2f\n", mean(arr));
		System.out.printf("The standard deviation is %.5f", deviation(arr));
	}
}