package customunchecked;

public class AtmSimulator {
	void withdraw(double amount) {
		if (amount > 40000) {
			throw new DayLimitException("Limit Completed for the month");
		}
	}
}
