import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(12);
		l1.add(13);
		l1.add(34);
		l1.add(13);
		System.out.println(l1);
		System.out.println("--------addFirst() and addLast------------");
		l1.addFirst(45);
		l1.addLast(66);
		System.out.println(l1);
		System.out.println("---------getFirst and getLast-------------");
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println("-------remove---------- ");
		l1.remove();
		System.out.println(l1);
		System.out.println("-----removeFirst   and removeLast-----------");
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);

		System.out.println("-------------l2 elements-----");
		LinkedList l2 = new LinkedList<>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		l2.add(44);
		l2.add(22);
		System.out.println(l2);
		System.out.println("------removeFirstOccurence     removeLastOccurence-----------------");
		l2.removeFirstOccurrence(22);
		System.out.println(l2);
		l2.removeLastOccurrence(22);
		System.out.println(l2);

	}
}
