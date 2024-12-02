package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageTest {
	@Test
	void testAverage() {
		Average avg = new Average();

		assertEquals(2, avg.average(3, new int[]{1, 2, 3, 4, 5}));
        assertEquals(3, avg.average(5, new int[]{1, 2, 3, 4, 5}));
        assertEquals(2, avg.average(7, new int[]{1, 2, 3}));
        assertEquals(0, avg.average(0, new int[]{1, 2, 3}));
        assertEquals(0, avg.average(2, new int[]{}));
        
        assertEquals(-2, avg.average(5, new int[]{-1, -2, -3, -4}));
        assertEquals(0, avg.average(0, new int[]{1, 2, 3}));
        assertEquals(-15, avg.average(2, new int[]{-10, -20, 30, 40}));
        
        assertEquals(10, avg.average(1, new int[]{10}));
        assertEquals(0, avg.average(0, new int[]{10}));
        assertEquals(3, avg.average(5, new int[]{1, 2, 3, 4, 5}));
        assertEquals(3, avg.average(6, new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, avg.average(1, new int[]{0, -10, 20}));
	}
}
