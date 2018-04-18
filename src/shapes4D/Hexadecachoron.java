package shapes4D;

import java.util.ArrayList;

import graphics.Polygon2D;
import graphics.Polygon4D;
import graphics.Vertex;

public class Hexadecachoron extends Polygon4D{
	
	private static final Vertex[] HEXADECACHORON = {
		new Vertex(-1, 0, 0, 0),
		new Vertex(1, 0, 0, 0),
		new Vertex(0, -1, 0, 0),
		new Vertex(0, 1, 0, 0),
		new Vertex(0, 0, -1, 0),
		new Vertex(0, 0, 1, 0),
		new Vertex(0, 0, 0, -1),
		new Vertex(0, 0, 0, 1),
    };

	public Hexadecachoron(){
		super(HEXADECACHORON);
	}
	
	public Hexadecachoron(ArrayList<Vertex> vertices){
		super(vertices);
	}

	@Override
	public Hexadecachoron project(){
		return new Hexadecachoron(getProjectedVertices());
	}
	
	protected void setFaces(){
		
		faces = new ArrayList<>();

		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(3), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(3), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(3), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(3), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(4), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(4), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(5), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(5), vertices.get(7)}));
		
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(2), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(2), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(2), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(2), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(5)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(4), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(4), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(5), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(5), vertices.get(7)}));
		
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(4), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(4), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(5), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(5), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(4), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(4), vertices.get(7)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(5), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(5), vertices.get(7)}));
	}
}