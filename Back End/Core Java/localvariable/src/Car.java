
public class Car extends Vehicle {
	int cost = 40000;

	void carDetails() {
		int cost = 10000;
		System.out.println("cost of the car is " + cost);
		System.out.println("Global variable car cost is " + this.cost);
		System.out.println("Global variable of parent car cost is " + super.cost);
	}

}
