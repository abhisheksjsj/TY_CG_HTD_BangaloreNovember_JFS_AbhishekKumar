
public class Student {
	String studName;
	int studAge;

	public Student(String studName, int studAge) {
		super();
		this.studName = studName;
		this.studAge = studAge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studAge;
		result = prime * result + ((studName == null) ? 0 : studName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studAge != other.studAge)
			return false;
		if (studName == null) {
			if (other.studName != null)
				return false;
		} else if (!studName.equals(other.studName))
			return false;
		return true;
	}

}
