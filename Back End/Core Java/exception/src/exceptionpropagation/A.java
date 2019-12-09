package exceptionpropagation;

public class A {
	static void m() {
		try {
			B.n();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
