
public class p13_9 {
// JA: ?
}

class Circle extends GeometricObject implements Comparable<Circle> {

    private double radius;

    public Circle()
    { }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    //Return Radius
    public double getRadius()
    {
        return radius;
    }

    //Set a new Radius
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    //Return Area
    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    //Return Diameter
    public double getDiameter()
    {
        return 2 * radius;
    }

    //Return Perimeter
    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    //Print the circle's information
    public void printCircle()
    {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is"
                + radius);
    }

    @Override
    public int compareTo(Circle circle) {
        if(this.radius > circle.radius)
            return 1;
        if(this.radius < circle.radius)
            return -1;
        else
            return 0;
    }
}
