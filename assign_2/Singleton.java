package assignment2;

public class Singleton {
private static Singleton Singletone =null;
public String text;
private Singleton() {
	text="singleton";
	
}
public static Singleton getInstance() {
Object Singleton = null;
if(Singleton==null) {
	Singleton = new Singleton();
	
}
	return (assignment2.Singleton) Singleton;
}


	}


