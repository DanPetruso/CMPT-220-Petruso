import java.util.*;

public class p7_15 {

	public static int[] eliminateDuplicates(int[] list) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < list.length; i++)
			set.add(list[i]);
		
		int[] distinct = new int[set.size()];
		int c = 0;
		for(int x : set) {
			distinct[c] = x;
			c++;
		}
		return distinct;
			
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.print("Enter ten integers: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.print("The distinct numbers are: ");
		for(int i : eliminateDuplicates(arr)) 
			System.out.print(i + " ");
		
	}

}
