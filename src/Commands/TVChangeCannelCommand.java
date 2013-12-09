package Commands;

import Machine.TV;

public class TVChangeCannelCommand extends CommandOneChoice{
	private TV tv = new TV(); 
	
	public TVChangeCannelCommand(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	
	@Override
	public void execute(Object o) {
		// TODO Auto-generated method stub
		tv.setInputChannel(o);
	}

}
