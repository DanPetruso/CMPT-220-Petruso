import java.util.*;
public class driver_lab1_problem2_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of minutes: ");
		double min = input.nextDouble();
		double totalDays = min/1440;
		int years = (int)totalDays/365;
		int days = (int)totalDays%365;
		
		System.out.println(min + " minutes is approximately " + years + " years and " + days +" days.");
	}
}
