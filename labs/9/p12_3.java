import java.util.Random;
import java.util.Scanner;

public class p12_3 {
    public static void main(String[] args){
        int[] arr = new int[100];
        Random gen = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            arr[i] = gen.nextInt(10) + 1;
        }

        int index = input.nextInt();

        try{
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
    }
}
