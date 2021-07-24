package oopsConcepts;

public class InheritenceParent {
	String harshi;
	String h;
	int a;
	int b;
	InheritenceParent(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("InheritenceParent called");
	}
	
	String parentMethod() {
		return "parentMethod";
	}
	
	static String staticMethodCheck() {
		return "staticMethodCheck";
	}
	
}
