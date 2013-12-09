package Commands;

import Machine.GarageDoor;

public class GarageDoorUpCommand extends Command{
	private GarageDoor door;
	public GarageDoorUpCommand(GarageDoor door) {
		// TODO Auto-generated constructor stub
		this.door = door;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.up();
	}
}
