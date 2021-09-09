package assignment2;

import desert.desert;

public class Candie extends desert{



	private double candyWeight;
	private double candyPrice;
	private Object dollar;

	public void candy(String name, double candyWeight, double candyPrice, Object dollar) {
		this.candyWeight = candyWeight;
		this.candyPrice = candyPrice;
		this.dollar=dollar;
	}
	public double getWeightInPounds() {
		return candyWeight;
	}
	public double getPricePerPound() {
		return candyPrice;
	}
	public double getcost() {
		
		double cost = (double) Math.round(candyPrice * candyWeight);
		return cost;
	}
	@Override
	public double getTax() {
		
		return 0.1*getcost();
	}
	@Override
	public double currency() {
		
		return (double) (dollar=60);
	}

}
