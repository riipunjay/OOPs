package accessModifier;

//How to access private variables
public class Private {

	private int num;
	String name;

	public static void main(String[] args) {
		Private p = new Private();
		p.setNum(10);
		System.out.println("Value for the private num integer value is set at: " + p.getNum());
		System.out.println("Printing Private method");
		getName();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	private static void getName() {
		String name = "Ripunjay";
		System.out.println(name);
	}

}
