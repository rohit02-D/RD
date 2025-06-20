package abc;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String p="1234321";
		String rev="";
		for(int i=6;i>=0;i--) {
			rev+=p.charAt(i);
		}
		System.out.println(rev);
		if(p.equals(rev)) {
			System.out.println("Given value is Palindrome");
		}else {
			System.out.println("Given Value is not Palindrome");
		}
	}

}
