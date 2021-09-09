package assign_8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Emp {

	
class A8{

	 public void main(String[] args) {


	        List<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(5);
	        Consumer<List<Integer>> display = list2->list2.forEach(System.out::println);
	        Thread t = new Thread();
	        t.run();
	    }
}
}