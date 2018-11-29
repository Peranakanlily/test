
public class Car {

	
	//you dont have to write extends java.lang.Object next to public class Car
	
	{System.out.println("This is an inner block"); 
	//1st block is useful to initiate constants such as static variable
	//2nd initiatlise data for instance variable before constructors
	id = 0; 
	//you can also have a block inside another block 
	{
		
	}
	
	}
	private int id;
	private String name;
	private String description;
	private String tagline;
	private double price;
	
	public Car(int id, String name, String description, String tagline, double price) {
		//super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.tagline = tagline;
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public class Wheel{
		
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", description=" + description + ", tagline=" + tagline + ", price="
				+ price + "]";
	}
	
	
}
	
	
