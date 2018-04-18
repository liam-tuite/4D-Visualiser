package shapes4D;

import static org.junit.Assert.*;

import org.junit.Test;

import graphics.GraphicsPanel;
import graphics.Vertex;

public class TestPentachoron{
	
	Pentachoron p;

	@Test
	public void testProject(){
		
		@SuppressWarnings("unused")
		GraphicsPanel gp = new GraphicsPanel();
		
		p = new Pentachoron();
		p = p.project();
		
		for(Vertex v : p.getVertices()){
			assertFalse(v.getX() < 0 || v.getY() < 0);
		}
	}
}