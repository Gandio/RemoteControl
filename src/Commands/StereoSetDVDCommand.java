package Commands;

import Machine.Stereo;

public class StereoSetDVDCommand extends CommandOneChoice{
	private Stereo stereo;
	
	public StereoSetDVDCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}

	@Override
	public void execute(Object o) {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setDVD(o);

	}

}
