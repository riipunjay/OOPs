package basics;

public class ConstructorClass {

	String name;
	int rollno;
	float marks;
	
	// Default constructor
	public ConstructorClass() {
		this.name = "Ripunjay";
		this.rollno = 18;
		this.marks = 23.4f;
	}
	// Parameterized constructor
	public ConstructorClass(int roll, float marks, String name) {
		this.name = name;
		this.rollno = roll;
		this.marks = marks;
	}
	// Copy constructor
	public ConstructorClass(ConstructorClass overload) {
		this.name = overload.name;
		this.rollno = overload.rollno;
		this.marks = overload.marks;
	}
	
	//Create another parameterized constructor
	public ConstructorClass(String naam, int roll, float marks) {
		this.name = naam;
		this.rollno = roll;
		this.marks = marks;
	}
	
	public static void main(String[] args) {
		ConstructorClass Student = new ConstructorClass();
		System.out.println(Student.marks);
		
		ConstructorClass studentInfo = new ConstructorClass("Shivam", 11, 77.3f);
		System.out.println(studentInfo.name);
		System.out.println(studentInfo.marks);
		System.out.println(studentInfo.rollno);
		System.out.println("Using the Constructor overload and printing the name value");
		ConstructorClass random = new ConstructorClass();
		System.out.println(random.name);
		
		ConstructorClass newPara = new ConstructorClass("Rohit", 7, 88.2f);
		System.out.println(newPara.marks);
		System.out.println(newPara.rollno);
		System.out.println(newPara.name);
	}
}
