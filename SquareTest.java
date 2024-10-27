package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test1() {
		Point center = new Point(0,0);
		Point vector = new Point(1,1);
		Square square = new Square(vector,center);
		assertEquals(square.circumference(), 8, 1e-9);
	}
	
	@Test
	void test2() {
		Point center = new Point(0,0);
		Point vector = new Point(3,4);
		Square square = new Square(vector,center);
		assertEquals(50, square.area());
	}
	
	@Test
	void test3() {
		Point center = new Point(0,0);
		Point vector = new Point(1,1);
		Square square = new Square(vector,center);
		Point vector2 = new Point(1,2);
		Square square2 = new Square(vector2,center);
		assertFalse(square.equals(square2));
	}
	
	@Test
	void test4() {
		Point center = new Point(0,0);
		Point vector = new Point(1,1);
		Square square = new Square(vector,center);
		assertTrue(square.equals(square));	
	}

	@Test
	void test5() {
		Point center = new Point(0,0);
		Point vector = new Point(1,1);
		Square square = new Square(vector,center);
		assertFalse(square.equals(null));
	}

}
