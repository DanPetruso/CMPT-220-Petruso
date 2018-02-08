import java.util.*;

public class lab3_problem6_5 {

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if(num1 <= num2 && num1 <= num3)
			System.out.println(num2 >= num3? num1 + " " + num3 + " " + num2 : num1 + " " + num2 + " " + num3);
		
		else if(num2 <= num1 && num2 <= num3)
			System.out.println(num1 >= num3? num2 + " " + num3 + " " + num1 : num2 + " " + num1 + " " + num3);
		
		else if(num3 <= num2 && num3 <= num1)
			System.out.println(num2 >= num1? num3 + " " + num1 + " " + num2 : num3 + " " + num2 + " " + num1);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers to be put in increasing order: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
	
		displaySortedNumbers(a, b, c);
	}

}
