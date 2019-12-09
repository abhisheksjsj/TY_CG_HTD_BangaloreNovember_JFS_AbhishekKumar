import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		// adding non primitive data in Collection
		c1.add(12);
		System.out.println(c1);

		// removing the data from Collection
		c1.remove(12);
		System.out.println(c1);

		c1.add(15);
		// finding the size of Collection
		System.out.println(c1.size());

		// check whether Collection is empty or not
		System.out.println(c1.isEmpty());

		// check whether element present or not
		System.out.println(c1.contains(15));

	}
}
