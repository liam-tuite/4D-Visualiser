package shapes3D;

import java.util.ArrayList;

import graphics.Polygon2D;
import graphics.Polygon3D;
import graphics.Vertex;

public class Cube extends Polygon3D{
	
	private static final Vertex[] CUBE = {
		new Vertex(-.5, -.5, -.5),
		new Vertex(-.5, -.5, .5),
		new Vertex(-.5, .5, -.5),
		new Vertex(-.5, .5, .5),
		new Vertex(.5, -.5, -.5),
		new Vertex(.5, -.5, .5),
		new Vertex(.5, .5, -.5),
		new Vertex(.5, .5, .5),
	};
	
	public Cube(){
		super(CUBE);
	}
	
	public Cube(ArrayList<Vertex> vertices){
		super(vertices);
	}
	
	public Cube project(){
		return new Cube(getProjectedVertices());
	}
	
	protected void setFaces(){
		
		faces = new ArrayList<>();
		
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(1), vertices.get(3), vertices.get(2)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(3), vertices.get(7), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(5), vertices.get(7), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(1), vertices.get(5), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(7), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(6), vertices.get(4)}));
	}
}