package stratety;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuck = new RubberDuck();
		DecoyDuck decoyDuck = new DecoyDuck();
		ModelDuck modelDuck = new ModelDuck();

		mallard.performQuack();
		mallard.performFly();

		rubberDuck.performQuack();
		rubberDuck.performFly();

		decoyDuck.performQuack();
		decoyDuck.performFly();

		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}
