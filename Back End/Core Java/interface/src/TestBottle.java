
public class TestBottle {
	public static void main(String[] args) {

		Pepsi p1 = new Pepsi();
		p1.open();
		p1.drink();

		Fanta f1 = new Fanta();
		f1.open();
		f1.drink();

		Bottle b1 = new Fanta();
		Fanta f2=(Fanta) b1;       //Downcasting
		b1.open();
		b1.drink();
	}

}
