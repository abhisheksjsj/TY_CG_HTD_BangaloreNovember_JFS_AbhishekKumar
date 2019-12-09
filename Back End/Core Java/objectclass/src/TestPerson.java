
public class TestPerson {
	public static void main(String[] args) throws Throwable {
		System.out.println("main methid starts");
		 Person p1 = new Person("John");

		// we can call the finalize method
		p1.finalize();
		p1 = null;

		// used for garbage collection
		System.gc();
		System.out.println("main method ends");

		System.out.println();
	}
}
