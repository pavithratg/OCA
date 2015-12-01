import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;

class BadFoodException extends Exception {

}

public class MyException {
	public static void main(String... args) {
		try {
			new MyException().checkFood(args[0]);
		} catch (BadFoodException bfe) {
			System.out.println("Bad food encountered!");
			bfe.printStackTrace();
		}

	}

	void checkFood(String food) throws BadFoodException {
		List<String> badFoodList = new ArrayList<String>();
		badFoodList.add("fish");
		badFoodList.add("meat");
		badFoodList.add("ham");

		if (badFoodList.contains(food)) {
			throw new BadFoodException();
		} else {
			System.out.println("I like " + food);
		}
	}
}
