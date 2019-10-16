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
	public void testCompareTo() throws NameException {
		Student firstStudent = new Student("x", "y", 2);
		Student secondStudent = new Student("x", "y", 3);
		
		int actual = secondStudent.compareTo(firstStudent);
		//should be bigger than zero
		boolean result = false;
		if(actual > 0) {
			result = true;
		}
		assertTrue(result);
		
		Student student = new Student("x", "y", 5);
		
		result = false;
		actual = secondStudent.compareTo(student);
		//should be less than zero
		if(actual < 0) {
			result = true;
		}
		assertTrue(result);
		
		Student studentSame = new Student("x", "y", 3);
		
		result = false;
		actual = secondStudent.compareTo(studentSame);
		//should be zero
		if(actual == 0) {
			result = true;
		}
		assertTrue(result);
	}

	@Test
	public void testGet() {
		Integer expected = 4;
		Integer rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s;
		try {
			s = new Student(firstName, lastName, rating);
			Integer actual = s.getRating();
			assertEquals(expected, actual);
		} catch (NameException e) {
			fail();
		}
		
	}
}
