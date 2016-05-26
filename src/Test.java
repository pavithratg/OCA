public class Test {

	public static void main(String[] args) {

		boolean hasParam = (args == null) ? false : true;

		if (hasParam) {
			System.out.println("hasParam");
		}
		{
			System.out.println("noParam");
		}

	}
}
