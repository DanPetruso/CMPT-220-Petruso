
public class lab3_problem6_1 {
	
	public static int getPentagonalNumber(int n) {
		return n*(3*n-1)/2;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.printf("%7d", getPentagonalNumber(i));
			System.out.print(i % 10 == 0? "\n": " ");
		}

	}

}
