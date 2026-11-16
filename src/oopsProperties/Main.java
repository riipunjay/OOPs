package oopsProperties;

public class Main {
	
	public static void main(String[] args) {
	//	Box box = new Box();
//	//	Box box = new Box(4);
//		Box box = new Box(12, 23, 16);
//		
//		Box box2 = new Box(box);
//		
//		System.out.println(box.l + " " + box.h + " " + box.w);
		
//		BoxWeight bw = new BoxWeight();
//		System.out.println(bw.l + " " + bw.h +" "+bw.w + " " +bw.weight);
//		
//		Box bw1 = new BoxWeight(2,3,4,6);
//		//Here, the object type is BoxWeight which is the child class, but its referncing the type Box which is parent class.
//		System.out.println(bw1.w);
		//But Boxweight class variables cannot be accessed. in this case Weight variable
		// Its actually the type of reference variable (box bw1), not the object type(BoxWeight) which determines 
		//what members can be accessed. 
		
		BoxWeight bw2 = new BoxWeight(2,3,4,5);
		System.out.println(bw2.w + " " + bw2.h + " " + bw2.l + " "+ bw2.weight);
		
		BoxPrice bw3 = new BoxPrice(20, 22, 24, 120, 12764.99);
		System.out.println(bw3.l + " " + bw3.h + " "+ bw3.w + " "+ bw3.weight + " " + bw3.price);
		System.out.println("Just printing the price");
		bw3 = new BoxPrice();
		System.out.println(bw3.price);
	}

}
