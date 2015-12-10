import java.util.ArrayList;

public class Sorting {

	public static void sort(String[] testArray) {

		String letter;

		ArrayList<String> newArray = new ArrayList<String>();

		// iterates over testArray
		for (String s : testArray) {

			// iterates over newArray
			for (int i = newArray.size() + 1; i > 0; i--) {

				if (newArray.size() > 0) {

					for (int j = 0; j < newArray.size(); j++) {
						
						letter = newArray.get(j);

						if (s.compareTo(letter) <= 1) {

							newArray.add(j, s);

							break;
						}

					}
				} else {

					newArray.add(s);

				}

			}
			
			System.out.println(newArray);
		}
	}
}
