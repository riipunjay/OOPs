package staticExample;

public class StaticVariableInitilization {

	//This is a demo to show the initilization of static variable
	
	static int num = 4;
	static int num2;
	
	static{
		System.out.println("I am in static block");
		num2 = num * 10;
		
	}
	
	public static void main(String[] args) {
		System.out.println(StaticVariableInitilization.num +" "+ StaticVariableInitilization.num2);
	}
}
