import java.util.*;

public class p7_3 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[101];
		int choice = 1;
		
		System.out.print("Enter integers between 1 and 100: ");
		while(choice != 0) {
			choice = input.nextInt();
			arr[choice]++;
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > 0)
				System.out.println(i + " occurs " + arr[i] + " time(s)");
		}
	}
}