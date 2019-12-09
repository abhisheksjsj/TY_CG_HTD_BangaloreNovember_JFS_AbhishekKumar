
public class Student {
	int studId;
	String studName;

	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}

	// Overriding the toString() method with return type as String
	public String toString() {
		return "Student name is " + studName + " and Id is " + studId;

	}
}
