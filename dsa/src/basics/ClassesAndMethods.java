package basics;

public class ClassesAndMethods {
	public static void main(String[] args) {
		A a= new A();
		System.out.println(a.fun().length());
	}
}

class A{
	public String fun() {
		return "Function Called";
	}
}
