import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(12);
		l1.add(23);
		l1.add(67);
		l1.add(56);
		System.out.println(l1);
		System.out.println("-------peek &  peekFirst  &  peekLast-------------");

		System.out.println(l1.peek());

		System.out.println(l1.peekFirst());

		System.out.println(l1.peekLast());

		System.out.println("-------poll  &  pollFirst  &   pollLAst----------");
		l1.poll();
		System.out.println(l1);
		l1.pollFirst();
		System.out.println(l1);
		l1.pollLast();
		System.out.println(l1);

		System.out.println("---------new LinkedList---------------");
		LinkedList l2 = new LinkedList<>();
		l2.add(87);
		l2.add(65);
		l2.add(78);
		l2.add(null);
		l2.add(99);
		System.out.println(l2);
		System.out.println("-------offer &   offerFirst &   offerLast------------");
		l2.offer(235);
		System.out.println(l2);
		l2.offerFirst(564);
		System.out.println(l2);
		l2.offerLast(876);
		System.out.println(l2);

	}
}
