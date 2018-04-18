package shapes3D;

import java.util.ArrayList;

import graphics.Polygon2D;
import graphics.Polygon3D;
import graphics.Vertex;

public class Octahedron extends Polygon3D{
	
	public static final Vertex[] OCTAHEDRON = { // Specify each original Vertex, before shape is scaled
		new Vertex(-1, 0, 0), // 0
		new Vertex(1, 0, 0),  // 1
		new Vertex(0, -1, 0), // 2
        new Vertex(0, 1, 0),  // 3
        new Vertex(0, 0, -1), // 4
        new Vertex(0, 0, 1)   // 5
    };
	
	public Octahedron(){
		super(OCTAHEDRON);
	}
	
	public Octahedron(ArrayList<Vertex> vertices){
		super(vertices);
	}
	
	public Octahedron(Vertex[] vs){
		super(vs);
	}
	
	public Octahedron project(){
		return new Octahedron(getProjectedVertices());
	}
	
	protected void setFaces(){
		
		faces = new ArrayList<>();
		
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(3), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(2), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(3), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(2), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(5)}));
	}
}