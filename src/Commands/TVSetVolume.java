package Commands;

import Machine.TV;

public class TVSetVolume extends CommandOneChoice{
	private TV tv = new TV();
	
	public TVSetVolume(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	
	@Override
	public void execute(Object o) {
		// TODO Auto-generated method stub
		tv.setVolume(o);
	}
}
