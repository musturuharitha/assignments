package assign_8;
		@FunctionalInterface
		interface Arthemetic{
		    public int operation(int a, int b);
		}
		public class A8_q1 {
		    public static void main(String[] args) {

		        Arthemetic add=(int a, int b)->a+b;
		        System.out.println("Sum: "+add.operation(9,2));


		        Arthemetic s = (int val1, int val2)->val1-val2;
		        System.out.println("Difference: "+s.operation(9,2));

		        Arthemetic m = (int val1, int val2)->val1*val2;
		        System.out.println("Product: "+m.operation(9,2));

		        Arthemetic d = (int val1, int val2)->val1/val2;
		        System.out.println("Division result: "+d.operation(9,2));
		    }
		
	}


