import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(34);
		hs.add(25);
		hs.add(12);
		hs.add(25);
		hs.add(null);
		for (Object o1 : hs) {
			System.out.println(o1);
		}
		System.out.println("--------------");
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Vivu");
		hs1.add("Akshu");
		hs1.add("Anishu");
		System.out.println(hs1);
		for (Object o2 : hs1)
			System.out.println(o2);
		System.out.println("---------------");

	}
}
