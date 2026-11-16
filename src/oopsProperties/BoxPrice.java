package oopsProperties;

public class BoxPrice extends BoxWeight {

	double price;

	BoxPrice() {
		super();
		this.price = 82736.22;
	}

	BoxPrice(double l, double h, double w, double weight, double price) {
		super(l, h, w, weight);
		this.price = price;
	}
}
