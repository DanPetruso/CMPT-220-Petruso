import java.util.Scanner;

public class p12_5 {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of a triangle:");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        try{
            Triangle tri = new Triangle(a, b, c);
            System.out.println("Good Triangle Mate");
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }
}

class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super("Invalid Triangle");
    }
}

class Triangle extends GeometricObject{
    double side1, side2, side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {

        if(side1 + side2 <= side3 || (side1 + side3 <= side2 || side2 + side3 <= side1))
            throw new IllegalTriangleException();

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
