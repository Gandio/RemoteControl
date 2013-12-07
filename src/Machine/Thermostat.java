package Machine;

public class Thermostat {
	private double temperature = 25.0;
	
	public void setTemperature(Object o){
		this.temperature = (double) o;
		System.out.println("Temperature: " + this.temperature);
	}
}
