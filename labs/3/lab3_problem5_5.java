import java.text.*;
public class lab3_problem5_5 {
	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("##.00");
		
		System.out.println("Kilograms\tPounds\t|Pounds\t\tKilograms");
		int lbs = 15;
		int kgs = -1;
		double lbsTokgs;
		double kgsTolbs;
		
		for(int i = 0; i < 100; i++) {
			lbs+=5;
			lbsTokgs = lbs/2.2;
			kgs+=2;
			kgsTolbs = kgs*2.2;
			System.out.println(kgs + "\t\t" + format.format(kgsTolbs) + "\t|" + lbs + "\t\t" + format.format(lbsTokgs));
		}

	}
}