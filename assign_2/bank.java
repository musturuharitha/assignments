package assignment2;

public class bank {
	
	
	public class current extends bank{
		double cashcredit;
		private String acctype;
		public current(int acuntnum, String name, double balance) {
			super();
			
			this.acctype="current";
			if (balance>10000){
				cashcredit=(0.10*balance);
			}
			else {
				cashcredit=(0.5*balance);
			}
		}
		public double getBalance() {
			
			return (super.getBalance()+cashcredit);
		}


	}

	public double getBalance() {
	
		return 0;
	}
}
	
