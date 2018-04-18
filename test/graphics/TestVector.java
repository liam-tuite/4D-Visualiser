package graphics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVector {
	
	Vector actualVector, expectedVector;

	@Test
	public void testVector(){
		
		// test #1
		actualVector = new Vector(1, 2, 3);
		assertTrue(actualVector.equals(new Vector(1, 2, 3, 0)));
		
		// test #2
		actualVector = new Vector(0.3, -4, 1.0, 1);
		assertTrue(actualVector.equals(new Vector(0.3, -4, 1, 1)));
		
		// test #3
		actualVector = new Vector(0, 0, 0, 0);
		assertTrue(actualVector.equals(new Vector(0, 0, 0, 0)));
	}
	
	@Test
	public void testCrossProduct3(){
		
		// test #1
		expectedVector = new Vector(-3, 6, -3);
		actualVector = new Vector(1, 2, 3).crossProduct(new Vector(4, 5, 6));
		
		assertTrue(expectedVector.equals(actualVector));
		
		// test #2
		expectedVector = new Vector(0, 0, 0);
		actualVector = new Vector(5, 4, 9).crossProduct(new Vector(5, 4, 9));
		
		assertTrue(expectedVector.equals(actualVector));
		
		// test #3
		expectedVector = new Vector(12, -48, -24);
		actualVector = new Vector(-2, 4, -9).crossProduct(new Vector(6, 0, 3));
		
		assertTrue(expectedVector.equals(actualVector));
	}
	
	@Test
	public void testCrossProduct4(){
		
		// test #1
		expectedVector = new Vector(0, 0, 0, 0);
		actualVector = new Vector(1, 2, 3, 4).crossProduct(new Vector(-1, -2, -3, -4),
				new Vector(0, 1, -2, 3));
		
		assertTrue(expectedVector.equals(actualVector));
		
		// test #2
		expectedVector = new Vector(-3.79787402868E10, 5.999999968666668E9,
				3.716995700000064E7, -1.9570785161766663E10);
		actualVector = new Vector(-0.5, 10, -19, 4).crossProduct(new Vector(1, -0.2, 1, -2),
				new Vector(0.8333333, 12389991, -1999999999, 0.0000000000000001));
		
		assertTrue(expectedVector.equals(actualVector));
		
		// test #3
		expectedVector = new Vector(19618.0, 3062.846, -87660.538, 64979.691999999995);
		actualVector = new Vector(-2, -2, -2, -2).crossProduct(new Vector(2, 1, -1, -2),
				new Vector(0.577, 10958, 383));
		
		assertTrue(expectedVector.equals(actualVector));
	}

	@Test
	public void testMultiply(){
		
		Matrix m, actualMatrix, expectedMatrix;
		Vector v;

		// test #1
		v = new Vector(1, 2, 3);
		m = new Matrix(new double[][]{
			new double[]{10},
			new double[]{5},
			new double[]{6}
		});
		expectedMatrix = new Matrix(new double[][]{
			new double[]{38}
		});
		actualMatrix = v.multiply(m);
		
		assertTrue(actualMatrix.equals(expectedMatrix));
		
		// test #2
		v = new Vector(-1, 4, 0, 2);
		m = new Matrix(new double[][]{
			new double[]{2},
			new double[]{-2},
			new double[]{2},
			new double[]{-2},
		});
		expectedMatrix = new Matrix(new double[][]{
			new double[]{-14}
		});
		actualMatrix = v.multiply(m);
		
		assertTrue(actualMatrix.equals(expectedMatrix));
		
		// test #3
		v = new Vector(-1, 1.1, 2, -9.3);
		m = new Matrix(new double[][]{
			new double[]{-1},
			new double[]{0},
			new double[]{0.53333},
			new double[]{1.467}
		});
		expectedMatrix = new Matrix(new double[][]{
			new double[]{-11.576440000000002},
		});
		actualMatrix = v.multiply(m);
		
		assertTrue(actualMatrix.equals(expectedMatrix));
	}
	
	@Test
	public void testNorm(){
		
		// test #1
		actualVector = new Vector(1, 2, 3);
		
		assertTrue(actualVector.norm() == 3.7416573867739413);
		
		// test #2
		actualVector = new Vector(0, 0, 0);
		
		assertTrue(actualVector.norm() == 0);
		
		// test #3
		actualVector = new Vector(-4, 5, -6);
		
		assertTrue(actualVector.norm() == 8.774964387392123);
	}
	
	@Test
	public void testScale(){
		
		// test #1
		expectedVector = new Vector(2, 4, 6);
		
		actualVector = new Vector(1, 2, 3).scale(2);
		
		assertTrue(actualVector.equals(expectedVector));
		
		// test #2
		expectedVector = new Vector(1, 2, 3);
		
		actualVector = new Vector(2, 4, 6).scale(1.0 / 2);
		
		assertTrue(actualVector.equals(expectedVector));
		
		// test #3
		expectedVector = new Vector(0, 0, 0);
		
		actualVector = new Vector(1, 0, -199).scale(0);
		
		assertTrue(actualVector.equals(expectedVector));
	}
}