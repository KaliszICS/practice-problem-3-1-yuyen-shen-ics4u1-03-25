public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(sumOfDigits(123));
		System.out.println(factorial(5));
	}

	public static int sumOfDigits(int x) {
		if (x < 0) {
			x = -x;
		}
		if (x < 10) {
			return x;
		}
		return x % 10 + sumOfDigits(x / 10);
	}

	public static int factorial(int y){
		if (y == 0) {
			return 1;
		}
		if (y < 0){
			return 0;
		}
		return y * factorial(y-1);
	}

	

}
