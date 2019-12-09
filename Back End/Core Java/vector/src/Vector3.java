import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.addElement(12);
		v1.addElement(34);
		v1.addElement(345);
		v1.add(43);
		v1.add(465);
		System.out.println(v1);

		v1.removeElement(new Integer(34));
		System.out.println(v1);

		v1.remove(1);
		System.out.println(v1);

		Object o1[] = new Object[v1.size()];
		v1.copyInto(o1);

		for (int i = 0; i < o1.length; i++)
			System.out.println(o1[i]);

		v1.removeAllElements();
		System.out.println(v1);

		System.out.println("--------Vector v2-------------");

		Vector v2 = new Vector();
		v2.add(34);
		v2.addElement(54);
		v2.addElement(6545);
		v2.add(587);
		System.out.println(v2);

		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());

		v2.ensureCapacity(4);
		v2.setSize(9);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println(v2);

	}
}
