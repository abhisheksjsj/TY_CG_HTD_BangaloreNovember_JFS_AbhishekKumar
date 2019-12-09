
public class Demo {
	public static void main(String[] args) {
		String s1 = "Shree";
		String s3 = "Shree";
		String s2 = new String("Shree");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1 == s2);
	}
}
