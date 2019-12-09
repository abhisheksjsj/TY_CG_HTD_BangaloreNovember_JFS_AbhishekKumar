import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(23);
		v1.add(56);
		v1.add(78);
		v1.add(100);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());

		System.out.println("--------trimtoSize()------------");
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());

		System.out.println("-------setSize()----------");
		v1.setSize(15);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1);

		System.out.println("-----add()-----");
		v1.add(200);
		System.out.println(v1);
		System.out.println(v1.size());

		System.out.println("------------set()-------------");
		v1.set(6, 3000);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());

	}
}
