package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CircleTest {

	@AfterEach
	void tearDown() throws Exception {
	}

    @Test
    public void testCircle_1() {
		Point p = new Point(0, 0);
		Circle c = new Circle(1.0, p);
        assertNotNull(c);
        assertEquals(c.r, 1.0);
        assertEquals(c.circumference(), 2.0 * Math.PI);
    }
    
    @Test
    public void testCircle_2() {
		Point p = new Point(0, 0);
		Circle c = new Circle(1.0, p);
        assertEquals(c.issame(c), true);
    }

    @Test
    public void testCircle_3() {
		Point p = new Point(0, 0);
		Circle c = new Circle(1.0, p);
        assertEquals(c.issame(null), false);
    }

    @Test
    public void testCircle_4() {
		Point p = new Point(0, 0);
		Circle c = new Circle(1.0, p);
        assertEquals(c.issame(p), false);
    }
    
    @Test
    public void testCircle_5() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(1.0, p1);
		Point p2 = new Point(0, 0);
		Circle c2 = new Circle(1.0, p2);
        assertEquals(c1.issame(c2), true);
    }
    
    @Test
    public void testCircle_6() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(1.0, p1);
		Point p2 = new Point(0, 1);
		Circle c2 = new Circle(1.0, p2);
        assertEquals(c1.issame(c2), false);
    }

    @Test
    public void testCircle_7() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(1.0, p1);
		Point p2 = new Point(1, 0);
		Circle c2 = new Circle(1.0, p2);
        assertEquals(c1.issame(c2), false);
    }
    
    @Test
    public void testCircle_8() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(1.0, p1);
		Point p2 = new Point(0, 0);
		Circle c2 = new Circle(2.0, p2);
        assertEquals(c1.issame(c2), false);
    }
}