package exceptionpropagation;

public class C {
	static void o() {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()	);
		}
	}
}
