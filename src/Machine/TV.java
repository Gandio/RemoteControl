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
	
	public void setInputChannel(int channel){
		this.channel = channel;
		System.out.println("channel: " + this.channel);
	}
	
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("volume: " +  this.volume);
	}

}
