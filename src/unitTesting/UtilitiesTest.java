package eighteenthSection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilitiesTest {

	@Test
	public void everyWithChar() throws Throwable {

	}

	@Test
	public void removePairs() throws Throwable {
		Utilities util = new Utilities();
		assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
		assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
	}

	@Test
	public void converter() throws Throwable {

	}

	@Test
	public void nullIfOddLength() throws Throwable {

	}

}
