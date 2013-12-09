package Commands;

import Machine.GarageDoor;

public class GarageDoorLightOffCommand extends Command{
	private GarageDoor door;
	
	public GarageDoorLightOffCommand(GarageDoor door) {
		// TODO Auto-generated constructor stub
		this.door = door;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.lightOff();
	}
}