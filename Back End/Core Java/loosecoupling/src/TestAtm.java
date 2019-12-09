
public class TestAtm {
	public static void main(String[] args) {
		Atm a1 = new Atm();
		AtmHdfc h1 = new AtmHdfc();
		AtmSbi s1 = new AtmSbi();
		Person p1 = new Person();
		p1.money(s1);
		p1.money(h1);
		
	}

}
