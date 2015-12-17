import java.util.ArrayList;

public class Sorting {

	public static void sort(String[] testArray) {

		String letter;

		ArrayList<String> newArray = new ArrayList<String>();
		
		int array = newArray.size(); 

		// iterates over testArray
		for (String s : testArray) {

			System.out.println(s);
			
			if(newArray.size() == 0){
				
				array = 1; 
				
			}
			else{
				
				array = newArray.size(); 
				
			}

			// iterates over newArray
			for (int i = array; i > 0; i--) {

				if (newArray.size() > 0) {

					for (int j = 0; j < newArray.size(); j++) {

						letter = newArray.get(j);

						if (s.compareTo(letter) <= 1) {

							newArray.add(j, s);

							break;
							
						}
						//if (s.compareTo(letter) > 1) 
						else{

							newArray.add(s);
							
							array = array--; 

							//break;

						}

					}
				} else {

					newArray.add(s);

					break;

				}

				System.out.println(newArray);
				
			}
		}
	}
}
