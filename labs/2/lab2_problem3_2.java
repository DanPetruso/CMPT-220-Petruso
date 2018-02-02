import java.util.*;

public class lab2_problem3_2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = (int) (Math.random()*101);
		int b = (int) (Math.random()*101);
		int c = (int) (Math.random()*101);
		int answer = a + b + c;
		
		System.out.print("Enter the sum of " + a + " " + b + " " + c + ":  ");
		int guess = input.nextInt();
		
		System.out.println(guess == answer?"Correct!" : "Incorrect!" );
		
	}
}
