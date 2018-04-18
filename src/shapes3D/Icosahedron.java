package shapes3D;

import java.util.ArrayList;

import graphics.Constants;
import graphics.Polygon2D;
import graphics.Polygon3D;
import graphics.Vertex;

public class Icosahedron extends Polygon3D{
	
	public static final Vertex[] ICOSAHEDRON = { // Specify each original Vertex, before shape is scaled
		new Vertex(0, -.5, -Constants.PHI/2), // 0
		new Vertex(0, -.5, Constants.PHI/2),  // 1
		new Vertex(0, .5, -Constants.PHI/2),  // 2
		new Vertex(0, .5, Constants.PHI/2),   // 3
		new Vertex(-.5, -Constants.PHI/2, 0), // 4
		new Vertex(-.5, Constants.PHI/2, 0),  // 5
		new Vertex(.5, -Constants.PHI/2, 0),  // 6
		new Vertex(.5, Constants.PHI/2, 0),   // 7
		new Vertex(-Constants.PHI/2, 0, -.5), // 8
		new Vertex(-Constants.PHI/2, 0, .5),  // 9
		new Vertex(Constants.PHI/2, 0, -.5),  // 10
		new Vertex(Constants.PHI/2, 0, .5)    // 11
    };
	
	public Icosahedron(){
		super(ICOSAHEDRON);
	}
	
	public Icosahedron(ArrayList<Vertex> vertices){
		super(vertices);
	}
	
	public Icosahedron project(){
		return new Icosahedron(getProjectedVertices());
	}
	
	protected void setFaces(){
		
		faces = new ArrayList<>();

		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(4), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(8), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(6), vertices.get(10)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(10), vertices.get(2)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(8)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(4), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(6), vertices.get(11)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(11), vertices.get(3)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(9), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(10), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(7), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(5), vertices.get(8)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(11), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(7), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(5), vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(8), vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(8), vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(10), vertices.get(11)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(10), vertices.get(11)}));
	}
}