package shapes3D;

import static org.junit.Assert.*;

import org.junit.Test;

import graphics.GraphicsPanel;
import graphics.Vertex;

public class TestOctahedron{

	Octahedron o;
	
	@Test
	public void testProject() {
		
		@SuppressWarnings("unused")
		GraphicsPanel gp = new GraphicsPanel();
		
		o = new Octahedron();
		o = o.project();
		
		for(Vertex v : o.getVertices()){
			assertFalse(v.getX() < 0 || v.getY() < 0);
		}
	}
}