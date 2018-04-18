package shapes4D;

import static org.junit.Assert.*;

import org.junit.Test;

import graphics.GraphicsPanel;
import graphics.Vertex;

public class TestIcositetrachoron{
	
	Icositetrachoron i;

	@Test
	public void testProject(){
		
		@SuppressWarnings("unused")
		GraphicsPanel gp = new GraphicsPanel();
		
		i = new Icositetrachoron();
		i = i.project();
		
		for(Vertex v : i.getVertices()){
			assertFalse(v.getX() < 0 || v.getY() < 0);
		}
	}
}