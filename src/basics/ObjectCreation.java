package basics;

public class ObjectCreation {

	String name;
	int rollno;
	float marks = 92.23f;

	public static void main(String[] args) {
		ObjectCreation student1 = new ObjectCreation();
		student1.name = "Ripunjay";
		student1.rollno = 18;
		student1.marks = 93.6f;

		ObjectCreation student2 = new ObjectCreation();
		student2.name = "Shivam";
		student2.rollno = 7;
		student2.marks = 77;

		System.out.println(student1.name + " has got " + student1.marks);
		System.out.println(student2.name + " has got " + student2.marks);
	}

}

