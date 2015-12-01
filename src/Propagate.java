public class Propagate {

	String reverse(String s) throws Exception {

		if (s.length() == 0) {
			throw new Exception();
		}

		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		return str;
	}

	public static void main(String... args) {
		try {
			System.out.println(new Propagate().reverse(""));
		} catch (Exception e) {
			System.out.println("The string must not be of length 0");
		} finally {
			System.out.println("Releasing resources...");
		}
	}
}