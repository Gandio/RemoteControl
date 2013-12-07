package Commands;
import Machine.Stereo;

public class StereoOffCommand extends Command{
	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.off();
	}
}
