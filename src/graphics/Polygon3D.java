package graphics;

import java.awt.Graphics2D;
import java.util.ArrayList;

public abstract class Polygon3D {
	
	// This method returns this polygon's projection without changing the vertices
	public abstract Polygon3D project();
	// Each polygon's faces are uniquely defined
	protected abstract void setFaces();

	protected ArrayList<Vertex> vertices, originalVertices;
	protected static ArrayList<Polygon2D> faces;
	
	public Polygon3D(Vertex[] vertices){
		
		setVertices(vertices);
		setFaces();
	}
	
	// This is the constructor used only for projected polygons.
	public Polygon3D(ArrayList<Vertex> vertices){
		
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
		return getProjectedVertices3(vertices);
	}
	
	/* 	Calculates and then returns the projection of all vertices from 3D to 2D. The projection of a vertex is calculated in
	 * 	3 stages:
	 * 	1. The vector that is the distance from the viewpoint to the vertex is multiplied by the transformation matrix. This
	 * 	converts the vertex to eye coordinates.
	 * 	2. Next, the vertex is projected onto the viewing plane.
	 * 	3. Finally, the eye-coordinates of the vertex on the viewing plane are converted to screen coordinates, so that they
	 * 	are visible.
	 */
	
	protected static ArrayList<Vertex> getProjectedVertices3(ArrayList<Vertex> vertices){
		
		ArrayList<Vertex> projectedVertices = new ArrayList<>(); // To store the projection of each vertex

		// Transform each vertex from world coordinates to eye coordinates
		for(Vertex v : vertices){
			projectedVertices.add(v.transform3());
		}
		
		for(Vertex v : projectedVertices){

			// Get perspective projection onto viewplane
			Vertex projection = v.perspectiveProjection3();
			v.setX(projection.getX());
			v.setY(projection.getY());

			// Map to screen
			projection = v.mapToScreen();
			v.setX(projection.getX());
			v.setY(projection.getY());
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

			Matrix m = ViewSettings.getRotationMatrix3().multiply(v);

			v.setX(m.getValue(0, 0));
			v.setY(m.getValue(1, 0));
			v.setZ(m.getValue(2, 0));
		}
	}
	
	// 	This sets the value of each vertex of the polygon, while also scaling the vertices (changing the size)
	private void setVertices(Vertex[] vs){
		
		vertices = new ArrayList<>();
		originalVertices = new ArrayList<>();
		double scalar = ViewSettings.getScalar3();

		for(Vertex v : vs){
			vertices.add(new Vertex(v.getX() * scalar, v.getY() * scalar, v.getZ() * scalar));
			originalVertices.add(new Vertex(v.getX(), v.getY(), v.getZ()));
		}
	}
	
	public void updateScale(){
		
		double scalar = ViewSettings.getScalar3();
		
		for(int i = 0; i < vertices.size(); i++){
			
			Vertex v = vertices.get(i);
			Vertex ov = originalVertices.get(i);
			
			v.setX(ov.getX() * scalar);
			v.setY(ov.getY() * scalar);
			v.setZ(ov.getZ() * scalar);
		}
	}
}