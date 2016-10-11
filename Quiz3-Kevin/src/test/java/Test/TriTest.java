package Test;

import Quiz3.Triangle;
import Quiz3.TriangleException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class TriTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void triTestOne() {
		Triangle a = new Triangle(0, 0, 0);
		Triangle b = new Triangle(1, 1, 1);
		Triangle c = new Triangle(6, 8, 10);
		Triangle d = new Triangle(4, 4, 2);

		assertTrue(a.getPerimeter() == 0.0);
		assertTrue(b.getPerimeter() == 3.0);
		assertTrue(c.getPerimeter() == 24.0);
		assertTrue(d.getPerimeter() == 10.0);

		assertTrue(a.getArea() == 0);
		assertTrue(b.getArea() == 0.4330127018922193);
		assertTrue(c.getArea() == 24.0);
		assertTrue(d.getArea() == 3.872983346207417);
		
		assertFalse(a.getPerimeter() == 0.01);
		assertFalse(b.getPerimeter() == 3.10);
		assertFalse(c.getPerimeter() == 24.20);
		assertFalse(d.getPerimeter() == 10.40);

		assertFalse(a.getArea() == 20);
		assertFalse(b.getArea() == 20.4330127018922193);
		assertFalse(c.getArea() == 524.0);
		assertFalse(d.getArea() == 63.872983346207417);

	}
	
	@Test(expected=TriangleException.class)
	public void triangleCheck() {
		Triangle E  = new Triangle(-1.0, 4.0, -200.0); 
		try {
			E.acceptableTriangle();
		} catch (TriangleException e) {
			e.printStackTrace();
		}
	}
}
