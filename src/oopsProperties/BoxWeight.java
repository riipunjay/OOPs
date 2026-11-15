package oopsProperties;

public class BoxWeight extends Box {

	double weight;

	public BoxWeight() {
		this.weight = -1;
	}

	public BoxWeight(double l, double h, double w, double weight) {
		super(l, h, w);//This means here is that call the parent class constructor
		//used to initialize the values present in the parent class
		//Remember that if the parent class variable/Methods are declared as Private then it can not be accessed tho
		
		System.out.println("BoxWeight Class constructor");
		this.weight = weight;

	}

}
