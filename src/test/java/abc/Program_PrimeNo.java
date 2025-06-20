package abc;

public class Program_PrimeNo {

	public static void main(String[] args) {
		
		int a=11;
		int b=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				b++;
			}
		}
		System.out.println(b);
		if(b==2) {
			System.out.println("Given no is prime");
		}else {
			System.out.println("Given no is not prime");
		}
	}
}
