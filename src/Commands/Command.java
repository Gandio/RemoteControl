package Commands;

public abstract class Command implements Commands{
	@Override
	public abstract void execute();
	
	@Override
	public final void execute(Object o) {}
}
