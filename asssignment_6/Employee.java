package assign_6;
import java.util.Comparator;
public class Employee {

	

		

		public Object id;

		public class FirstComparator implements Comparator<Employee>{

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return ((Object)o1.id).compareTo((Object)o2.id);
			}
			

	}

}
