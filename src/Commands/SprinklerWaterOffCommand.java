package Commands;

import Machine.Sprinkler;

public class SprinklerWaterOffCommand extends Command{
	private Sprinkler sprinkler;
	
	public SprinklerWaterOffCommand(Sprinkler sprinkler) {
		// TODO Auto-generated constructor stub
		this.sprinkler = sprinkler;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sprinkler.waterOff();
	}
}
