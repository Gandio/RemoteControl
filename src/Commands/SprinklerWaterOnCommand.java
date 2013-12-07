package Commands;

import Machine.Sprinkler;

public class SprinklerWaterOnCommand extends Command{
	private Sprinkler sprinkler;
	
	public SprinklerWaterOnCommand(Sprinkler sprinkler) {
		// TODO Auto-generated constructor stub
		this.sprinkler = sprinkler;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sprinkler.waterOn();
	}
}
