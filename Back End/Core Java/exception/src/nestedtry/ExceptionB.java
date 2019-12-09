package nestedtry;

public class ExceptionB {

	void exception(int a, String b) {
		try {
			System.out.println(b.length());
			try {
				System.out.println(500 / a);
			} catch (ArithmeticException e) {
				System.out.println("dont deal with 0");
			}

		}

		catch (NullPointerException e1) {
			System.out.println("cannot deal with null");
		}

	}
}
