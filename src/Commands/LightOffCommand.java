package Commands;

import Machine.Light;

public class LightOffCommand extends Command{
	private Light light;
	
	public LightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}
}