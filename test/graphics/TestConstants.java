package graphics;

import static org.junit.Assert.*;

import graphics.Constants;

import org.junit.Test;

public class TestConstants {

	@Test
	public void testOneOverRoot2() {

		double expectedOneOverRoot2 = 0.7071067811865475;
		assertTrue(expectedOneOverRoot2 == Constants.ONE_OVER_ROOT_2);
	}
	
	@Test
	public void testPhi(){
		
		double expectedPhi = 1.618033988749895;
		assertTrue(expectedPhi == Constants.PHI);
	}
	
	@Test
	public void testOneOverPhi(){

		double expectedOneOverPhi = 0.6180339887498948;
		assertTrue(expectedOneOverPhi == Constants.ONE_OVER_PHI);
	}

	@Test
	public void testOneOverRoot10(){

		double expectedOneOverRoot10 = 0.31622776601683794;
		assertTrue(expectedOneOverRoot10 == Constants.ONE_OVER_ROOT_10);
	}
	
	@Test
	public void testOneOverRoot6(){
		
		double expectedOneOverRoot6 = 0.4082482904638631;
		assertTrue(expectedOneOverRoot6 == Constants.ONE_OVER_ROOT_6);
	}
	
	@Test
	public void testOneOverRoot3(){

		double expectedOneOverRoot3 = 0.5773502691896258;
		assertTrue(expectedOneOverRoot3 == Constants.ONE_OVER_ROOT_3);
	}
	
	@Test
	public void testRoot3Over2(){
		
		double expectedRoot3Over2 = 1.224744871391589;
		assertTrue(expectedRoot3Over2 == Constants.ROOT_3_OVER_2);
	}
	
	@Test
	public void test2OverRoot3(){
		
		double expected2OverRoot3 = 1.1547005383792517;
		assertTrue(expected2OverRoot3 == Constants.TWO_OVER_ROOT_3);
	}
	
	@Test
	public void testTwoRoot2Over5(){
		
		double expectedTwoRoot2Over5 = 1.2649110640673518;
		assertTrue(expectedTwoRoot2Over5 == Constants.TWO_ROOT_2_OVER_5);
	}
}