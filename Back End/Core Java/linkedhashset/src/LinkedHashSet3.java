import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {
	public static void main(String[] args) {
		LinkedHashSet<Employee> l1 = new LinkedHashSet<Employee>();
		l1.add(new Employee("Divya", 23));
		l1.add(new Employee("Ramu", 20));
		l1.add(new Employee("Gunda", 26));
		l1.add(new Employee("Gunda", 26));
		System.out.println(l1);
		System.out.println("--------------");

		Iterator<Employee> itr = l1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
