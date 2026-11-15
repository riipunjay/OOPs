package staticExample;

public class InnerClass {
//NOTE: Only inner class can be static or non static, but outer class cannot be static in this case
	 static class Test {
		static String name;
		
		public Test(String name){
			Test.name = name; //or also can be used this.name = name; but if String is not static then error
		}
	}
	
	public static void main(String[] args) {
		Test a = new Test("Ripunjay"); //Here we will get error given the Class Test is not static.
		//Bcoz, Test class is dependent on the object of Inner class, but if we make the Test class
		//as static, then we would not be dependent on it.
		//Basically, an object of Inner class is not neededto be created to run the Class Test, given its 
		//static now.
		Test b = new Test("Rahul");
		
		System.out.println(a.name);
		System.out.println(b.name);
	}
}
