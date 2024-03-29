import java.util.*;

public class p11_1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three sides of a triangle:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		Triangle tri = new Triangle(a, b, c);
		
		System.out.println("Enter a color:");
		String color = input.next();
		
		tri.setColor(color);
		
		System.out.println("Is the triangle filled? (true/false):");
		boolean filled = input.nextBoolean();
		
		tri.setFilled(filled);
		
		System.out.println("Area: " + tri.getArea());
		System.out.println("Perimeter: " + tri.getPerimeter());
		System.out.println("Color: " + tri.getColor());
		System.out.println("Filled: " + tri.isFilled());
		
	}
}



class Triangle extends GeometricObject{
	double side1, side2, side3 = 1.0;
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	double getSide1() {
		return side1;
	}
	
	double getSide2() {
		return side2;
	}
	
	double getSide3() {
		return side3;
	}
	
	double getArea() {
		double p = this.getPerimeter();
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
	
	double getPerimeter() {
		return (side1 + side2 + side3);
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;

	}
}


class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}
}