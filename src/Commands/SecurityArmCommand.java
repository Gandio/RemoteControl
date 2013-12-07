package Commands;

import Machine.SecurityControl;

public class SecurityArmCommand extends Command{
	SecurityControl sc;
	public SecurityArmCommand(SecurityControl sc) {
		// TODO Auto-generated constructor stub
		this.sc = sc;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sc.arm();
	}
}
