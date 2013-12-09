package Commands;

public abstract class CommandOneChoice implements Commands{
	@Override
	public final void execute() {}
	
	@Override
	public abstract void execute(Object o);
}
