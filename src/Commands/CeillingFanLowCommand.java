package Commands;

import Machine.CeillingFan;

public class CeillingFanLowCommand extends Command{
	private CeillingFan fan;
	
	public CeillingFanLowCommand(CeillingFan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.low();
	}
}
