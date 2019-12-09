package exceptionpropagation;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		A.m();
		System.out.println("main ended");
	}
}
