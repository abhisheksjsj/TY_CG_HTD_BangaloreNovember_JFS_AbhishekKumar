
public class FinalVariable {
	final double PI;

	public FinalVariable(double PI) {
		this.PI = PI;
	}

	public FinalVariable(double PI, int a) {
		this.PI = PI;

	}

	{
		// this.PI = 3.142;
	}

	void initialise() {
		System.out.println(PI);
	}

}
