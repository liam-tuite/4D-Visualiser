package graphics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMatrices {
	
	private double theta;
	private Matrix expectedMatrix;
	
	@Test
	public void testAnticlockwiseRotationX(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1, 0, 0},
			new double[]{0, 0.5253219888177297, -0.8509035245341184},
			new double[]{0, 0.8509035245341184, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationX(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1, 0, 0},
			new double[]{0, 0.9999998629221515, -5.235987760754008E-4},
			new double[]{0, 5.235987760754008E-4, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationX(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1, 0, 0},
			new double[]{0, 0.5403023058681398, -0.8414709848078965},
			new double[]{0, 0.8414709848078965, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationX(theta)));
	}
	
	@Test
	public void testAnticlockwiseRotationY(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, 0, 0.8509035245341184},
			new double[]{0, 1, 0},
			new double[]{-0.8509035245341184, 0, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationY(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, 0, 5.235987760754008E-4},
			new double[]{0, 1, 0},
			new double[]{-5.235987760754008E-4, 0, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationY(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, 0, 0.8414709848078965},
			new double[]{0, 1, 0},
			new double[]{-0.8414709848078965, 0, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationY(theta)));
	}
	
	@Test
	public void testAnticlockwiseRotationZ(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, -0.8509035245341184, 0},
			new double[]{0.8509035245341184, 0.5253219888177297, 0},
			new double[]{0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationZ(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, -5.235987760754008E-4, 0},
			new double[]{5.235987760754008E-4, 0.9999998629221515, 0},
			new double[]{0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationZ(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, -0.8414709848078965, 0},
			new double[]{0.8414709848078965, 0.5403023058681398, 0},
			new double[]{0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationZ(theta)));
	}
	
	@Test
	public void testClockwiseXRotation(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1, 0, 0},
			new double[]{0, 0.5253219888177297, 0.8509035245341184},
			new double[]{0, -0.8509035245341184, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationX(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1, 0, 0},
			new double[]{0, 0.9999998629221515, 5.235987760754008E-4},
			new double[]{0, -5.235987760754008E-4, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationX(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1, 0, 0},
			new double[]{0, 0.5403023058681398, 0.8414709848078965},
			new double[]{0, -0.8414709848078965, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationX(theta)));
	}
	
	@Test
	public void testClockwiseYRotation(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, 0, -0.8509035245341184},
			new double[]{0, 1, 0},
			new double[]{0.8509035245341184, 0, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationY(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, 0, -5.235987760754008E-4},
			new double[]{0, 1, 0},
			new double[]{5.235987760754008E-4, 0, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationY(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, 0, -0.8414709848078965},
			new double[]{0, 1, 0},
			new double[]{0.8414709848078965, 0, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationY(theta)));
	}
	
	@Test
	public void testClockwiseZRotation(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, 0.8509035245341184, 0},
			new double[]{-0.8509035245341184, 0.5253219888177297, 0},
			new double[]{0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationZ(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, 5.235987760754008E-4, 0},
			new double[]{-5.235987760754008E-4, 0.9999998629221515, 0},
			new double[]{0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationZ(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, 0.8414709848078965, 0},
			new double[]{-0.8414709848078965, 0.5403023058681398, 0},
			new double[]{0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationZ(theta)));
	}
	
	@Test
	public void testClockwiseRotationXW(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, 0.0, 0.0, 0.8509035245341184},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{-0.8509035245341184, 0.0, 0.0, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationXW(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, 0.0, 0.0, 5.235987760754008E-4},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{-5.235987760754008E-4, 0.0, 0.0, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationXW(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, 0.0, 0.0, 0.8414709848078965},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{-0.8414709848078965, 0.0, 0.0, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationXW(theta)));
	}
	
	@Test
	public void testClockwiseRotationXY(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, 0.8509035245341184, 0, 0},
			new double[]{-0.8509035245341184, 0.5253219888177297, 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{0, 0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationXY(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, 5.235987760754008E-4, 0, 0},
			new double[]{-5.235987760754008E-4, 0.9999998629221515, 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{0, 0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationXY(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, 0.8414709848078965, 0, 0},
			new double[]{-0.8414709848078965, 0.5403023058681398, 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{0, 0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationXY(theta)));
	}
	
	@Test
	public void testClockwiseRotationYW(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.5253219888177297, 0.0, -0.8509035245341184},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{0.0, 0.8509035245341184, 0.0, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationYW(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.9999998629221515, 0.0, -5.235987760754008E-4},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{0.0, 5.235987760754008E-4, 0.0, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationYW(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.5403023058681398, 0.0, -0.8414709848078965},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{0.0, 0.8414709848078965, 0.0, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationYW(theta)));
	}
	
	@Test
	public void testClockwiseRotationYZ(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.5253219888177297, 0.8509035245341184, 0.0},
			new double[]{0.0, -0.8509035245341184, 0.5253219888177297, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationYZ(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.9999998629221515, 5.235987760754008E-4, 0.0},
			new double[]{0.0, -5.235987760754008E-4, 0.9999998629221515, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationYZ(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.5403023058681398, 0.8414709848078965, 0.0},
			new double[]{0.0, -0.8414709848078965, 0.5403023058681398, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationYZ(theta)));
	}
	
	@Test
	public void testClockwiseRotationZW(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 0.5253219888177297, -0.8509035245341184},
			new double[]{0.0, 0.0, 0.8509035245341184, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationZW(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 0.9999998629221515, -5.235987760754008E-4},
			new double[]{0.0, 0.0, 5.235987760754008E-4, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationZW(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 0.5403023058681398, -0.8414709848078965},
			new double[]{0.0, 0.0, 0.8414709848078965, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationZW(theta)));
	}
	
	@Test
	public void testClockwiseRotationZX(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, 0.0, -0.8509035245341184, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.8509035245341184, 0.0, 0.5253219888177297, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationZX(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, 0.0, -5.235987760754008E-4, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{5.235987760754008E-4, 0.0, 0.9999998629221515, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationZX(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, 0.0, -0.8414709848078965, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.8414709848078965, 0.0, 0.5403023058681398, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.clockwiseRotationZX(theta)));
	}
	
	@Test
	public void testAntianticlockwiseRotationXW(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, 0.0, 0.0, -0.8509035245341184},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{0.8509035245341184, 0.0, 0.0, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationXW(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, 0.0, 0.0, -5.235987760754008E-4},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{5.235987760754008E-4, 0.0, 0.0, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationXW(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, 0.0, 0.0, -0.8414709848078965},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{0.8414709848078965, 0.0, 0.0, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationXW(theta)));
	}
	
	@Test
	public void testAntianticlockwiseRotationXY(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, -0.8509035245341184, 0, 0},
			new double[]{0.8509035245341184, 0.5253219888177297, 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{0, 0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationXY(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, -5.235987760754008E-4, 0, 0},
			new double[]{5.235987760754008E-4, 0.9999998629221515, 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{0, 0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationXY(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, -0.8414709848078965, 0, 0},
			new double[]{0.8414709848078965, 0.5403023058681398, 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{0, 0, 0, 1}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationXY(theta)));
	}
	
	@Test
	public void testAntianticlockwiseRotationYW(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.5253219888177297, 0.0, 0.8509035245341184},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{0.0, -0.8509035245341184, 0.0, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationYW(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.9999998629221515, 0.0, 5.235987760754008E-4},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{0.0, -5.235987760754008E-4, 0.0, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationYW(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.5403023058681398, 0.0, 0.8414709848078965},
			new double[]{0.0, 0.0, 1.0, 0.0},
			new double[]{0.0, -0.8414709848078965, 0.0, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationYW(theta)));
	}
	
	@Test
	public void testAntianticlockwiseRotationYZ(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.5253219888177297, -0.8509035245341184, 0.0},
			new double[]{0.0, 0.8509035245341184, 0.5253219888177297, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationYZ(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.9999998629221515, -5.235987760754008E-4, 0.0},
			new double[]{0.0, 5.235987760754008E-4, 0.9999998629221515, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationYZ(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 0.5403023058681398, -0.8414709848078965, 0.0},
			new double[]{0.0, 0.8414709848078965, 0.5403023058681398, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationYZ(theta)));
	}
	
	@Test
	public void testAntianticlockwiseRotationZW(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 0.5253219888177297, 0.8509035245341184},
			new double[]{0.0, 0.0, -0.8509035245341184, 0.5253219888177297}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationZW(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 0.9999998629221515, 5.235987760754008E-4},
			new double[]{0.0, 0.0, -5.235987760754008E-4, 0.9999998629221515}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationZW(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{1.0, 0.0, 0.0, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{0.0, 0.0, 0.5403023058681398, 0.8414709848078965},
			new double[]{0.0, 0.0, -0.8414709848078965, 0.5403023058681398}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationZW(theta)));
	}
	
	@Test
	public void testAntianticlockwiseRotationZX(){

		// test #1
		theta = 45;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5253219888177297, 0.0, 0.8509035245341184, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{-0.8509035245341184, 0.0, 0.5253219888177297, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationZX(theta)));

		// test #2
		theta = 0.0005235988;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.9999998629221515, 0.0, 5.235987760754008E-4, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{-5.235987760754008E-4, 0.0, 0.9999998629221515, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationZX(theta)));

		// test #3
		theta = 1;
		expectedMatrix = new Matrix(new double[][]{
			new double[]{0.5403023058681398, 0.0, 0.8414709848078965, 0.0},
			new double[]{0.0, 1.0, 0.0, 0.0},
			new double[]{-0.8414709848078965, 0.0, 0.5403023058681398, 0.0},
			new double[]{0.0, 0.0, 0.0, 1.0}
		});
		assertTrue(expectedMatrix.equals(Matrices.anticlockwiseRotationZX(theta)));
	}
}