import java.util.*;
public class p7_9 {
	
	public static double min(double[] array) {
		double smallest = array[0];
		
		for(double i : array) {
			smallest = Math.min(i, smallest);
		}
		
		return smallest;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		double[] arr = new double[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
		}
		
		System.out.println("The minimum number is: " + min(arr));
	}
}
