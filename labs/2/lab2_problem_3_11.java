import java.util.Scanner;

public class lab2_problem_3_11 {
	public static void main (String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a number for monthe and a number for year: ");
			
			int month = input.nextInt();
			int year = input.nextInt();
			int days = 0;
	        String monthString = "";
	        
	        switch(month) {
	        	case 1: 
	        		monthString = "January";
	        		days = 31;
	        		break;
	        	case 2: 
	        		monthString = "February";
	        		if(year % 4 == 0 && year % 100 != 0) 
	        			days = 29;
	        		else if(year % 400 == 0)
	        			days = 29;
	        		else
	        			days = 28;
	        		break;
	        	case 3:
	        		monthString = "March";
	        		days = 31;
	        		break;
	        	case 4:
	        		monthString = "April";
	        		days = 30;
	        		break;
	        	case 5:
	        		monthString = "May";
	        		days = 31;
	        		break;
	        	case 6:
	        		monthString = "June";
	        		days = 30;
	        		break;
	        	case 7:
	        		monthString = "July";
	        		days = 31;
	        		break;
	        	case 8:
	        		monthString = "August";
	        		days = 31;
	        		break;
	        	case 9:
	        		monthString = "September";
	        		days = 30;
	        		break;
	        	case 10:
	        		monthString = "October";
	        		days = 31;
	        		break;
	        	case 11:
	        		monthString = "November";
	        		days = 30;
	        		break;
	        	case 12:
	        		monthString = "December";
	        		days = 31;
	        		break;
	        	default:
	        		break;
	        }
	        
	        System.out.println(monthString + " " + year + " had " + days + " days.");
	        
	}
}
