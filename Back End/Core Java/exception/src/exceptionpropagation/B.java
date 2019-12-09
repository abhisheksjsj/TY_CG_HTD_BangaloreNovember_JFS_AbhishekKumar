package exceptionpropagation;

public class B {
	static void n() {
		try {
			C.o();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
