import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(23);
		v1.add(34);
		v1.add(65);
		v1.add(null);
		System.out.println(v1);
		v1.remove(new Integer(34));
		System.out.println(v1);
		System.out.println("-----set()-------------");
		v1.set(1, 100);
		System.out.println(v1);
		for (int i = 0; i < v1.size(); i++)
			System.out.println(v1.get(i));

	}
}
