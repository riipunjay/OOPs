package singleton;

public class Singleton {
	
	private Singleton(){
		
	}
	
	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance == null) {
			//Check whether only 1 object is created
			instance = new Singleton();
		}
		
		return instance;
	}

}
