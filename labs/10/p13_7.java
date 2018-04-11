public class p13_7 {
    public static void main(String[] args){

        Square[] arr = new Square[]{new Square(5), new Square(2.4),
        new Square(6), new Square(9.5), new Square(50)};

        for(Square x : arr){
            System.out.println("Area: " + x.getArea());
            x.howToColor();
        }

    }
}

interface Colorable{
    void howToColor();
}


class Square extends GeometricObject implements Colorable{

    public double side;

    public Square(double side){
        this.side = side;
    }

    public void setSide(double sideSet){
        side = sideSet;
    }

    public double getArea(){
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
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
