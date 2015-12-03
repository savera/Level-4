import static org.junit.Assert.*;

import org.junit.Test;

public class StrinfBarfTest {

	@Test
	public void test() {

		assertEquals("frab", reverseMe("barf"));

		assertEquals("loop", reverseMe("pool"));
	}

	public String reverseMe(String word) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < word.length(); i++) {

			String letter = word.substring(word.length() - 1 - i, word.length() - i);

			builder.append(letter);
		}

		StringBuilder reversed = builder;

		String r = reversed.toString();

		return r;
	}



}
