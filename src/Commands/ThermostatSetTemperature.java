package Commands;

import Machine.Thermostat;

public class ThermostatSetTemperature extends CommandOneChoice{
	private Thermostat thermostat;
	
	public ThermostatSetTemperature(Thermostat t) {
		// TODO Auto-generated constructor stub
		thermostat = t;
	}
	
	@Override
	public void execute(Object o) {
		// TODO Auto-generated method stub
		thermostat.setTemperature(o);
	}

}
