
public class TestCrush {
	public static void main(String[] args) {
		Crush c1 = new Crush();
		BasicSet bs1 = new BasicSet();
		Oppo o1 = new Oppo();
		Apple a1 = new Apple();
		OnePlus op1 = new OnePlus();
		c1.receive(null);
		c1.receive(a1);
		c1.receive(op1);

	}

}
