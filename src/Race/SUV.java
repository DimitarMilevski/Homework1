package Race;

public class SUV {
	
	 
	static int speed = 0; //static variable to hold initial speed
	String engineType; 
	String type;
	String driverName;
	
	//constructor accepting 3 arguments- name, car type, and engine type
	public SUV(String driverName,String type, String engineType){
		this.driverName = "Ayrton Senna";
		this.type = "Range Rover";
		this.engineType = "LR-V8";
		System.out.println("Driver: "+ driverName + " driving " + type + " with engine " + engineType);
	}
	//constructor accepting 2 arguments- name, car type
	public SUV(String driverName,String type){
		this.driverName = "Ayrton Senna";
		this.type = "Range Rover";
		System.out.println("Driver: "+ driverName + " driving " + type);
	}
	
	//method accelerating the speed with 70 mph
	public int accelerateSpeed(){
		speed += 70;
		return speed;
	}
	// method returning the current speed of the car
	public int getCurrentSpeed(int speed){
		return speed;
	}
	//method decreasing the current speed with 10 mph
	public int slowDown(){
		return speed -= 10;
	}
	// non-returning method 
	public void stop(int speed){
		 speed = 0;
		 System.out.println("The current speed of " + type + " is " + speed);
	 }
}
