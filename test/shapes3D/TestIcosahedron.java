package shapes3D;

import static org.junit.Assert.*;

import org.junit.Test;

import graphics.GraphicsPanel;
import graphics.Vertex;

public class TestIcosahedron{

	Icosahedron i;
	
	@Test
	public void testProject() {
		
		@SuppressWarnings("unused")
		GraphicsPanel gp = new GraphicsPanel();
		
		i = new Icosahedron();
		i = i.project();
		
		for(Vertex v : i.getVertices()){
			assertFalse(v.getX() < 0 || v.getY() < 0);
		}
	}
}