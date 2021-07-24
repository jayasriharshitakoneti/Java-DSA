package oopsConcepts;

public class InheritenceChild {
	//extends InheritenceParent
//	InheritenceChild(int a, int b) {
//		super(a, b);
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		
		
		
		InheritenceParent caller=new InheritenceParent(1,2);
		System.out.println(caller.a+caller.b);
//		System.out.println(caller);
//		
//		System.out.println(caller.parentMethod());
		
//		System.out.println(InheritenceParent.staticMethodCheck());
	}
}
