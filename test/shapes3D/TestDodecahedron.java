package shapes3D;

import static org.junit.Assert.*;

import org.junit.Test;

import graphics.GraphicsPanel;
import graphics.Vertex;

public class TestDodecahedron{

	Dodecahedron d;
	
	@Test
	public void testProject() {
		
		@SuppressWarnings("unused")
		GraphicsPanel gp = new GraphicsPanel();
		
		d = new Dodecahedron();
		d = d.project();
		
		for(Vertex v : d.getVertices()){
			assertFalse(v.getX() < 0 || v.getY() < 0);
		}
	}
}