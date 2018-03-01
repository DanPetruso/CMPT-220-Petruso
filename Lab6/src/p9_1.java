class Rectangle{
    double width = 1;
    double height = 1;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return this.width * 2 + this.height * 2;
    }
}

public class p9_1 {
    public static void main (String[] args){
        Rectangle a = new Rectangle(4, 40);
        Rectangle b = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle a:\nwidth: " + a.width + "\nheight: " + a.height
                + "\narea: " + a.getArea() + "\nperimeter: " + a.getPerimeter());
        System.out.println("\nRectangle b:\nwidth: " + b.width + "\nheight: " + b.height
                + "\narea: " + b.getArea() + "\nperimeter: " + b.getPerimeter());
    }
}
