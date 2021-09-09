package assign_6;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		

		class contact{
			enum gender{
				female,male;
			}
		    long phno;
		    String name;
		    String emailid;
		    
		    
		    gender g1;

		    public contact(long phno, String name, gender g1) {
		        this.phno = phno;
		        this.name = name;
		        this.g1 = g1;
		    }

		    public long getPhno() {
		        return phno;
		    }

		    public String toString(){
		        return "Contact: " + this.name +" ph no: "+this.getPhno();
		    }
		}
		class Q1 {

		    public void main(String[] args) {
		        long mnumber = 000000000;
		        TreeMap<Long,contact> TreeMap1 = new TreeMap<>(Collections.reverseOrder());
		        contact[] contacts=new contact[10];
		        long j = 80;
		       
		        TreeMap1.put(10L,new contact(938625653,"appu", contact.gender.male));
		        TreeMap1.put(30L,new contact(987637342,"greeshma", contact.gender.female));

		        System.out.println(TreeMap1.keySet());  
		        
		        System.out.println(TreeMap1.values()); 
		        System.out.println(TreeMap1);  

		        Iterator it = new Iterator() {
		            @Override
		            public boolean hasNext() {
		                return false;
		            }

		            @Override
		            public Object next() {
		                return null;
		            }
		        };
		      
		    }
		}
		
	}

}
