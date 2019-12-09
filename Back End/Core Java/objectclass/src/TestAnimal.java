
public class TestAnimal {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Animal a1 = new Animal("Pinky");
		Class c1 = a1.getClass();
		
		Animal a2 = (Animal) c1.newInstance();
		System.out.println(c1);
		System.out.println("------");
		System.out.println(a2.name);

		Class c2 = Class.forName("Animal");
		System.out.println(c2);

		// we can create a new Object using newInstance
		// will always search for zero parameterised constructor and will not initialise
		// instance variable
		Animal a3 = (Animal) c2.newInstance();
		System.out.println(a3.name);

		// will give the class className as a output
		Class c3 = a3.getClass();
		Class c4 = Class.forName("Animal");
		System.out.println(c3);
		System.out.println(c4);

		Object o1 = new Object();

	}
}
