package graphics;

import java.util.ArrayList;

public class ViewSettings{
	
	public static final Vertex DEFAULT_VIEWPOINT = new Vertex(0, 0, 3);

	// Viewing angle is the angle of the viewing frustum (in radians). It must be in the range 0 < VIEWING_ANGLE < pi
	public static final double VIEWING_ANGLE4 = 45 * Math.PI / 180;
	public static final double VIEWING_ANGLE3 = 45 * Math.PI / 180;
	
	// Parameters of the 3D viewbox
	public static final Vertex VIEWBOX_CENTRE = new Vertex(0, 0, 0); // 0, 0, 0 centres the viewbox on the origin
	public static final double VIEWBOX_LENGTH = 2; // Length of each edge
	
	public static final double VIEW_CENTRE = 250; // Centre of the display panel
	public static final double VIEW_LENGTH = 500; // Length of the display panel

	public static final Vertex FROM4 = new Vertex(4, 0, 0, 0); // Location of the camera in 4-space
	public static final Vertex TO4 = new Vertex(0, 0, 0, 0); // Point we are looking at
	public static final Vector UP4 = new Vector(0, 1, 0, 0);
	public static final Vector OVER4 = new Vector(0, 0, 1, 0);

	public static final Vertex TO3 = new Vertex(0, 0, 0); // Point we are looking at
	public static final Vector UP3 = new Vector(0, 1, 0);
	
	public static final double BASE_SCALAR3 = 0.5;
	public static final double BASE_SCALAR4 = 0.5;

	// The greater the value of a scalar, the larger the shapes appear.
	private static double scalar3 = BASE_SCALAR3;
	private static double scalar4 = BASE_SCALAR4;
	
	public static final double BASE_ROTATION_ANGLE3 = 0.06 * Math.PI / 180;
	public static final double BASE_ROTATION_ANGLE4 = 0.06 * Math.PI / 180;

	private static double rotationAngle3 = BASE_ROTATION_ANGLE3;
	private static double rotationAngle4 = BASE_ROTATION_ANGLE4;

	// clockwise controls whether rotation is clockwise or anticlockwise
	private static boolean clockwise;
	
	private static Matrix rotationMatrix3;
	private static Matrix rotationMatrix4;
	
	private static ArrayList<String> rotationAxes = new ArrayList<>();
	private static ArrayList<String> rotationPlanes = new ArrayList<>();
	
	public static double getRotationAngle3(){
		return rotationAngle3;
	}
	
	public static double getRotationAngle4(){
		return rotationAngle4;
	}
	
	public static Matrix getRotationMatrix3(){
		return rotationMatrix3;
	}
	
	public static Matrix getRotationMatrix4(){
		return rotationMatrix4;
	}
	
	public static double getScalar3(){
		return scalar3;
	}
	
	public static double getScalar4(){
		return scalar4;
	}
	
	public static void setClockwise(boolean selected){
		
		clockwise = selected;

		setRotationMatrix3();
		setRotationMatrix4();
	}
	
	public static void setRotationMatrix3(){
		
		Matrix m;
		
		if(clockwise){
			for(String s : rotationAxes){
				
				if(s.equals("X")){
					m = Matrices.clockwiseRotationX(rotationAngle3);
				}
				else if(s.equals("Y")){
					m = Matrices.clockwiseRotationY(rotationAngle3);
				}
				else{
					m = Matrices.clockwiseRotationZ(rotationAngle3);
				}
				
				if(rotationAxes.indexOf(s) == 0){
					rotationMatrix3 = m;
				}
				else{
					rotationMatrix3 = rotationMatrix3.multiply(m);
				}
			}
		}
		else{
			for(String s : rotationAxes){
				
				if(s.equals("X")){
					m = Matrices.anticlockwiseRotationX(rotationAngle3);
				}
				else if(s.equals("Y")){
					m = Matrices.anticlockwiseRotationY(rotationAngle3);
				}
				else{
					m = Matrices.anticlockwiseRotationZ(rotationAngle3);
				}
				
				if(rotationAxes.indexOf(s) == 0){
					rotationMatrix3 = m;
				}
				else{
					rotationMatrix3 = rotationMatrix3.multiply(m);
				}
			}
		}
	}
	
	public static void setRotationMatrix4(){
		
		Matrix m;
		
		if(clockwise){
			for(String s : rotationPlanes){
				
				if(s.equals("XY")){
					m = Matrices.clockwiseRotationXY(rotationAngle4);
				}
				else if(s.equals("YZ")){
					m = Matrices.clockwiseRotationYZ(rotationAngle4);
				}
				else if(s.equals("ZX")){
					m = Matrices.clockwiseRotationZX(rotationAngle4);
				}
				else if(s.equals("XW")){
					m = Matrices.clockwiseRotationXW(rotationAngle4);
				}
				else if(s.equals("YW")){
					m = Matrices.clockwiseRotationYW(rotationAngle4);
				}
				else{
					m = Matrices.clockwiseRotationZW(rotationAngle4);
				}
				
				if(rotationPlanes.indexOf(s) == 0){
					rotationMatrix4 = m;
				}
				else{
					rotationMatrix4 = rotationMatrix4.multiply(m);
				}
			}
		}
		else{
			for(String s : rotationPlanes){
				
				if(s.equals("XY")){
					m = Matrices.anticlockwiseRotationXY(rotationAngle4);
				}
				else if(s.equals("YZ")){
					m = Matrices.anticlockwiseRotationYZ(rotationAngle4);
				}
				else if(s.equals("ZX")){
					m = Matrices.anticlockwiseRotationZX(rotationAngle4);
				}
				else if(s.equals("XW")){
					m = Matrices.anticlockwiseRotationXW(rotationAngle4);
				}
				else if(s.equals("YW")){
					m = Matrices.anticlockwiseRotationYW(rotationAngle4);
				}
				else{
					m = Matrices.anticlockwiseRotationZW(rotationAngle4);
				}
				
				if(rotationPlanes.indexOf(s) == 0){
					rotationMatrix4 = m;
				}
				else{
					rotationMatrix4 = rotationMatrix4.multiply(m);
				}
			}
		}
	}
	
	public static void setRotationAngle3(double r){
		rotationAngle3 = r;
	}
	
	public static void setRotationAngle4(double r){
		rotationAngle4 = r;
	}
	
	public static void setScalar3(double s){
		scalar3 = s;
	}
	
	public static void setScalar4(double s){
		scalar4 = s;
	}
	
	public static void toggleAxis(String r){
		
		if(rotationAxes.contains(r)){
			rotationAxes.remove(r);
		}
		else{
			rotationAxes.add(r);
		}
		
		setRotationMatrix3();
	}
	
	public static void togglePlane(String r){
		
		if(rotationPlanes.contains(r)){
			rotationPlanes.remove(r);
		}
		else{
			rotationPlanes.add(r);
		}
		
		setRotationMatrix4();
	}
	
	public static void updateRotationMatrices(){

		setRotationMatrix3();
		setRotationMatrix4();
	}
}