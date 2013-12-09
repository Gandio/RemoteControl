package Commands;

import Machine.GarageDoor;

public class GarageDoorDownCommand extends Command{
	private GarageDoor door;
	
	public GarageDoorDownCommand(GarageDoor door) {
		// TODO Auto-generated constructor stub
		this.door = door;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.down();
	}
}
