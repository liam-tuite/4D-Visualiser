package graphics;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class Polygon2D{
	
	private ArrayList<Vertex> vertices;

	public Polygon2D(Vertex[] vs){
		initVertices(vs);
	}
	
	private void initVertices(Vertex[] vs){
		
		vertices = new ArrayList<>();
		
		for(Vertex v : vs){
			vertices.add(new Vertex(v.getX(), v.getY()));
		}
	}
	
	// Draws the polygon on screen by connecting all vertices
	public void draw(Graphics2D graphics){
		
		for(int i = 0; i < vertices.size() - 1; i++){
			drawLine(graphics, vertices.get(i), vertices.get(i + 1));
		}
		
		// Join the first and last vertices
		drawLine(graphics, vertices.get(0), vertices.get(vertices.size() - 1));
	}
	
	// Used to join two vertices with a line
	private void drawLine(Graphics2D graphics, Vertex v1, Vertex v2){
		graphics.draw(new Line2D.Double(v1.getX(), v1.getY(), v2.getX(), v2.getY()));
	}
}