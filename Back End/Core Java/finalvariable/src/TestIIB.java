
public class TestIIB {
	public static void main(String[] args) {
		InstanceBlock i1 = new InstanceBlock();
		System.out.println(i1.MAXIMUM);
		System.out.println(i1.PI);

		InstanceBlock i2 = new InstanceBlock(32);
		System.out.println(i2.MAXIMUM);
		System.out.println(i2.PI);

	}
}
