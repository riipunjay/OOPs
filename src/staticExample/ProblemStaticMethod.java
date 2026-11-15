package staticExample;

public class ProblemStaticMethod {
	
	public static void main(String[] args) {
		fun();
		
	}
	//Since this is a static method, this doesnot depend on the objects
	static void fun() {
	//	greeting();//You cannnot use this, as this requires an instance (Object)
		//but the function you are using it in (fun) does not depend on instance, since fun is static
		//This will result in error
		//But if you want it to work, you need to create an object and then access it via that, see below
		
		ProblemStaticMethod obj = new ProblemStaticMethod();
		obj.greeting();
		//Notice, once object is created with help of new and class name, with reference to that, we can access
		//Non static methods inside a static method
	}
	
	
	void greeting() {
		//something which is not static belongs to the object
		System.out.println("Hello all!! \nWelcome");
	//	fun(); //This we can do, since Static methods can be accessed via non-static method
	}

}
