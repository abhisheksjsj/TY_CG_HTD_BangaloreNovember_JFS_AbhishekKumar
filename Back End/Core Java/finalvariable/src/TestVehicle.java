
public class TestVehicle {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		c1.stop();

		Vehicle v1 = new Car();
		v1.start();
		v1.stop();

		// Vehicle v2 = new Vehicle();    //No object cretion of abstract class

	}
}
