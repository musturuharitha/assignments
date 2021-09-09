package assignment2;

public class Abstarctclasss {

	public abstract class abstractclass {
		
		public void mymethod() {
			System.out.println("hello");
		}
		abstract public void anothermethod();
		
		abstract public void id();


	public class demo extends abstractclass{ 


		@Override
		public void anothermethod() {
			
			System.out.println("abstract method");
		}

		@Override
		public void id() {
			// TODO Auto-generated method stub
			
		}

	}
		public void main(String[] args) {
			
			abstractclass obj=new abstractclass();
			obj.anothermethod();
		}

}
}

