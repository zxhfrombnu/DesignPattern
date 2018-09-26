package stratety;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I am a red head duck");
	}
}
