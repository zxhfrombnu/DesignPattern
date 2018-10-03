package gumballstate;

public class SoldState implements State {
	GumballMachine gumballmachine;

	public SoldState(GumballMachine gumballmachine) {
		this.gumballmachine = gumballmachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("please take out the ball first");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("cannot eject because there is no quarter");
	}

	@Override
	public void turnCrank() {
		System.out.print("it's already sold, please take the ball out");
	}

	@Override
	public void dispense() {
		gumballmachine.releaseBall();
		if(gumballmachine.getCount() > 0) {
			gumballmachine.setState(gumballmachine.getNoQuarterState());
		} else {
			gumballmachine.setState(gumballmachine.getSoldOutState());
		}
	}

	public String toString() {
		return "current state : sold";
	}
}
