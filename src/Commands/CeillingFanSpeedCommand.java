package Commands;

import Machine.CeillingFan;

public class CeillingFanSpeedCommand extends CommandOneChoice{
	private CeillingFan fan;
	
	public CeillingFanSpeedCommand(CeillingFan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	
	@Override
	public void execute(Object o) {
		// TODO Auto-generated method stub
		fan.setSpeed(o);
	}

}
