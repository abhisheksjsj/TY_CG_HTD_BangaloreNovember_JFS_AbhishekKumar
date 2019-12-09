
public class Strudent implements Comparable<Strudent> {
	int age;
	String name;

	public Strudent(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Strudent o) {
		if (this.age > o.age)
			return 1;
		else if (this.age < o.age)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Strudent [age=" + age + ", name=" + name + "]";
	}

}
