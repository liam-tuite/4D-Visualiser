package shapes4D;

import java.util.ArrayList;

import graphics.Constants;
import graphics.Polygon2D;
import graphics.Polygon4D;
import graphics.Vertex;

public class Pentachoron extends Polygon4D{
	
	private static final Vertex[] PENTACHORON = {
		new Vertex(Constants.ONE_OVER_ROOT_10, Constants.ONE_OVER_ROOT_6, Constants.ONE_OVER_ROOT_3, -1),
		new Vertex(Constants.ONE_OVER_ROOT_10, Constants.ONE_OVER_ROOT_6, Constants.ONE_OVER_ROOT_3, 1),
		new Vertex(Constants.ONE_OVER_ROOT_10, Constants.ONE_OVER_ROOT_6, -Constants.TWO_OVER_ROOT_3, 0),
		new Vertex(Constants.ONE_OVER_ROOT_10, -Constants.ROOT_3_OVER_2, 0, 0),
		new Vertex(-Constants.TWO_ROOT_2_OVER_5, 0, 0, 0)
    };

	public Pentachoron(){
		super(PENTACHORON);
	}
	
	public Pentachoron(ArrayList<Vertex> vertices){
		super(vertices);
	}

	@Override
	public Pentachoron project(){
		return new Pentachoron(getProjectedVertices());
	}
	
	protected void setFaces(){
		
		faces = new ArrayList<>();

		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(1), vertices.get(2)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(1), vertices.get(3)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(1), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(3)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(2), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(2), vertices.get(3)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(2), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(3), vertices.get(4)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(3), vertices.get(4)}));
	}
}