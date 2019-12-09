
public class Son extends Father {
	public Son() {
		super("Ramesh", 45);
		System.out.println("C");
	}

	Son(String name, int age) {
		this();
		System.out.println("D");

	}
}
