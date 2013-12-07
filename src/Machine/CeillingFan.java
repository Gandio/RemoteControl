package Machine;

public class CeillingFan {
	public double speed = 5.0;
	
	public void hight(){
		speed = 10.0;
		System.out.println("Ceilling fan speed hight");
	}

	public void mediun(){
		speed = 5.0;
		System.out.println("Ceilling fan speed medium");
	}
	
	public void low(){
		speed = 1.0;
		System.out.println("Ceilling fan speed low");
	}
	
	public void setSpeed(double speed){
		this.speed = speed;
		System.out.println("Ceilling fan speed: " + this.speed);
	}
}