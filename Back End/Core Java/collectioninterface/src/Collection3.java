import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(12);
		c.add(13);
		c.add(15);
		System.out.println(c);

		Collection c1 = new ArrayList();
		c1.add(89);
		c1.add(45);
		c1.add(12);
		c1.add(15);
		System.out.println(c1);

		c.addAll(c1);
		System.out.println(c);

		c.removeAll(c1);
		System.out.println(c);

		System.out.println("-----------------------------------");
		Collection c3 = new ArrayList();
		c3.add(33);
		c3.add(43);
		c3.add(12);
		System.out.println(c3);

		Collection c4 = new ArrayList();
		c4.add(12);
		c4.add(13);
		c4.add(43);
		System.out.println(c4);

		c3.retainAll(c4);
		System.out.println(c3);

		c3.containsAll(c4);
		System.out.println(c3);

		c3.clear();
		System.out.println(c3);
		System.out.println("________________________");
		
		Collection c5=new ArrayList();
		c5.add(23);
		c5.add(54);
		c5.add(67);
		Object a[]=c5.toArray();
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

	}
}
