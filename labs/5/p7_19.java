import java.util.*;

public class p7_19 {
	
	public static boolean isSorted(int[] list) {
		for(int i = 0; i < list.length-1; i++) {
			if(list[i] > list[i+1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(isSorted(arr)? "The list is already sorted" : "The list is not sorted");
		
	}

}
