package assign_6;
import java.util.TreeMap;

public class Heap {

	public static void main(String[] args) {
		
			
				TreeMap<Long,String> map=new TreeMap<Long,String>();
				
				map.put((long) 001, "hari");
				map.put((long) 002, "appu");
				map.put((long) 003, "chinnu");
				
				
				System.out.println("all the keys: "+map.keySet());
				System.out.println("all the values: "+map.values());
				System.out.println("all key-value pairs: "+map.keySet()+map.values());
				System.out.println("descendingMap: "+map.descendingMap());
			}

	
}
