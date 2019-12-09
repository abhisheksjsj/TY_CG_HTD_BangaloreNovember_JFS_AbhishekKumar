import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet<Employee> t1 = new TreeSet<Employee>();
		t1.add(new Employee(12, 120000, "Gunda"));
		t1.add(new Employee(23, 13000, "Rohit"));
		t1.add(new Employee(29, 140000, "Chunnu"));
		t1.add(new Employee(12, 430000, "Gunda"));

		for (Employee employee : t1) {
			System.out.println("Employee name is" + employee.name);
			System.out.println("Employee age is" + employee.age);
			System.out.println("Employee salary is" + employee.salary);
			System.out.println("---------------------------------");

		}
	}
}
