
public class Employee {
	String empName;
	int empAge;
	double empSalary;

	public Employee(String name, int age, double salary) {
		empName = name;
		empAge = age;
		empSalary = salary;
	}

	void details() {
		System.out.println("EmpName is: " + empName + " EmpAge is: " + empAge + " EmpSalary is: " + empSalary);
	}
}
