package assignment2;

import desert.desert;

public class icecream extends desert {
		private double cost;

		public icecream(String name,double cost) {
			super();
			this.cost=cost;
		}

		public double getcost() {
			
			return cost;
		}

		public double getTax() {
			
			return 0.1*getcost();
		}

		public Comparable<String> currency() {
			
			return "rupees";
		}


}
