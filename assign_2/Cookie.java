package assignment2;

import desert.desert;

public class Cookie extends desert {

		private int cookieCount;
		private double cookiePrize;

		public void cookie(String name, int cookieCount, double cookiePrize) {
	
			this.cookieCount = cookieCount;
			this.cookiePrize = cookiePrize;
		}
		public double getItemCount() {
			return cookieCount;
		}
		public double getPricePerDozen() {
			return cookiePrize;
		}
		@Override
		public double getcost() {
			
			double cost = (double) Math.round(cookiePrize * cookieCount / 12);
			return cost;
		}
		@Override
		public double getTax() {
			
			return 0.1*getcost();
		}
		@Override
		public String currency() {
			
			return "euro";
		}

}
