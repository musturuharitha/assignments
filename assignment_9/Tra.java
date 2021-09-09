package assign_9;

public class Tra {
	private String name = "";
	private String city = "";
     public Tra(String n, String city){
				this.name=n;
				this.city=city;
			}

			public String getName() {
				return name;
			}

			public String getCity() {
				return city;
			}

			@Override
			public String toString() {
				return "Tra [name=" + this.name + ", city=" + this.city + "]";




	}

}
