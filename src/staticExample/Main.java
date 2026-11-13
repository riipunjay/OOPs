package staticExample;

public class Main {
	
	public static void main(String[] args) {
		Human Ripunjay = new Human(27, "Ripunjay", 20000, false);
		Human Rahul = new Human(29, "Rahul", 15000, true);
		
		System.out.println(Ripunjay.population);
		System.out.println(Rahul.population);
		System.out.println(Human.population);
	}

}
