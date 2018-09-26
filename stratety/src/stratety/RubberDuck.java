package stratety;

public class RubberDuck extends Duck {
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}

	public void display() {
		System.out.println("I am a rubber duck");
	}
}
