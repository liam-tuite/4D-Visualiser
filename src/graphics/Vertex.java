package graphics;

public class Vertex{
	
	private double x, y, z, w;
	
	// Constructor for 2D vertex
	public Vertex(double x, double y){
		
		this.x = x;
		this.y = y;
		this.z = 0;
		this.w = 0;
	}
	
	// Constructor for 3D vertex
	public Vertex(double x, double y, double z){
		
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = 0;
	}

	// Constructor for 4D vertex
	public Vertex(double x, double y, double z, double w){

		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	// Copy Vertex  v
	public Vertex(Vertex v){

		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		this.w = v.w;
	}
	
	// Returns true if this vertex is identical to vertex  v  (used for testing)
	public boolean equals(Vertex v){
		return (this.x == v.x && this.y == v.y && this.z == v.z && this.w == v.w);
	}
	
	// Returns the 3D vertex converted to 2D screen coordinates
	public Vertex mapToScreen(){
		
		double half_length = ViewSettings.VIEW_LENGTH / 2;
		
		double mX = ViewSettings.VIEW_CENTRE + (half_length * x);
		double mY = ViewSettings.VIEW_CENTRE + (half_length * y);
		
		return new Vertex(mX, mY, 0);
	}
	
	// Projects the 4D vertex onto a 3D "viewbox"
	public Vertex mapToViewbox(){
		
		// If the viewbox is a cube of unit length 2, this step is unnecessary
		if(ViewSettings.VIEWBOX_CENTRE.equals(new Vertex(0, 0, 0)) && ViewSettings.VIEWBOX_LENGTH == 2){
			return this;
		}
		else{
			double half_length = ViewSettings.VIEWBOX_LENGTH / 2;
			
			double mX = ViewSettings.VIEWBOX_CENTRE.getX() + (half_length * x);
			double mY = ViewSettings.VIEWBOX_CENTRE.getY() + (half_length * y);
			double mZ = ViewSettings.VIEWBOX_CENTRE.getZ() + (half_length * z);
			
			return new Vertex(mX, mY, mZ);
		}
	}
	
	// Returns the 3D vertex projected onto the 2D viewplane
	public Vertex perspectiveProjection3(){
		
		double t = Math.tan(ViewSettings.VIEWING_ANGLE3 / 2);
		
		double pX = x / (z * t);
		double pY = y / (z * t);
		
		return new Vertex(pX, pY, 0);
	}
	
	// Returns the 4D vertex projected onto the 3D region
	public Vertex perspectiveProjection4(){
		
		double t = Math.tan(ViewSettings.VIEWING_ANGLE4 / 2);
		
		double pX = x / (w * t);
		double pY = y / (w * t);
		double pZ = z / (w * t);
		
		return new Vertex(pX, pY, pZ);
	}
	
	// Calculates and returns the distance between this vertex and vertex  v
	public Vector subtract(Vertex v){
		return new Vector(x - v.x, y - v.y, z - v.z, w - v.w);
	}
	
	// Returns this 3D vertex transformed from real-world coordinates to eye coordinates
	public Vertex transform3(){
		
		Vector v = this.subtract(GraphicsPanel.getViewpoint());
		Matrix m = v.multiply(GraphicsPanel.getTransformationMatrix3());
		
		return new Vertex(m.getValue(0, 0), m.getValue(0, 1), m.getValue(0, 2));
	}
	
	// Returns this 4D vertex transformed from real-world coordinates to eye coordinates
	public Vertex transform4(){
		
		Vector v = this.subtract(ViewSettings.FROM4);
		Matrix m = v.multiply(GraphicsPanel.getTransformationMatrix4());
		
		return new Vertex(m.getValue(0, 0), m.getValue(0, 1), m.getValue(0, 2), m.getValue(0, 3));
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getZ(){
		return z;
	}
	
	public double getW(){
		return w;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public void setZ(double z){
		this.z = z;
	}
	
	public void setW(double w){
		this.w = w;
	}
}