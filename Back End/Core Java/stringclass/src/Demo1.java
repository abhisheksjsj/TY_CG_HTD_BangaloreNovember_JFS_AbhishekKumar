
public class Demo1 {
	public static void main(String[] args) {
		String s1 = "John";
		System.out.println("s1 hashcode value is" + s1.hashCode());
		String s2 = "Mikel";
		System.out.println("s2 hashcode value is " + s2.hashCode());
		s1 = "Pinky";
		String s3 = "John";
		System.out.println("s1 hashcode value is" + s1.hashCode());
		System.out.println("s3 hashcode value is" + s3.hashCode());

	}

}
