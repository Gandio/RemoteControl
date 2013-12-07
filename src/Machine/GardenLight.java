package Machine;

public class GardenLight {
	public void setDuskTime(int time){
		System.out.println("dusk: " + time + " hs");
	}
	
	public void setDawnTime(int time){
		System.out.println("dawn: " + time + " hs");
	}
	
	public void manualOn(){
		System.out.println("garden light manual control on");
	}
	
	public void manualOff(){
		System.out.println("garden light manual control off");
	}
}
