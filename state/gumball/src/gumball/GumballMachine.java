package gumball;

public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0;

	public GumballMachine(int count) {
		this.count = count;
		if(count > 0) {
			state = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if(state == SOLD_OUT) {
			System.out.println("You cannot insert a quarter for a sold out machine");
		} else if(state == SOLD) {
			System.out.println("Please wait, we're already given you a gumball");
		}
	}

	public void ejectQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} else if(state == NO_QUARTER) {
			System.out.println("You havn't inserted a quarter");
		} else if(state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} else if(state == SOLD_OUT) {
			System.out.println("You cannot eject for a sold out state");
		}
	}

	public void turnCrank() {
		if(state == SOLD) {
			System.out.println("You cannot turn crank twice.");
		} else if(state == NO_QUARTER) {
			System.out.println("You turned but there is no quarter.");
		} else if(state == SOLD_OUT) {
			System.out.println("You turned but all gumball sold out.");
		} else if(state == HAS_QUARTER) {
			System.out.println("You turned ...");
			state = SOLD;
			dispense();
		}
	}

	public void dispense() {
		if(state == SOLD) {
			System.out.println("A gumball comes rolling out...");
			count = count - 1;
			if(count == 0) {
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if(state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if(state == SOLD_OUT) {
			System.out.println("The gumballs are already sold out.");
		} else if(state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		}
	}

	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("amount of gumball : " + count + " ; Current state : ");
		if(state == SOLD_OUT) {
			sb.append("sold out");
		} else if(state == NO_QUARTER) {
			sb.append("no quarter");
		} else if(state == HAS_QUARTER) {
			sb.append("has quarter");
		} else {
			sb.append("sold");
		}
		return sb.toString();
	}
}
