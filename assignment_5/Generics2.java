package assignment_5;



		import java.util.HashMap;
		import java.util.LinkedHashMap;
		import java.util.Map;
		import java.util.Scanner;

		public class Generics2 {

			public static void main(String[] args) {
				HashMap<Integer,Double> keys = new HashMap<>();
				Scanner s = new Scanner(System.in);
				for(int i=0;i<10;i++) {
					int key = s.nextInt();
					Double value = s.nextDouble();
					keys.put(key,value);
				}

				System.out.println("Mapped elements are: ");
				 for(Map.Entry m : keys.entrySet()){    
					    System.out.println(m.getKey()+" "+m.getValue());    
					   }  
			}
		}
				

