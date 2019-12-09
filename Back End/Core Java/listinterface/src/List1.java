import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(0, 10);
		l1.add(1, 13);
		l1.add(2, 14);
		l1.add(3, 23);
		l1.add(1, 14);
		System.out.println(l1);

		l1.remove(2);
		System.out.println(l1);

		System.out.println(l1.indexOf(23));

		l1.add(13);
		System.out.println(l1);

		System.out.println(l1.lastIndexOf(14));
		System.out.println("_______________________");

		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
	List l2=new ArrayList<>();
	l2.add(0, 14);
	l2.add(1, 16);
	l2.add(2, 17);
	
	List l3=new ArrayList<>();
	l3.add(0, 34);
	l3.add(1, 23);
	l3.add(2, 45);
	
	l2.addAll(l3);
	System.out.println(l2);
	
	l2.set(1, 1000);
	System.out.println(l2);
	System.out.println("----------------------");
	
	List l4=new ArrayList();
	l4.add(0, 84);
	l4.add(1, 86);
	l4.add(2, 67);
	
	List l5=l4.subList(1, 3);
	System.out.println(l5);
	}

}
