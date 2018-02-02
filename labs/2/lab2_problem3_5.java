
import java.util.*;

public class lab2_problem3_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int dayNum = input.nextInt();
		System.out.print("Enter the amount of days that will elapse: ");
		int daysAfter = input.nextInt();
		
		daysAfter = daysAfter %7;
		
		String currentDay = "";
		String futureDay = "";
		
		switch(dayNum) {
			case 0: currentDay = "Sunday";
					break;
			case 1: currentDay = "Monday";
					break;
			case 2: currentDay = "Tuesday";
					break;
			case 3: currentDay = "Wednesday";
					break;
			case 4: currentDay = "Thursday";
					break;
			case 5: currentDay = "Friday";
					break;
			case 6: currentDay = "Saturday";
					break;
		}
		
		switch(daysAfter) {
			case 0: futureDay = "Sunday";
					break;
			case 1: futureDay = "Monday";
					break;
			case 2: futureDay = "Tuesday";
					break;
			case 3: futureDay = "Wednesday";
					break;
			case 4: futureDay = "Thursday";
					break;
			case 5: futureDay = "Friday";
					break;
			case 6: futureDay = "Saturday";
					break;
		}
		
		System.out.println("Today is " + currentDay + ", and the future day is " + futureDay + ".");
		
	}
}
