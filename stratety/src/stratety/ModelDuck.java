package stratety;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I am a model duck");
	}
}
