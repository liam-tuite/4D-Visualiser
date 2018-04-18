package graphics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVertex {
	
	Vertex actualVertex, expectedVertex;

	@Test
	public void testVertex(){
		
		// test #1
		actualVertex = new Vertex(1, 2, 3);
		assertTrue(actualVertex.equals(new Vertex(1, 2, 3, 0)));
		
		// test #2
		actualVertex = new Vertex(0.3, -4, 1.0, 2);
		assertTrue(actualVertex.equals(new Vertex(0.3, -4, 1, 2)));
		
		// test #3
		actualVertex = new Vertex(0, 0, 0);
		assertTrue(actualVertex.equals(new Vertex(0, 0, 0, 0)));
	}
	
	@Test
	public void testSubtract(){
		
		Vector actualVector, expectedVector;

		// test #1
		expectedVector = new Vector(3, 3, 3);
		actualVector = new Vertex(4, 5, 6).subtract(new Vertex(1, 2, 3));
		assertTrue(actualVector.equals(expectedVector));

		// test #2
		expectedVector = new Vector(0, 0, 0);
		actualVector = new Vertex(1, 2, 3).subtract(new Vertex(1, 2, 3));
		assertTrue(actualVector.equals(expectedVector));

		// test #3
		expectedVector = new Vector(17, -4, 0);
		actualVector = new Vertex(4, 5, 6).subtract(new Vertex(-13, 9, 6));
		assertTrue(actualVector.equals(expectedVector));
	}
}