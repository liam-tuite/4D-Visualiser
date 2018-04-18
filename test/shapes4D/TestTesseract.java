package shapes4D;

import static org.junit.Assert.*;

import org.junit.Test;

import graphics.GraphicsPanel;
import graphics.Vertex;

public class TestTesseract{
	
	Tesseract t;

	@Test
	public void testProject(){
		
		@SuppressWarnings("unused")
		GraphicsPanel gp = new GraphicsPanel();
		
		t = new Tesseract();
		t = t.project();
		
		for(Vertex v : t.getVertices()){
			assertFalse(v.getX() < 0 || v.getY() < 0);
		}
	}
}