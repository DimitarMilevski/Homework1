package Race;

public class Race {

	public static void main(String[] args) {
	System.out.println("Welcome to the Race Track\n"
			+ "today's contestants are:");
		
	SUV car1 = new SUV( "Ayrton Senna",  "Range Rover","LR-V8");
	sportsCar car2 = new sportsCar( "Michael Schumacher","BMW","M6 Gran Coupe");
	sedan car3 = new sedan("Alain Prost", "Dodge Charger","SRT");
	truck car4 = new truck("Lewis Hamilton","Dodge Ram","SRT-10");
	System.out.println();
	
	
	
	System.out.println("After lap 1 contestents current speed is: ");
	System.out.println(car1.type + " current speed is " + car1.getCurrentSpeed(car1.accelerateSpeed()));
	System.out.println(car2.type + " current speed is " + car2.getCurrentSpeed(car2.accelerateSpeed()));
	System.out.println(car3.type + " current speed is " + car3.getCurrentSpeed(car3.accelerateSpeed()));
	System.out.println(car4.type + " current speed is " + car4.getCurrentSpeed(car4.accelerateSpeed()));
	System.out.println();
	
	System.out.println("After lap 2 contestents current speed is: ");
	System.out.println(car1.type + " current speed is " + car1.getCurrentSpeed(car1.slowDown()));
	System.out.println(car2.type + " current speed is " + car2.getCurrentSpeed(car2.nitroSpeed()));
	System.out.println(car3.type + " current speed is " + car3.getCurrentSpeed(car3.slowDown()));
	System.out.println(car4.type + " current speed is " + car4.getCurrentSpeed(car4.nitro()));
	System.out.println();
	
	System.out.println("During final lap contestents current speed is: ");
	System.out.println(car1.type + " current speed is " + car1.getCurrentSpeed(car1.accelerateSpeed()));
	System.out.println(car2.type + " current speed is " + car2.getCurrentSpeed(car2.accelerateSpeed()));
	System.out.println(car3.type + " current speed is " + car3.getCurrentSpeed(car3.nitro()));
	System.out.println(car4.type + " current speed is " + car4.getCurrentSpeed(car4.nitro()));
	System.out.println();
	
	System.out.println("There is an accident on the Race Track and all of the contestents have to stop emediately !!!");
	int speed  = car4.getCurrentSpeed(car4.nitro());
	car4.stop(car4.getCurrentSpeed(speed));
	
	speed  = car3.getCurrentSpeed(car3.nitro());
	car3.stop(car3.getCurrentSpeed(speed));
	
	speed  = car2.getCurrentSpeed(car2.accelerateSpeed());
	car2.stop(car2.getCurrentSpeed(speed));
	
	speed  = car1.getCurrentSpeed(car1.slowDown());
	car1.stop(car1.getCurrentSpeed(speed));
	}
}
