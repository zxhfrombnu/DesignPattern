package stratety;

public class MallardDuck extends Duck {
	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	void display() {
		System.out.println("I am a Mallard duck");	
	}
}
