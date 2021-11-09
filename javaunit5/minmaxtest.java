package jupiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Test
	void testMinMaxFind() {
		MinMaxFinder mm = new MinMaxFinder();
		
		int expedted[] = new int[] {3,56};
		
		assertArrayEquals(expedted, mm.arr(new int[] {45, 34,3, 55, 56,11,22,12}));
	}

	@Test
	void testMinMaxFind1() {
		MinMaxFinder mm1 = new MinMaxFinder();
		
		int expedted1[] = new int[] {1,78};
		
		assertArrayEquals(expedted1, mm1.arr(new int[] {78,1,30,55,36,69,18,45,10}));
	}
	
	@Test
	void testMinMaxFind2() {
		MinMaxFinder mm2 = new MinMaxFinder();
		
		int expedted2[] = new int[] {100,889};
		
		assertArrayEquals(expedted2, mm2.arr(new int[] {699,100,105,356,747,889,465}));
	}
	
}
