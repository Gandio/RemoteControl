import Commands.Commands;

//si quiero un remote control sencillo, es decir, con un boton, quito el vector

public class ComplexRemoteControl {
	private Commands[] slot;
	
	public ComplexRemoteControl(int maxSlot) {
		// TODO Auto-generated constructor stub
		slot = new Commands[maxSlot];
	}
	
	public void setSlot(Commands command, int numSlot) {
		slot[numSlot] = command;
	}
	
	public void buttonWasPressed(int numSlot){
		slot[numSlot].execute();
	}
	
	public void buttonWasPressed(int numSlot, Object o){
		slot[numSlot].execute(o);
	}
}
