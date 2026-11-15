package staticExample;

public class StaticMethod {

	String name;
	static String college = "ABC University";

	StaticMethod(String name) {
		this.name = name;
	}

	static void changeCollegeName(String newCollege) {
		college = newCollege;
	}

	
}
