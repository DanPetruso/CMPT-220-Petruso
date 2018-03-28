import java.util.*;

public class p11_11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList <Integer> arr = new ArrayList<Integer>();
		
		System.out.println("Enter 5 numbers:");
		for(int i = 0; i < 5; i++) {
			int x = input.nextInt();
			arr.add(x);
		}
		
		System.out.print("Sorted numbers are: ");
		Collections.sort(arr);
		for(int x : arr)
			System.out.print(x + " ");
		
	}
}
