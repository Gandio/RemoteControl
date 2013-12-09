package Commands;

import Machine.TV;

public class TVoffCommand extends Command{
	private TV tv = new TV();
	
	public TVoffCommand(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.off();
	}

}
