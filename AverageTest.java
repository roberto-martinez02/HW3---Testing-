package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageTest {
	
	Average avg = new Average();
	
	@Test
	void testAverage1() {
		assertEquals(2, avg.average(3, new int[]{1, 2, 3, 4, 5}));
	}
	
	@Test
	void testAverage2() {
		assertEquals(3, avg.average(5, new int[]{1, 2, 3, 4, 5}));
	}
	
	@Test
	void testAverage3() {
		assertEquals(2, avg.average(7, new int[]{1, 2, 3}));
		}
	
	@Test
	void testAverage4() {
		assertEquals(0, avg.average(0, new int[]{1, 2, 3}));
		}
	
	@Test
	void testAverage5() {
		assertEquals(0, avg.average(2, new int[]{}));
		}

	@Test
	void testAverage6() {
		assertEquals(0, avg.average(0, new int[]{}));
		}
	
	@Test
	void testAverage7() {
		assertEquals(-2, avg.average(5, new int[]{-1, -2, -3, -4}));
		}
	
	@Test
	void testAverage8() {
		assertEquals(-15, avg.average(2, new int[]{-10, -20, 30, 40}));
		}
	
	@Test
	void testAverage9() {
		assertEquals(10, avg.average(1, new int[]{10}));
		}

	@Test
	void testAverage10() {
		assertEquals(0, avg.average(0, new int[]{10}));
		}
	
	@Test
	void testAverage11() {
		assertEquals(3, avg.average(5, new int[]{1, 2, 3, 4, 5}));
		}
	
	@Test
	void testAverage12() {
		assertEquals(3, avg.average(6, new int[]{1, 2, 3, 4, 5}));
		}
	
	@Test
	void testAverage13() {
		assertEquals(0, avg.average(1, new int[]{0, -10, 20}));
		}
}
