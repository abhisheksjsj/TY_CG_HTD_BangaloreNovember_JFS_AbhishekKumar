package checkedException;

public class ExceptionB {
	public static void main(String[] args) {
		System.out.println("main started");
		Student s1 = new Student();
		try {
			Object o1 = s1.clone();
			System.out.println("clone is supported");
			Class c1 = Class.forName("checkedException.Student");
			System.out.println("class is found");
		} catch (CloneNotSupportedException e) {
			System.out.println("clone is not supported");

		} catch (ClassNotFoundException c) {
			System.out.println("Class is not found");

		}
		System.out.println("main ended");
	}
}
