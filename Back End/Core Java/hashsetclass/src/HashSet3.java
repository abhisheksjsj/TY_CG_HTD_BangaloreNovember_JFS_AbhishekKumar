import java.util.HashSet;

public class HashSet3 {
public static void main(String[] args) {
	HashSet<Student> hs1=new HashSet<Student>();
	hs1.add(new Student("Divya",1));
	hs1.add(new Student("Anu",2));
	hs1.add(new Student("Ramesh",3));
	hs1.add(new Student("Divya",1));
	
	for(Student o1:hs1) {
		System.out.println(o1.studName + " AGE IS "+ o1.studAge);
	}
	
	
}
}
