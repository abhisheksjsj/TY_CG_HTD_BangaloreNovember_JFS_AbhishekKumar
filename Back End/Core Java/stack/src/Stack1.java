import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.add(23);
		s1.addElement(34);
		s1.addElement(565);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);

		s1.push(365);
		System.out.println(s1);
		System.out.println("-----------");

		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.search(23));
		System.out.println(s1.search(365));
		System.out.println(s1);
	}
}
