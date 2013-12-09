package Machine;

public class TV{
	private int channel = 0;
	private int volume = 5;
	
	public void off() {
		System.out.println("TV off");
	}
	
	public void on() {
		System.out.println("TV on");
	}
	
	public void setInputChannel(Object o){
		this.channel = (int) o;
		System.out.println("channel: " + this.channel);
	}
	
	public void setVolume(Object o){
		this.volume = (int) o;
		System.out.println("volume: " +  this.volume);
	}

}
