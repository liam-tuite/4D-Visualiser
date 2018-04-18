package shapes3D;

import java.util.ArrayList;

import graphics.Constants;
import graphics.Polygon2D;
import graphics.Polygon3D;
import graphics.Vertex;

public class Tetrahedron extends Polygon3D{
	
	public static final Vertex[] TETRAHEDRON = { // Specify each original Vertex, before shape is scaled
		new Vertex(-1, 0, -Constants.ONE_OVER_ROOT_2),// 0
		new Vertex(1, 0, -Constants.ONE_OVER_ROOT_2), // 1
		new Vertex(0, -1, Constants.ONE_OVER_ROOT_2), // 2
		new Vertex(0, 1, Constants.ONE_OVER_ROOT_2)   // 3
    };
	
	public Tetrahedron(){
		super(TETRAHEDRON);
	}
	
	public Tetrahedron(ArrayList<Vertex> vertices){
		super(vertices);
	}
	
	public Tetrahedron project(){
		return new Tetrahedron(getProjectedVertices());
	}
	
	protected void setFaces(){
		
		faces = new ArrayList<>();
		
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(1), vertices.get(2)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(1), vertices.get(3)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(3)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(2), vertices.get(3)}));
	}
}