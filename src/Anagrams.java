import java.io.*;
import java.util.*;

public class Anagrams {

	static boolean isAnagram(String anagram1, String anagram2) {

		char[] first = anagram1.toCharArray();

		int firstLength = first.length;

		Arrays.sort(first);

		char[] second = anagram2.toCharArray();

		int secondLength = second.length;

		Arrays.sort(second);

		if (firstLength == secondLength) {

			for (int i = 0; i < firstLength; i++) {

				if (first[i] == second[i]) {

					return true;

				}else{
					
					return false; 
					
				}

			}

		} else {

			return false;

		}

		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String anagram1 = sc.next();
		String anagram2 = sc.next();
		boolean ret = isAnagram(anagram1, anagram2);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}
}