import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add(11);
		t1.add(22);
		t1.add(45);
		t1.add(33);
		t1.add(22);
		System.out.println(t1);

		t1.remove(22);
		System.out.println(t1);
		for (Object o1 : t1) {
			System.out.println(o1);
		}
		System.out.println("---------------------");
		Iterator itr=t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
