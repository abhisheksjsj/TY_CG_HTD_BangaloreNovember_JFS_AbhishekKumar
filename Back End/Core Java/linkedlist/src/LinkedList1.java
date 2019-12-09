import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(12);
		l1.add(23);
		l1.add(33);
		l1.add(23);
		System.out.println(l1);

		ListIterator ltr = l1.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("-----------------------------");

		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		System.out.println(l1);
		
		l1.add(null);
		System.out.println(l1);
		
		l1.remove(new Integer(33));
		System.out.println(l1);
		
		System.out.println("------------For Each Loop-----------");
		for(Object i1:l1) {
			System.out.println(i1);
		}
		System.out.println("----For Loop-----");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	}
}
