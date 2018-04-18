package graphics;

import java.awt.Graphics2D;
import java.util.ArrayList;

public abstract class Polygon4D{

	// This method returns this polygon's projection without changing the vertices
	public abstract Polygon4D project();
	// Each polygon's faces are uniquely defined
	protected abstract void setFaces();
	
	protected ArrayList<Vertex> vertices, originalVertices;
	protected static ArrayList<Polygon2D> faces;
	
	public Polygon4D(Vertex[] vertices){
		
		setVertices(vertices);
		setFaces();
	}
	
	// This is the constructor used only for projected polygons
	public Polygon4D(ArrayList<Vertex> vertices){
		
		this.vertices = vertices;
		setFaces();
	}
	
	// Draws each of the polygon's faces on screen.
	public void draw(Graphics2D graphics){
		
		for(Polygon2D face : faces){
			face.draw(graphics);
		}
	}
	
	protected ArrayList<Vertex> getProjectedVertices(){
		return Polygon3D.getProjectedVertices3(getProjectedVertices4());
	}
	
	/* 	Calculates and then returns the projection of all vertices from 4D to 3D. The projection of a vertex is calculated
	 * 	in 3 stages:
	 * 	1. The vector that is the distance from the viewpoint to the vertex is multiplied by the 4D transformation matrix.
	 * 	This converts the vertex from world to eye coordinates.
	 * 	2. Next, the vertex is projected onto a 3D region (removing the w coordinate)
	 * 	3. Finally, the eye-coordinates of the vertex in the 3D region are mapped onto a 3D viewbox, with parameters
	 * 	specified in ViewSettings.
	 */
	private ArrayList<Vertex> getProjectedVertices4(){
		
		ArrayList<Vertex> projectedVertices = new ArrayList<>(); // To store the projection of each vertex
		
		// Transform each vertex from world coordinates to eye coordinates
		for(Vertex v : vertices){
			projectedVertices.add(v.transform4());
		}
		
		for(Vertex v : projectedVertices){

			// Get perspective projection onto 3D region
			Vertex projection = v.perspectiveProjection4();
			v.setX(projection.getX());
			v.setY(projection.getY());
			v.setZ(projection.getZ());
			
			// Map to viewbox
			projection = v.mapToViewbox();
			v.setX(projection.getX());
			v.setY(projection.getY());
			v.setZ(projection.getZ());
		}
		
		return projectedVertices;
	}
	
	// Used for testing
	public ArrayList<Vertex> getVertices(){
		return vertices;
	}
	
	// Multiplies each vertex by the rotation matrix
	public void rotate(){
		
		for(Vertex v : vertices){

			Matrix m = ViewSettings.getRotationMatrix4().multiply(v);

			v.setX(m.getValue(0, 0));
			v.setY(m.getValue(1, 0));
			v.setZ(m.getValue(2, 0));
			v.setW(m.getValue(3, 0));
		}
	}
	
	// 	This sets the value of each vertex of the polygon with given Vertex array/
	// 	Also scales the vertices (changing the size)
	private void setVertices(Vertex[] vs){
		
		vertices = new ArrayList<>();
		originalVertices = new ArrayList<>();
		double scalar = ViewSettings.getScalar4();

		for(Vertex v : vs){
			vertices.add(new Vertex(v.getX() * scalar, v.getY() * scalar, v.getZ() * scalar, v.getW() * scalar));
			originalVertices.add(new Vertex(v.getX(), v.getY(), v.getZ(), v.getW()));
		}
	}
	
	public void updateScale(){

		double scalar = ViewSettings.getScalar3();
		
		for(int i = 0; i < vertices.size(); i++){
			
			Vertex v = vertices.get(i);
			Vertex ov = originalVertices.get(i);
			
			v.setW(ov.getW() * scalar);
			v.setX(ov.getX() * scalar);
			v.setY(ov.getY() * scalar);
			v.setZ(ov.getZ() * scalar);
		}
	}
}