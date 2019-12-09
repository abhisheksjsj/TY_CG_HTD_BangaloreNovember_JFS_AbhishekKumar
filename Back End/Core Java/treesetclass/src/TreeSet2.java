import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<Strudent> t1 = new TreeSet<Strudent>();
		t1.add(new Strudent(12, "Gunda"));
		t1.add(new Strudent(23, "Rohit"));
		t1.add(new Strudent(29, "Chunnu"));
		t1.add(new Strudent(12, "Gunda"));

		Iterator<Strudent> itr = t1.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}
}
