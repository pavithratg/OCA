
public class Test {

	final boolean flag = false;

	public static void main(String[] args) {
		while (new Test().flag) {
			System.out.println("I'm dead");
		}
	}

	void foo() {
//		while (flag) {
//			System.out.println("I'm unreachable");
//		}

		while (this.flag) {
			System.out.println("I'm dead");
		}

	}
}
