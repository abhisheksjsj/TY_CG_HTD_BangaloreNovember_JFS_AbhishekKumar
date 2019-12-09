import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(556);
		l1.add(67);
		l1.add(6476);
		l1.add(null);
		System.out.println(l1);

		System.out.println("-------push() &  pop()  &  element()-------------");
		l1.push(111);
		System.out.println(l1);
		l1.pop();
		System.out.println(l1);
		System.out.println(l1.element());
		System.out.println(l1);

	}
}
