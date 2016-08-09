package Race;

public class sedan {
	static int speed = 0; //static variable to hold initial speed
	String type;
	String engineType;
	String driverName;
	//constructor accepting 3 arguments- name, car type, and engine type
	public sedan(String driverName,String type, String engineType){
		this.driverName ="Alain Prost";
		this.type =  "Dodge Charger";
		this.engineType = "SRT";
		System.out.println("Driver: "+ driverName + " driving " + type + " with engine " + engineType);
	}
	//constructor accepting 2 arguments- name and engine type
	public sedan(String driverName, String engineType){
		this.driverName ="Alain Prost";
		this.engineType = "SRT";
		}
	//method to accelerate speed by 53 mph
	public int accelerateSpeed(){
		speed += 53;
		return speed;
	}
	// method returning the current speed of the car
	public int getCurrentSpeed(int speed){
		return speed;
	}
	// method to slow the speed with 10 mph
	public int slowDown(){
		return speed -= 10;
	}
	// method to double the speed
	public int nitro(){
		return speed *= 2;
	}
	//non-returning method to stop the car
	public void stop(int speed){
		 speed = 0;
		 System.out.println("The current speed of " + type + " is " + speed);
	 }
}
