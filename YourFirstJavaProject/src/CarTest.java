
public class CarTest {
	public static void main(String[] args) {
		
		String Happy = "Crazy Love";
		Car c1 = new Car();
		Car c2 = new Car(1,"Honda City","Uncle Cars","always works but expensive",130000.00);
		Car c3 = new Car(1,"Honda City","Uncle Cars","always works but expensive",130000.00);
		System.out.println("hash Code for C2 is " + c2.hashCode());
		System.out.println("hash Code for C3 is " + c3.hashCode());
		int x = c2.getId();
		
		//c2 and c3 are not the same but are instance of another data(see hash code)
		//use c2.equals and hashcode generated for car.java to set c3 and c2 to equal if same data(using id)
		if(c2.equals(c3)) {
			
			System.out.println("They are same cars");
			}else {System.out.println("They are different");
			}
		System.out.println("name of car is "+ c2.getName());

		//testing == and equals for string
		String s1 = "Hello World";
		String s2 = new String("Hello World");
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2);// false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		chopLast( Happy);
		
		
	}
	
	
	
		public static  String chopLast (String s) {
		int stringSize = s.length();
		return (s.substring (0, (stringSize -1)));}
	

}
