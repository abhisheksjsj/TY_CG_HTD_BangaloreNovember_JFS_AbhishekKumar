import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Anish");
		a1.add("Abhi");
		a1.add("Akshay");
		a1.add("Vivek");
		a1.add("Abhi");
		a1.add("Aniket");
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains("Akshay"));
		System.out.println(a1.add("Guldu"));
		System.out.println(a1);
		System.out.println(a1.remove(2));
		System.out.println(a1);
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Ramu");
		a2.add("Golu");
		a2.add("Anish");
		a2.add("Jaggu");
		a2.add("Manju");
		a2.add("Vicky");
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1);
		a1.removeAll(a2);
		System.out.println(a1);
		
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("A");
		a3.add("B");
		a3.add("C");
		a3.add("D");
		a3.add("E");
		a3.add("F");
		
		ArrayList<String> a4 = new ArrayList<String>();
		a4.add("A");
		a4.add("g");
		a4.add("h");
		a4.add("j");
		a4.add("i");
		System.out.println(a3);
		
		a1.containsAll(a2);
		System.out.println(a1);
		a3.retainAll(a4);
		System.out.println(a3);
		
	}

}
