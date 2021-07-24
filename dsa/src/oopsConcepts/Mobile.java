package oopsConcepts;

class Product {
	int a;
	int b;
	int c;
	
	public void setdetails(int a,int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+b+c+" In parent set details overloading");
	}
	void showOutput(){
		System.out.println(this.a+this.b+this.c+" In parent show op");
	}
}


public class Mobile extends Product{
	
	public void setdetails(int a,int b) {
		
		//super.setdetails(0, 0, 9);
		
		System.out.println(a+b+" In child set details");
	}
	
	public void showOutput() {
		//super.showOutput();
		System.out.println(a+b+" In child show op overriding");
	}
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.setdetails(1,4,2);
		mob.showOutput();
	}
}