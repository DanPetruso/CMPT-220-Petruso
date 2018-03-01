import java.util.Scanner;

class Location{
    public int row, column;
    public double maxValue;

    public Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
}

public class p9_13 {

    public static Location locateLargest(double[][] a){
        double max = a[0][0];
        int rMax = 0;
        int cMax = 0;
        for (int r = 0; r < a.length; r++){
            for (int c = 0; c < a[0].length; c++){
                if(a[r][c] > max){
                    max = a[r][c];
                    rMax = r;
                    cMax = c;
                }
            }
        }
        Location loc = new Location(rMax, cMax, max);
        return loc;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of rows and columns in the array: ");
        int r = input.nextInt();
        int c = input.nextInt();

        double[][] m = new double[r][c];

        System.out.println("Enter the array:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                m[i][j] = input.nextDouble();
            }
        }

        Location loc = locateLargest(m);

        System.out.println("The location of the largest element is " + loc.maxValue + " at (" +
                                loc.row + ", " + loc.column + ").");

    }
}
