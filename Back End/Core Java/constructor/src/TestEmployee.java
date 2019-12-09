
public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Suresh", 23, 30000);
		Employee e2 = new Employee("Ansuman", 21, 34000);
		System.out.println(e1.empName);
		e1.details();
		e2.details();
		e2.empAge = 23;
	}

}
