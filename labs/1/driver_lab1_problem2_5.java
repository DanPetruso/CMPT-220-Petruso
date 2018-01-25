import java.util.*;
public class driver_lab1_problem2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		
		double gratuity = rate/100 * subtotal;
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
		
	}
}
