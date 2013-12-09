package Commands;

import Machine.CeillingFan;

public class CeillingFanHightCommand extends Command{
	private CeillingFan fan;
	
	public CeillingFanHightCommand(CeillingFan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.hight();
	}
}
