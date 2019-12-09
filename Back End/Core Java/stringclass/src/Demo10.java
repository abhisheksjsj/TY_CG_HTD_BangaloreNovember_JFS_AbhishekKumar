
public class Demo10 {
	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer("John");
		System.out.println(b1.hashCode());
		b1.append("Mikel");
		System.out.println(b1.hashCode());

	}
}
