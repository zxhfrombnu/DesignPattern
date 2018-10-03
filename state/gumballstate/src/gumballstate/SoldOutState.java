package gumballstate;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You cannot insert money for empty machine");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You cannot eject, you havn't insert moeny");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but it's already sold out");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "Current state : sold out";
	}
}
