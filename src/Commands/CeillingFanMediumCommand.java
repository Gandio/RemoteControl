package Commands;

import Machine.CeillingFan;

public class CeillingFanMediumCommand extends Command{
	private CeillingFan fan;
	public CeillingFanMediumCommand(CeillingFan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.mediun();
	}
}
