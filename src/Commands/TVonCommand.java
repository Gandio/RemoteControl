package Commands;

import Machine.TV;

public class TVonCommand extends Command{
	private TV tv = new TV();
	
	public TVonCommand(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
	}
}
