public class p6_13 {
	public static double compute(int num) {
		double sum = 0;
		for(double i = 1; i <= num; i++) {
			sum += i / (i + 1);
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("i\tm(i)");
		for(int i = 1; i <= 20; i++) {
			System.out.printf("%d\t%.4f\n", i, compute(i));
		}
	}
}
