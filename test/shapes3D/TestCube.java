package shapes3D;

import static org.junit.Assert.*;

import org.junit.Test;

import graphics.GraphicsPanel;
import graphics.Vertex;

public class TestCube {

	Cube c;
	
	@Test
	public void testProject() {
		
		@SuppressWarnings("unused")
		GraphicsPanel gp = new GraphicsPanel();
		
		c = new Cube();
		c = c.project();
		
		for(Vertex v : c.getVertices()){
			assertFalse(v.getX() < 0 || v.getY() < 0);
		}
	}
}