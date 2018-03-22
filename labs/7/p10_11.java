class Circle2D{
	double x;
	double y;
	double radius;
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	boolean contains(double x, double y) {
		return Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2) < radius*radius;
	}
	
	boolean contains(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.x-x, 2) + Math.pow(circle.y-y, 2));
		return distance + circle.radius <= radius;
	}
	
	boolean overlap(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.x-x, 2) + Math.pow(circle.y-y, 2));
		if(this.contains(circle)) return false;
		return distance <= circle.radius + radius;
	}
	
}
public class p10_11 {
	public static void main(String[] args) {
		Circle2D cl = new Circle2D(2, 2, 5.5);
		System.out.println("Area: " + cl.getArea());
		System.out.println("Perimeter: " + cl.getPerimeter());
		System.out.println("Contains point (3,3): " + cl.contains(3,3));
		System.out.println("Contains circle (4,5) r=10: " + cl.contains(new Circle2D(4,5,10.5)));
		System.out.println("Overlaps circle (3,5) r=2.3: " + cl.overlap(new Circle2D(3,5,2.3)));
	}
}
