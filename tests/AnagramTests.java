import static org.junit.Assert.*;

import org.junit.Test;


public class AnagramTests {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(true, Anagrams.isAnagram("cat","tac"));
		
		assertEquals(false, Anagrams.isAnagram("cool","pool")); 
		
	}

}
