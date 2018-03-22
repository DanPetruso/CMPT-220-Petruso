class MyInteger{
	int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return value % 2 == 1;
	}
	
	public boolean isPrime() {
		if (value < 2) return false;
		if (value == 2) return true;
		if (value % 2 == 0) return false;
		for(int i = 2; i < value/2; i+=2)
			if(value % i == 0) return false;
		return true;
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public static boolean isOdd(int num) {
		return num % 2 == 1;
	}
	
	public static boolean isPrime(int num) {
		if (num < 2) return false;
		if (num == 2) return true;
		if (num % 2 == 0) return false;
		for(int i = 2; i < num/2; i+=2)
			if(num % i == 0) return false;
		return true;
	}
	
	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}
	
	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}
	
	public static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}
	
	public boolean equals(int num) {
		return num == value;
	}
	
	public boolean equals(MyInteger a) {
		return value == a.getValue();
	}
	
	public int parseInt(char[] arr) {
		String str = "";
		for(char x : arr) {
			str+=x;
		}
		return Integer.parseInt(str);
	}
	
	public int parseInt(String a) {
		return Integer.parseInt(a);
	}
	
}

public class p10_3 {
	public static void main(String[] args) {
		
		MyInteger a = new MyInteger(10);
		
		System.out.println(a.getValue());
		System.out.println("Even: " + a.isEven());
		System.out.println("Odd: " + a.isOdd());
		System.out.println("Prime: " + a.isPrime());
		
		System.out.println();
		System.out.println("Even: " + a.isEven(3));
		System.out.println("Odd: " + a.isOdd(3));
		System.out.println("Prime: " + a.isPrime(3));
		
		System.out.println();
		System.out.println("Even: " + a.isEven(a));
		System.out.println("Odd: " + a.isOdd(a));
		System.out.println("Prime: " + a.isPrime(a));
		
		char[] arr = {'1', '2', '3'};
		System.out.println(a.parseInt(arr));
		System.out.println(a.parseInt("12345"));
	}
}
