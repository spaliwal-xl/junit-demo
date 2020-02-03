package junit5;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit5.Sample;

public class SampleTest {
	
	
	Sample s = new Sample();
	
	int sum = s.sum(1, 2);
	int subtract = s.subtract(5, 2);
	
	
	@Test
	public void PositiveAddTest() {
		
		assertTrue(sum == 3);
	}
	@Test
	public void NegativeAddTest() {

		assertTrue(sum == 4);
	}
	@Test
	public void PositiveSubtractTest() {
		
		assertTrue(subtract == 3);
	}
	@Test
	public void NegativeSubtract() {
		
		assertTrue(subtract == 4);
	}

}

