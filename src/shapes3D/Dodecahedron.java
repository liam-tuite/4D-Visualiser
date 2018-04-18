package shapes3D;

import java.util.ArrayList;

import graphics.Constants;
import graphics.Polygon2D;
import graphics.Polygon3D;
import graphics.Vertex;

public class Dodecahedron extends Polygon3D{
	
	public static final Vertex[] DODECAHEDRON = { // Specify each original Vertex, before shape is scaled
		new Vertex(-.5, -.5, -.5),  								 // 0
		new Vertex(-.5, -.5, .5),  									 // 1
		new Vertex(-.5, .5, -.5),  									 // 2
		new Vertex(-.5, .5, .5),  									 // 3
		new Vertex(.5, -.5, -.5),  									 // 4
		new Vertex(.5, -.5, .5), 			 						 // 5
		new Vertex(.5, .5, -.5),  									 // 6
        new Vertex(.5, .5, .5),  									 // 7
        new Vertex(0, -Constants.ONE_OVER_PHI/2, -Constants.PHI/2),  // 8
        new Vertex(0, -Constants.ONE_OVER_PHI/2, Constants.PHI/2),   // 9
		new Vertex(0, Constants.ONE_OVER_PHI/2, -Constants.PHI/2),   // 10
		new Vertex(0, Constants.ONE_OVER_PHI/2, Constants.PHI/2),    // 11
		new Vertex(-Constants.ONE_OVER_PHI/2, -Constants.PHI/2, 0),  // 12
		new Vertex(-Constants.ONE_OVER_PHI/2, Constants.PHI/2, 0),   // 13
		new Vertex(Constants.ONE_OVER_PHI/2, -Constants.PHI/2, 0),   // 14
		new Vertex(Constants.ONE_OVER_PHI/2, Constants.PHI/2, 0),    // 15
		new Vertex(-Constants.PHI/2, 0, -Constants.ONE_OVER_PHI/2),  // 16
		new Vertex(-Constants.PHI/2, 0, Constants.ONE_OVER_PHI/2),   // 17
		new Vertex(Constants.PHI/2, 0, -Constants.ONE_OVER_PHI/2),   // 18
		new Vertex(Constants.PHI/2, 0, Constants.ONE_OVER_PHI/2)     // 19
    };
	
	public Dodecahedron(){
		super(DODECAHEDRON);
	}
	
	public Dodecahedron(ArrayList<Vertex> vertices){
		super(vertices);
	}
	
	public Dodecahedron project(){
		return new Dodecahedron(getProjectedVertices());
	}
	
	protected void setFaces(){
		
		faces = new ArrayList<>();

		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(8), vertices.get(4), vertices.get(14),
				vertices.get(12)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(12), vertices.get(1), vertices.get(17),
				vertices.get(16)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(16), vertices.get(2), vertices.get(10),
				vertices.get(8)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(12), vertices.get(14), vertices.get(5),
				vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(9), vertices.get(11), vertices.get(3),
				vertices.get(17)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(16), vertices.get(17), vertices.get(3),
				vertices.get(13)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(13), vertices.get(15), vertices.get(6),
				vertices.get(10)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(11), vertices.get(7), vertices.get(15),
				vertices.get(13)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(8), vertices.get(10), vertices.get(6),
				vertices.get(18)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(18), vertices.get(19), vertices.get(5),
				vertices.get(14)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(19), vertices.get(7), vertices.get(11),
				vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(15), vertices.get(7), vertices.get(19),
				vertices.get(18)}));
	}
}