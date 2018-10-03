package gumballstate;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You insert a quarter..");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("failed to eject because there is no quarter inside");
	}

	@Override
	public void turnCrank() {
		System.out.println("you turned. no ball will come out");
	}

	@Override
	public void dispense() {
		System.out.println("there is no ball dispensed. please pay first");
	}

	public String toString() {
		return "Current state : no quarter";
	}
}
