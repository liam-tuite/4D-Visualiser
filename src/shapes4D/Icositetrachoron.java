package shapes4D;

import java.util.ArrayList;

import graphics.Polygon2D;
import graphics.Polygon4D;
import graphics.Vertex;

public class Icositetrachoron extends Polygon4D{
	
	private static final Vertex[] ICOSITETRACHORON = {
		new Vertex(-2, 0, 0, 0),	//0
		new Vertex(2, 0, 0, 0),		//1
		new Vertex(0, -2, 0, 0),	//2
		new Vertex(0, 2, 0, 0),		//3
		new Vertex(0, 0, -2, 0),	//4
		new Vertex(0, 0, 2, 0), 	//5
		new Vertex(0, 0, 0, -2),	//6
		new Vertex(0, 0, 0, 2), 	//7
		new Vertex(-1, -1, -1, -1),	//8
		new Vertex(-1, -1, -1, 1), 	//9
		new Vertex(-1, -1, 1, -1), 	//10
		new Vertex(-1, -1, 1, 1),  	//11
		new Vertex(-1, 1, -1, -1), 	//12
		new Vertex(-1, 1, -1, 1),  	//13
		new Vertex(-1, 1, 1, -1),  	//14
		new Vertex(-1, 1, 1, 1),   	//15
		new Vertex(1, -1, -1, -1), 	//16
		new Vertex(1, -1, -1, 1),  	//17
		new Vertex(1, -1, 1, -1),  	//18
		new Vertex(1, -1, 1, 1),   	//19
		new Vertex(1, 1, -1, -1),  	//20
		new Vertex(1, 1, -1, 1),   	//21
		new Vertex(1, 1, 1, -1),   	//22
		new Vertex(1, 1, 1, 1)     	//23
    };

	public Icositetrachoron(){
		super(ICOSITETRACHORON);
	}
	
	public Icositetrachoron(ArrayList<Vertex> vertices){
		super(vertices);
	}

	@Override
	public Icositetrachoron project(){
		return new Icositetrachoron(getProjectedVertices());
	}

	protected void setFaces(){
		
		faces = new ArrayList<>();

		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(8), vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(8), vertices.get(10)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(8), vertices.get(12)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(9), vertices.get(11)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(9), vertices.get(13)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(10), vertices.get(11)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(10), vertices.get(14)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(11), vertices.get(15)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(12), vertices.get(13)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(12), vertices.get(14)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(13), vertices.get(15)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(0), vertices.get(14), vertices.get(15)}));

		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(16), vertices.get(17)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(16), vertices.get(18)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(16), vertices.get(20)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(17), vertices.get(19)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(17), vertices.get(21)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(18), vertices.get(19)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(18), vertices.get(22)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(19), vertices.get(23)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(20), vertices.get(21)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(20), vertices.get(22)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(21), vertices.get(23)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(1), vertices.get(22), vertices.get(23)}));

		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(8), vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(8), vertices.get(10)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(8), vertices.get(16)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(9), vertices.get(11)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(9), vertices.get(17)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(10), vertices.get(11)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(10), vertices.get(18)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(11), vertices.get(19)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(16), vertices.get(17)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(16), vertices.get(18)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(17), vertices.get(19)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(2), vertices.get(18), vertices.get(19)}));

		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(12), vertices.get(13)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(12), vertices.get(14)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(12), vertices.get(20)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(13), vertices.get(15)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(13), vertices.get(21)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(14), vertices.get(15)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(14), vertices.get(22)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(15), vertices.get(23)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(20), vertices.get(21)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(20), vertices.get(22)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(21), vertices.get(23)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(3), vertices.get(22), vertices.get(23)}));

		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(8), vertices.get(9)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(8), vertices.get(12)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(8), vertices.get(16)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(9), vertices.get(13)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(9), vertices.get(17)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(12), vertices.get(13)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(12), vertices.get(20)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(13), vertices.get(21)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(16), vertices.get(17)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(16), vertices.get(20)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(17), vertices.get(21)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(4), vertices.get(20), vertices.get(21)}));
		
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(10), vertices.get(11)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(10), vertices.get(14)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(10), vertices.get(18)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(11), vertices.get(15)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(11), vertices.get(19)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(14), vertices.get(15)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(14), vertices.get(22)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(15), vertices.get(23)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(18), vertices.get(19)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(18), vertices.get(22)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(19), vertices.get(23)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(5), vertices.get(22), vertices.get(23)}));

		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(8), vertices.get(10)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(8), vertices.get(12)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(8), vertices.get(16)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(10), vertices.get(14)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(10), vertices.get(18)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(12), vertices.get(14)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(12), vertices.get(20)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(14), vertices.get(22)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(16), vertices.get(18)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(16), vertices.get(20)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(18), vertices.get(22)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(6), vertices.get(20), vertices.get(22)}));

		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(9), vertices.get(11)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(9), vertices.get(13)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(9), vertices.get(17)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(11), vertices.get(15)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(11), vertices.get(19)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(13), vertices.get(15)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(13), vertices.get(21)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(15), vertices.get(23)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(17), vertices.get(19)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(17), vertices.get(21)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(19), vertices.get(23)}));
		faces.add(new Polygon2D(new Vertex[]{vertices.get(7), vertices.get(21), vertices.get(23)}));
	}
}