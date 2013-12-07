package Machine;

public class Hottub {
	private double temperature = 25.0;
	
	public void circulate(){
		System.out.println("hottub circulate");
	}
	
	public void jetsOn(){
		System.out.println("hottub on");
	}
	
	public void jetsOff(){
		System.out.println("hottub off");
	}
	
	public void setTemperature(double temperature){
		this.temperature = temperature;
		System.out.println("Temperature: " + this.temperature);
	}
}
