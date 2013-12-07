import Commands.LightOffCommand;
import Commands.LightOnCommand;
import Commands.StereoSetCDCommand;
import Machine.Light;
import Machine.Stereo;

public class TestRemoteControl {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexRemoteControl remote = new ComplexRemoteControl(4);
		
		LightOnCommand lighton = new LightOnCommand(new Light());
		LightOffCommand lightoff = new LightOffCommand(new Light());
		
		StereoSetCDCommand stereocd = new StereoSetCDCommand(new Stereo());
		
		remote.setSlot(lighton, 0);
		remote.setSlot(lightoff, 1);
		remote.setSlot(stereocd, 2);
		
		remote.buttonWasPressed(0);
		remote.buttonWasPressed(2, "la barbacoa");
	}
}
