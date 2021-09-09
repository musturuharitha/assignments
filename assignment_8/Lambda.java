package assign_8;

public class Lambda<addinf> {

		
		public class Q1<AddOf> {

			public void main(String[] args) {
				
				
				addOp funadd = (a,b)-> a+b;
				addOP fundiv = (a,b) -> a/b;
				 addOp funsub = (a,b) -> a-b;
				addinf funmul = (a,b) -> a*b;
				
				int a = funadd.call(1, 1);
				int d = fundiv.call(2, 2);
				int s = funsub.call(3, 3);
				int m = funmul.call(4, 4);
				System.out.println("------------------lambda functions---------------");
				System.out.println("------------------------add-------------------");
				System.out.println(a);
				System.out.println("-----------------------div----------------------");
				System.out.println(d);
				System.out.println("----------------------sub----------------------");
				System.out.println(s);
				System.out.println("------------------mul----------------------");
				System.out.println(m);
				

			}
	}

}
