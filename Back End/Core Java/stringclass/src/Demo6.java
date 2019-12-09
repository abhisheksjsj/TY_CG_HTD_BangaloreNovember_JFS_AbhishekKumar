
public class Demo6 {
	public static void main(String[] args) {
		Demo5 d1 = new Demo5("hari", 21);

		System.out.println("d1 hashcode value is" + d1.hashCode());
		d1 = new Demo5("Vivek is Guldis Guldu"
				+ "n", 24);
		System.out.println("d1 ashCode value is " + d1.hashCode());

		String name = d1.getName();
		int age = d1.getAge();

		System.out.println("name is" + name);
		System.out.println("age is" + age);

	}
}
