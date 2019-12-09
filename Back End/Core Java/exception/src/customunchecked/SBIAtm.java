package customunchecked;

public class SBIAtm {
	public static void main(String[] args) {
		System.out.println("main started");
		AtmSimulator a1 = new AtmSimulator();
		try {
			a1.withdraw(41000);
		} catch (DayLimitException e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("main ended");
	}

}
