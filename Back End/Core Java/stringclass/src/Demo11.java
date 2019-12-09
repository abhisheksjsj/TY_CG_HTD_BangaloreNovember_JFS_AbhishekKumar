public class Demo11 {
	public static void main(String[] args) {
		StringBuilder b1 = new StringBuilder("John");
		System.out.println(b1.hashCode());
		StringBuilder s1 = b1.append("Mikel");
		System.out.println(s1);
		System.out.println(b1.hashCode());

	}
}