package Commands;

import Machine.GarageDoor;

public class GarageDoorLightOnCommand extends Command{
	private GarageDoor door;
	
	public GarageDoorLightOnCommand(GarageDoor door) {
		// TODO Auto-generated constructor stub
		this.door = door;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.lightOn();
	}
}
