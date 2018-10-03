package gumball;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}
}
