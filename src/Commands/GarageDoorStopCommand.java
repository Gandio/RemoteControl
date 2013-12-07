package Commands;

import Machine.GarageDoor;

public class GarageDoorStopCommand extends Command{
	GarageDoor door;
	
	public GarageDoorStopCommand(GarageDoor door) {
		// TODO Auto-generated constructor stub
		this.door = door;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.stop();
	}
}
