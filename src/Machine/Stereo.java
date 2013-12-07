package Machine;

public class Stereo{
	private String cd = null;
	private String dvd = null;
	private boolean radio = false;
	private int volume = 5;
	
	public void off() {
		System.out.println("Stereo off");
	}
	
	public void on() {
		System.out.println("Stereo on");
	}
	
	public void setCD(Object o){
		this.cd = (String) o;
		System.out.println("Listening: " + this.cd);
	}
	
	public void setDVD(Object o){
		this.dvd = (String) dvd;
		System.out.println("Listening: " + this.dvd);
	}
	
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("Volume: " +  this.volume);
	}
	
	public void setRadio(boolean radio){
		this.radio = radio;
		if(this.radio == true) System.out.println("Radio on");
		else System.out.println("Radio on");
	}
}
