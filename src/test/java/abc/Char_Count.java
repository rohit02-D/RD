package abc;

public class Char_Count {
	public static void main(String[] args) {
		String st="This is Java Program";
		System.out.println(st.length());
		
		String st1=st.replace(" "," ");
		System.out.println(st.length());
		int count=0;
		for(int i=0;i<=st1.length()-1;i++) {
			count ++;
			
		}
		System.out.println(count);
		}
		
	}
	
