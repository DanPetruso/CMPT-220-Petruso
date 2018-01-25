import java.util.*;

public class driver_lab1_problem2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0/5) * celsius + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		
	}
}
