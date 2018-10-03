package stat;

public class Singleton {
	public static Singleton singleton = new Singleton();
	private Singleton(){}
	public static Singleton getInstance() {
		return singleton;
	}
	public String getDescription() {
		return "Using the static variable way to do it";
	}
}
