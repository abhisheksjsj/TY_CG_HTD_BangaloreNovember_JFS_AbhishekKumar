
public class TestPen {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		System.out.println(p1.toString());
		// toString will print the FullyQualifiedClassName@Hexadecimal representation of
		// the HashCode
		// toString is the inherited method present in the Object class

		p1.write();
	}
}
