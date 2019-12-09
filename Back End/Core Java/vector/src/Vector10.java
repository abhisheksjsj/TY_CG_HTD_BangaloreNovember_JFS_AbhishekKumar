import java.util.Vector;

public class Vector10 {
public static void main(String[] args) {
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
