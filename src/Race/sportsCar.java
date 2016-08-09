package Race;

public class sportsCar {
	static int speed = 0; //static variable to hold initial speed
	String type;
	String engineType;
	String driverName;
	
	//constructor accepting 3 arguments- name, car type, and engine type
	public sportsCar(String driverName,String type, String engineType){
		this.driverName = "Michael Schumacher";
		this.type = "BMW";
		this.engineType = "M6 Gran Coupe";
		System.out.println("Driver: "+ driverName + " driving " + type + " with engine " + engineType);
	}
	// constructor accepting only driver's name as argument
	public sportsCar(String driverName){
		this.driverName = "Michael Schumacher";
		System.out.println("Driver: "+ driverName);
	}
	//method to accelerate speed by 59 mph 
	public int accelerateSpeed(){
		speed += 59;
		return speed;
	}
	//method returning current speed
	public int getCurrentSpeed(int speed){
		return speed;
	}
	// method to double the speed 
	public int nitroSpeed(){
		return speed *= 2;
	}
	//method to stop the car
	public void stop(int speed){
		 speed = 0;
		 System.out.println("The current speed of " + type + " is " + speed);
	 }
	
}
