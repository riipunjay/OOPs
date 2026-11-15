package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
	
		Singleton obj2 = Singleton.getInstance();
		
		Singleton obj3 = Singleton.getInstance(); //Only one instance is created and distributed to all
		//3 objects created here
	}
}
