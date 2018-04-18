package graphics;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestMatrix {
	
	Matrix actualMatrix, expectedMatrix;

	@Test
	// Test both constructors
	public void testMatrix() {

		// test #1
		actualMatrix = new Matrix(3, 2);
		
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0, 0},
			new double[]{0, 0},
			new double[]{0, 0}
		});
		
		assertTrue(actualMatrix.equals(expectedMatrix));

		// test #2
		actualMatrix = new Matrix(3, 3);
		
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0, 0, 0},
			new double[]{0, 0, 0},
			new double[]{0, 0, 0}
		});
		
		assertTrue(actualMatrix.equals(expectedMatrix));

		// test #3
		actualMatrix = new Matrix(4, 5);

		expectedMatrix = new Matrix(new double[][]{
			new double[]{0, 0, 0, 0, 0},
			new double[]{0, 0, 0, 0, 0},
			new double[]{0, 0, 0, 0, 0},
			new double[]{0, 0, 0, 0, 0}
		});
		
		assertTrue(actualMatrix.equals(expectedMatrix));
	}
	
	@Test
	public void testAdd(){

		// test #1
		actualMatrix = new Matrix(3, 2);
		actualMatrix.add(1);
		
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1, 0},
			new double[]{0, 0},
			new double[]{0, 0}
		});
		
		assertTrue(actualMatrix.equals(expectedMatrix));

		// test #2
		actualMatrix = new Matrix(2, 2);
		actualMatrix.add(0);
		actualMatrix.add(2);
		actualMatrix.add(4);

		expectedMatrix = new Matrix(new double[][]{
			new double[]{0, 2},
			new double[]{4, 0}
		});
		
		assertTrue(actualMatrix.equals(expectedMatrix));
	}
	
	// Test that an exception is thrown when going beyond Matrix dimensions
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testAddIndexOutOfBounds(){
		
		actualMatrix = new Matrix(1, 2);
		actualMatrix.add(1);
		actualMatrix.add(2);
		actualMatrix.add(0);
	}
	
	@Test
	public void testDotProduct(){
		
		// test #1
		double[] d1 = new double[]{1, 2, 3};
		double[] d2 = new double[]{4, -5, 6};
		
		double actualDotProduct = Matrix.dotProduct(d1, d2);
		double expectedDotProduct = 12;
		
		assertTrue(actualDotProduct == expectedDotProduct);
		
		// test #2
		d1 = new double[]{-4, -9};
		d2 = new double[]{-1, 2};
		
		actualDotProduct = Matrix.dotProduct(d1, d2);
		expectedDotProduct = -14;
		
		assertTrue(actualDotProduct == expectedDotProduct);
		
		// test #3
		d1 = new double[]{6, -1, 3};
		d2 = new double[]{4, 18, -2};
		
		actualDotProduct = Matrix.dotProduct(d1, d2);
		expectedDotProduct = 0;
		
		assertTrue(actualDotProduct == expectedDotProduct);
	}
	
	@Test
	public void testGetColumn(){
		
		// test #1
		Matrix m = new Matrix(new double[][]{
			new double[]{1, 4},
			new double[]{2, 5},
			new double[]{3, 6}
		});
		
		double[] actualColumn = m.getColumn(0);
		double[] expectedColumn = new double[]{1, 2, 3};
		
		assertTrue(Arrays.equals(actualColumn, expectedColumn));
		
		// test #2
		actualColumn = m.getColumn(1);
		expectedColumn = new double[]{4, 5, 6};
		
		assertTrue(Arrays.equals(actualColumn, expectedColumn));
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testGetColumnIndexOutOfBounds(){
		
		Matrix m = new Matrix(new double[][]{
			new double[]{1, 0, 2}
		});
		m.getColumn(3);
	}
	
	@Test
	public void testGetValue(){
		
		Matrix m = new Matrix(new double[][]{
			new double[]{1, 2, 3},
			new double[]{4, 5, 6},
			new double[]{7, -8, 9}
		});
		
		// test #1
		double actualValue = m.getValue(0, 0);
		double expectedValue = 1;
		
		assertTrue(actualValue == expectedValue);
		
		// test #2
		actualValue = m.getValue(1,  2);
		expectedValue = 6;
		
		assertTrue(actualValue == expectedValue);
		
		// test #3
		actualValue = m.getValue(2, 1);
		expectedValue = -8;
		
		assertTrue(actualValue == expectedValue);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testGetValueIndexOutOfBounds(){
		
		Matrix m = new Matrix(new double[][]{
			new double[]{1, 2, 3}
		});
		m.getValue(1, 0);
	}
	
	@Test
	public void testMultiplyM(){
		
		Matrix m1 = new Matrix(new double[][]{
			new double[]{1, 2, 3},
			new double[]{4, 5, 6}
		});
		
		Matrix m2 = new Matrix(new double[][]{
			new double[]{7, 10},
			new double[]{8, 11},
			new double[]{9, 12}
		});
		
		// test #1
		actualMatrix = m1.multiply(m2);
		
		expectedMatrix = new Matrix(new double[][]{
			new double[]{50, 68},
			new double[]{122, 167}
		});
		
		assertTrue(actualMatrix.equals(expectedMatrix));
		
		// test #2
		actualMatrix = m2.multiply(m1);
		
		expectedMatrix = new Matrix(new double[][]{
			new double[]{47, 64, 81},
			new double[]{52, 71, 90},
			new double[]{57, 78, 99}
		});
		
		assertTrue(actualMatrix.equals(expectedMatrix));
		
		// test #3
		m1 = new Matrix(new double[][]{
			new double[]{-5, 4, -3, 2, 1},
			new double[]{-1, 2, 3, -4, 0}
		});
		
		m2 = new Matrix(new double[][]{
			new double[]{-2},
			new double[]{4},
			new double[]{18},
			new double[]{-12},
			new double[]{0}
		});
		
		actualMatrix = m1.multiply(m2);
		
		expectedMatrix = new Matrix(new double[][]{
			new double[]{-52},
			new double[]{112}
		});
		
		assertTrue(actualMatrix.equals(expectedMatrix));
	}
	
	@Test
	public void testMultiplyV(){
		
		Matrix m;
		Vertex v;

		// test #1
		m = new Matrix(new double[][]{
			new double[]{10, 5, 6, 1}
		});
		v = new Vertex(1, 2, 3);
		
		expectedMatrix = new Matrix(new double[][]{
			new double[]{38}
		});
		actualMatrix = m.multiply(v);
		
		assertTrue(actualMatrix.equals(expectedMatrix));
		
		// test #2
		m = new Matrix(new double[][]{
			new double[]{2, 2, 2, 2},
			new double[]{2, 2, 2, -2},
			new double[]{2, 2, -2, 2},
			new double[]{2, 2, -2, -2},
			new double[]{2, -2, 2, 2}
		});
		v = new Vertex(-1, 4, 0, 2);
		
		expectedMatrix = new Matrix(new double[][]{
			new double[]{10},
			new double[]{2},
			new double[]{10},
			new double[]{2},
			new double[]{-6}
		});
		actualMatrix = m.multiply(v);
		
		assertTrue(actualMatrix.equals(expectedMatrix));
		
		// test #3
		m = new Matrix(new double[][]{
			new double[]{-1, 2, -3, 4},
			new double[]{0, 1, 0, 1},
			new double[]{0.53333, 1.467, -2.9892, 0.00000001},
		});
		v = new Vertex(-1, 1.1, 2, -9.3);
		
		expectedMatrix = new Matrix(new double[][]{
			new double[]{-40},
			new double[]{-8.200000000000001},
			new double[]{-4.898030092999999}
		});
		actualMatrix = m.multiply(v);
		
		assertTrue(actualMatrix.equals(expectedMatrix));
	}
}