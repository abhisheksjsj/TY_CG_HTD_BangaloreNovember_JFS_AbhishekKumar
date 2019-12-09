import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(12);
		a1.add(23);
		a1.add(34);
		a1.add(45);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);

		System.out.println("------------for Loop--------------");
		// iterating an ArrayList
		for (int i = 0; i < a1.size(); i++)
			System.out.println(a1.get(i));

		System.out.println("-----------for Each Loop-------------");
		for (Integer i1 : a1)
			System.out.println(i1);

		System.out.println("-------------Iterator methos--------------");
		Iterator<Integer> itr = a1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------List Iterator-------------");

		ListIterator<Integer> itr1 = a1.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("----------------------------------");

		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
	}

}