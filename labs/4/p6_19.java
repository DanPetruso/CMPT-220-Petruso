import java.util.*;
class MyTriangle{
	
	public static boolean isValid(double side1, double side2, double side3) {
		boolean flag = false;
		if(side1 + side2 >= side3 && side2 + side3 >= side1 && side1 + side3 >= side2) 
			flag = true;
		return flag;
	}
	
	public static double area(double side1, double side2, double side3) {
		if(side1 >= side2 && side1 >= side3)
			return side2 * side3 / 2;
		if(side2 >= side1 && side2 >= side3)
			return side1 * side3 / 2;
		if(side3 >= side1 && side3 >= side2)
			return side1 * side2 / 2;
		return 0;
	}
}

public class p6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sides of a triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		System.out.println(MyTriangle.isValid(a, b, c)? "The triangle is valid and the area is " + MyTriangle.area(a, b, c) : "Invalid Triangle");
	}
}
