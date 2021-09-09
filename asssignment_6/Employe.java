package assign_6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Employe {

	public static void main(String[] args) {
		

		
	
				ArrayList<String> obj=new ArrayList<>();
				obj.add("hii");
				obj.add("world");
				obj.add("game");
				obj.add("beautiful");
				obj.add("flower");
				
				
				HashSet<String> set=new HashSet<String>(obj);
				set.add("beautiful");
				
				Iterator<String> itr=set.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
	}

}
