package shapes4D;

import java.util.ArrayList;

import graphics.Polygon2D;
import graphics.Polygon4D;
import graphics.Vertex;

public class Tesseract extends Polygon4D{
	
	private static final Vertex[] TESSERACT = {
		new Vertex(-1, -1, -1, -1),
		new Vertex(-1, -1, -1, 1),
		new Vertex(-1, -1, 1, -1),
		new Vertex(-1, -1, 1, 1),
		new Vertex(-1, 1, -1, -1),
		new Vertex(-1, 1, -1, 1),
		new Vertex(-1, 1, 1, -1),
		new Vertex(-1, 1, 1, 1),
		new Vertex(1, -1, -1, -1),
		new Vertex(1, -1, -1, 1),
		new Vertex(1, -1, 1, -1),
		new Vertex(1, -1, 1, 1),
		new Vertex(1, 1, -1, -1),
		new Vertex(1, 1, -1, 1),
		new Vertex(1, 1, 1, -1),
		new Vertex(1, 1, 1, 1)
	};

	public Tesseract(){
		super(TESSERACT);
	}
	
	public Tesseract(ArrayList<Vertex> vertices){
		super(vertices);
	}

	@Override
	public Tesseract project(){
		return new Tesseract(getProjectedVertices());
	}
	
	protected void setFaces(){
		
		faces = new ArrayList<>();

		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(1), vertices.get(3), vertices.get(2)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(8), vertices.get(9), vertices.get(1), vertices.get(0)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(10), vertices.get(11), vertices.get(9), vertices.get(8)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(3), vertices.get(11), vertices.get(10)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(5), vertices.get(7), vertices.get(6)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(12), vertices.get(13), vertices.get(5), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(14), vertices.get(15), vertices.get(13), vertices.get(12)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(7), vertices.get(15), vertices.get(14)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(5), vertices.get(1), vertices.get(0)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(7), vertices.get(3), vertices.get(2)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(12), vertices.get(13), vertices.get(9), vertices.get(8)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(14), vertices.get(15), vertices.get(11), vertices.get(10)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(6), vertices.get(14), vertices.get(12)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(10), vertices.get(8)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(12), vertices.get(8), vertices.get(0)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(12), vertices.get(14), vertices.get(10), vertices.get(8)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(14), vertices.get(6), vertices.get(2), vertices.get(10)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(4), vertices.get(0), vertices.get(2)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(7), vertices.get(15), vertices.get(13)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(11), vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(13), vertices.get(9), vertices.get(1)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(13), vertices.get(15), vertices.get(11), vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(15), vertices.get(7), vertices.get(3), vertices.get(11)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(5), vertices.get(1), vertices.get(3)}));
	}
}