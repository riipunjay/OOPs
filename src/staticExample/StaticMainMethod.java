package staticExample;

public class StaticMainMethod {
	
	public static void main(String[] args) {
		StaticMethod.changeCollegeName("XYZ University");
		
		StaticMethod s1 = new StaticMethod("Ripunjay");
		StaticMethod s2 = new StaticMethod("Shyam");
		
		
		System.out.println(s1.name + " is studying in " + StaticMethod.college);
		System.out.println(s2.name + " is studying in " + StaticMethod.college);
		
	}

}
