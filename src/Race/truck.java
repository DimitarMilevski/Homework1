package Race;

public class truck {
	static int speed = 0; //static variable to hold initial speed
	String type ;
	String engineType;
	String driverName;
	//constructor accepting 3 arguments- name, car type, and engine type
	public truck(String driverName,String type, String engineType){
		this.driverName = "Lewis Hamilton";
		this.type ="Dodge Ram";
		this.engineType = "SRT-10";
		System.out.println("Driver: "+ driverName + " driving " + type + " with engine " + engineType);
	}
	//constructor accepting driver's name and car type 
		public truck(String driverName,String type){
			this.driverName = "Lewis Hamilton";
			this.type ="Dodge Ram";
			System.out.println("Driver: "+ driverName + " driving " + type);
		}
	// method to accelerate the speed by 46 mph	
	public int accelerateSpeed(){
		speed += 46;
		return speed;
	}
	// method returning the current speed of the car
	public int getCurrentSpeed(int speed){
		return speed;
	}
	//method that multiply the speed by 1.5
	public int nitro(){
		return speed *= 1.5;
	}
	//stop method
	 public void stop(int speed){
		 speed = 0;
		 System.out.println("The current speed of " + type + " is " + speed);
	 }
}

