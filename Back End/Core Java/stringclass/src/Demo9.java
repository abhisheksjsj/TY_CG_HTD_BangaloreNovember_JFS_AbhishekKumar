
public class Demo9 {
	public static void main(String[] args) {
		String s1 = new String("John");
		System.out.println(s1.hashCode());
		s1 = s1.concat("Mikel");
		System.out.println(s1.hashCode());

	}
}
