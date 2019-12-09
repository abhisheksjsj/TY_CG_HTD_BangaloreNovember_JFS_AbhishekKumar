
public class InstanceBlock {
	int MAXIMUM;
	static final double PI;

	public InstanceBlock() {
		System.out.println("Constructor");
	}

	public InstanceBlock(int a) {
		System.out.println("Constructor is Overloaded");
	}

	static {
		System.out.println("Static block is executed");
		PI = 3.142;
	}

	{
		this.MAXIMUM = 3000;
		System.out.println("Final is declared in IIB");
	}
}
