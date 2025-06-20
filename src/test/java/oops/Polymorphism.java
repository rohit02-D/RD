package oops;

public class Polymorphism {
	
	public void additio(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public void addition(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Polymorphism p= new Polymorphism();
		p.additio(12, 65);
		p.addition(23, 43, 43);
				
	}

}
