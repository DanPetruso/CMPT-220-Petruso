import java.util.*;
public class p7_5 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		int[] arr = new int [10];
		for(int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			boolean isDistinct = true;
			
			for(int j = 1; j < 10; j++) { // JA: If you start at 0, the condition will always be true
				if(arr[i] == arr[j]) {
					isDistinct = false;
					break;
				}
			}
			
			if(isDistinct) // JA: You also need to add one instance of the number (even when duplicate)
				list.add(arr[i]);
		}
		System.out.println("The number of distinct numbers is " + list.size());
		System.out.print("The distinct numbers are: ");
		for(int i : list) {
			System.out.print(i + " ");
		}
	}

}
