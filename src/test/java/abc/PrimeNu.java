package abc;

public class PrimeNu {
	public static void main(String[] args) {
		
		int n=12;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count ++;
				
			}
		}
		//System.out.println("for prime no:");
		if(count==2) {
			System.out.println("Given no is prime");
		}else {
			System.out.println("Given no is not prime");
		}
	}

}
