import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LovelyPalindromes {

	public static void main(String[] args) throws IOException {

		String line;

		int total = 0;

		// creates/gets a file
		File file = new File("/Users/league/Desktop/Level-4/Files/plaindromes.txt");

		System.out.println(file.getCanonicalFile());

		FileReader reader = new FileReader(file);

		BufferedReader read = new BufferedReader(reader);

		while ((line = read.readLine()) != null) {

			int size = line.length() / 2;

			// String partOne = line.substring(0, size+1);

			// String partTwo = line.substring(size, line.length());

			/*
			 * if(partOne.compareTo(partTwo) == 0){
			 * 
			 * total++;
			 * 
			 * System.out.println(line);
			 * 
			 * }
			 */

			boolean pal = true;

			for (int i = 0; i < size; i++) {

				if (line.substring(i, i + 1).equals(line.substring(line.length() - 1 - i, line.length() - i))) {

					// System.out.println(line);

				} else {

					pal = false;

					break;

				}

			}
			
			if(pal == true){
				
				total++;
				
				System.out.println(line);
				
			}


		}
		System.out.println(total);
		

	}
}
