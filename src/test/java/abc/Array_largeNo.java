package abc;

import java.util.Arrays;

public class Array_largeNo {

	public static void main(String[] args) {
		
	
	int num[]= {23,45,32,4,433,2221,3433,4433};
	Arrays.sort(num);
	System.out.println("Large num is:"+num[num.length-1]);
	
	System.out.println("Small num is:"+num[0]);
}
}
