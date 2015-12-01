interface Rideable {
	String getGait();
}

public class Camel implements Rideable {
	int weight = 2;

	public static void main(String[] args) {
		new Camel().go(8);
	}

	void go(int speed) {
		++speed;
		weight++;
		int walkrate = speed * weight;
		System.out.print(walkrate + getGait());
	}

	// this wont compile, if the access level is default, because you cannot use
	// more restricted access level in overridden methods. Note that interface
	// methods are implicitly public and abstract whether you typed it or not.
	public String getGait() {
		return " mph, lope";
	}
}