
public class TestB {
	void write() {
		String s1 = null;
		try {
			System.out.println("Length of the String is" + s1.length());
		} catch (NullPointerException e) {
			System.out.println("Don't deal with Null");
		}
	}

	public static void main(String[] args) {
		System.out.println("main started");
		TestB t1 = new TestB();
		t1.write();
		System.out.println("main ends");
	}
}
