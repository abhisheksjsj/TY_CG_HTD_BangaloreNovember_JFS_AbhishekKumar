import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("Vivek");
		c1.add("Aniket");
		c1.add("akshay");
		System.out.println(c1);

		c1.remove("Aniket");
		System.out.println(c1);

		System.out.println(c1.size());

		System.out.println(c1.contains("Vivek"));
		System.out.println(c1.isEmpty());

	}
}
