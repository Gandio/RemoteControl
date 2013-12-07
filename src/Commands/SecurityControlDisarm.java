package Commands;

import Machine.SecurityControl;

public class SecurityControlDisarm extends Command{
	private SecurityControl sc;
	
	public SecurityControlDisarm(SecurityControl sc) {
		// TODO Auto-generated constructor stub
		this.sc = sc;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sc.disarm();
	}
}
