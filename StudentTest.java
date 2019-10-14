import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	private static final int INITIAL_RATING = 5;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStudent() {
		try {
			Student s = new Student();
			
			Integer rating = s.getRating();
			Integer expected = INITIAL_RATING;
			
			assertEquals(expected, rating);
		} catch (NameException e) {
			fail();
		}
	}
	
	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

}
