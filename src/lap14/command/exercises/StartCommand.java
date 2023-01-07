package lap14.command.exercises;


public class StartCommand implements Command {
	private Computer computer;

	public StartCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.start();
	}
}
