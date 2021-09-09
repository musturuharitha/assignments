package assign_9;

import java.util.Timer;

public class Trans {

	
		

		
			private Timer trader;
			private int year;
			private int value;
			public Trans(Timer trader, int year, int value) {
				this.trader = trader;
				this.year = year;
				this.value = value;
			}
			public Timer getTrader() {
				return trader;
			}
			public int getYear() {
				return year;
			}
			public int getValue() {
				return value;
			}
			@Override
			public String toString() {
				return "Transaction [trader=" + this.trader + ", year=" + this.year + ", value=" +this.value + "]";
			}
}

