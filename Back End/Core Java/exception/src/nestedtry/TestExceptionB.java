package nestedtry;

public class TestExceptionB {
	public static void main(String[] args) {
		System.out.println("main started");
		ExceptionB e1 = new ExceptionB();
		e1.exception(0, "Ramu");
		e1.exception(2, null);
		System.out.println("main ended");

	}

}
