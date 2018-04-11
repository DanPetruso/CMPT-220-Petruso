public class p13_11 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon oct = new Octagon(5);

        System.out.println("Area: " + oct.getArea());
        System.out.println("Perimeter: " + oct.getPerimeter());

        Octagon oct2 = (Octagon) oct.clone();

        int compare = oct.compareTo(oct2);

        if(compare == 0)
            System.out.println("The octagons are the same.");
        else
            System.out.println("The octagons are different.");

    }
}

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{

    double side;

    public Octagon(double side){
        this.side = side;
    }

    public double getArea(){
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    public double getPerimeter(){
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if(this.side > o.side)
            return 1;
        if(this.side < o.side)
            return -1;
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}