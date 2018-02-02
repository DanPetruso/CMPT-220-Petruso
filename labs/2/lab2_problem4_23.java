
import java.util.*;

public class lab2_problem4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked per week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: $");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fedTax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		double grossPay = hours * payRate;
		double fedTaxDeduct = grossPay * fedTax;
		double stateTaxDeduct = grossPay * stateTax;
		double totalDeduct = fedTaxDeduct + stateTaxDeduct;
		
		
		System.out.println("\n\n\nEmployee name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Hourly pay rate: $" + payRate);
		System.out.println("Gross pay: $" + grossPay);
		
		System.out.println("Deductions:");
		System.out.println("\tFederal Withholding " + (fedTax * 100) + "%: $" + Math.round(fedTaxDeduct));
		System.out.println("\tState Withholding " + (stateTax * 100) + "%: $" + Math.round(stateTaxDeduct));
		System.out.println("\tTotal Deductions: $" + Math.round(totalDeduct * 100) / 100);
		
		System.out.println("Net Pay: $" + (grossPay - totalDeduct));

	}
}
