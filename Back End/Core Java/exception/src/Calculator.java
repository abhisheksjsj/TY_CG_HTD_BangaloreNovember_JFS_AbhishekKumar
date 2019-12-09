
public class Calculator {

	void divide(int a, int b) {
		System.out.println("Divide started");
		try {
			System.out.println((a / b));
		} catch (ArithmeticException e) {
			System.out.println("Dont divide by 0");
		}
		System.out.println("divided");
	}

}
