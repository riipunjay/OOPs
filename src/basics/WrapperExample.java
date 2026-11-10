package basics;

import java.util.Arrays;

public class WrapperExample {
	public static void main(String[] args) {
		
		int a = 10; //This is primitive
		Integer num = 10; //This is an object
		Integer num2 = new Integer(45); //This is an object
		
		//a. nothing will appear
		//num. _> lots of methods will come here
		
		//Final
		final int x = 123;
		//throws a compilation error x = 124;
		
		final int y[] = {12,34,56,85};
		y[0] = 18;
		System.out.println(y[0]);
		System.out.println(Arrays.toString(y));
		int len = y.length;
		System.out.println(len);
		
	}
}
