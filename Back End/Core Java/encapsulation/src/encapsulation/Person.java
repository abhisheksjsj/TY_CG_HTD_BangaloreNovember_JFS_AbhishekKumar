package encapsulation;

import java.io.Serializable;

public class Person implements Serializable {
	private int age;
	private String name;

	void setAge(int age) {
		this.age = age;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;

	}

	String getName() {
		return name;
	}
}
