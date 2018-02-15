public class p6_9 {
	
	public static double footToMeter(double foot) {
		double meter = foot / 3.2808;
		return meter;
	}
	
	public static double meterToFoot(double meter) {
		double foot = meter * 3.2808;
		return foot;
	}
	
	public static void main(String[] args) {

		System.out.println("Feet\t\tMeters\t|Meters\t\tFeet");
		double j = 20;
		for(double i = 1; i <= 10; i++) {
			System.out.printf("%.1f \t\t %.3f \t|%.1f\t\t %f.3\n", i, footToMeter(i), j, meterToFoot(j));
			j+=5;
		}
	}
}
