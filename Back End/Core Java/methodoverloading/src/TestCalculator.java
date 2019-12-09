
public class TestCalculator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int r1 = c1.add(12);
		System.out.println("The result 1 is " + r1);

		int r2 = c1.add(23, 44);
		System.out.println("the result2 is " + r2);

		double r3 = c1.add(2.5);
		System.out.println("the result 3 is " + r3);

		Calculator.multiply(2.5);
		Calculator.multiply(12);
		Calculator.multiply(15, 3);
	}
}
