
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Abhishek kumar";
		p1.age = 21;
		p1.personDetails();
		Person p2 = new Person();
		p2.intialise(25, "Akshay");
		p2.personDetails();
		Person p3 = new Person();
		p3.intialise(34, "Ramesh");
		p3.personDetails();
	}

}
