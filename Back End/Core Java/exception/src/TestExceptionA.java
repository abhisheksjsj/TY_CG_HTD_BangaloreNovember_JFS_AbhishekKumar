
public class TestExceptionA {
	public static void main(String[] args) {
		System.err.println("main started");
		ExceptionA e1 = new ExceptionA();
		e1.exception(0, "Ramu");
		e1.exception(2, null);
		System.out.println("main ended");

	}
}
