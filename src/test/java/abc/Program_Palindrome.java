package abc;

public class Program_Palindrome {
	public static void main(String[] args) {
		
		String p="1234321";
		String b="";
		for(int i=p.length()-1;i>=0;i--) {
			b+=p.charAt(i);
		}
		System.out.println(b);
		if(p.equals(b)) {
			System.out.println("Given Value is Palindrome");
		}else {
			System.out.println("Given Value is not Palindrome");
		}
	}

}
