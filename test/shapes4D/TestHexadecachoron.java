package shapes4D;

import static org.junit.Assert.*;

import org.junit.Test;

import graphics.GraphicsPanel;
import graphics.Vertex;

public class TestHexadecachoron{
	
	Hexadecachoron h;

	@Test
	public void testProject(){
		
		@SuppressWarnings("unused")
		GraphicsPanel gp = new GraphicsPanel();
		
		h = new Hexadecachoron();
		h = h.project();
		
		for(Vertex v : h.getVertices()){
			assertFalse(v.getX() < 0 || v.getY() < 0);
		}
	}
}