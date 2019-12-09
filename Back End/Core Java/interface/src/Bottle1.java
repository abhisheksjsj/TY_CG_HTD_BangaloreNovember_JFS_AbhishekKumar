
public interface Bottle1 {
	void open();

	default void juice() {
		System.out.println("Drink juice");
	}

	static void close() {
		System.out.println("Close the bottle");
	}

	void drink();
}
