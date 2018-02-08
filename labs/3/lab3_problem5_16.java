import java.util.*;

public class lab3_problem5_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to find prime factorization: ");
		int num = input.nextInt();
		
		if(num  <= 1) {
			System.out.println("Invalid number.");
		}
		
		else {
			
			for(int i = 2; i <= num; i++)
			{
				if(num % i == 0)
				{
					System.out.print(i + " ");
					num = num / i;
					i = 1;
				}
				
			}
		}
		
	}
}
