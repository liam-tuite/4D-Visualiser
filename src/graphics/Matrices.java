package graphics;

public class Matrices{
	
	/* 	This class contains 3D clockwise/anticlockwise rotation matrices for each axis
	 *	as well as 4D clockwise/anticlockwise rotation matrices for each plane
	 */

	//////////////////////////////////////////////////////////////
	//////////////////// 3D Rotation Matrices ////////////////////
	//////////////////////////////////////////////////////////////
	
	public static Matrix anticlockwiseRotationX(double theta){
		return new Matrix(new double[][]{
			
			new double[]{1, 0, 0},
			new double[]{0, Math.cos(theta), -Math.sin(theta)},
			new double[]{0, Math.sin(theta), Math.cos(theta)}
		});
	}
	
	public static Matrix anticlockwiseRotationY(double theta){
		return new Matrix(new double[][]{
			
			new double[]{Math.cos(theta), 0, Math.sin(theta)},
			new double[]{0, 1, 0},
			new double[]{-Math.sin(theta), 0, Math.cos(theta)}
		});
	}
	
	public static Matrix anticlockwiseRotationZ(double theta){
		return new Matrix(new double[][]{
			
			new double[]{Math.cos(theta), -Math.sin(theta), 0},
			new double[]{Math.sin(theta), Math.cos(theta), 0},
			new double[]{0, 0, 1}
		});
	}
	
	public static Matrix clockwiseRotationX(double theta){
		return new Matrix(new double[][]{
			
			new double[]{1, 0, 0},
			new double[]{0, Math.cos(theta), Math.sin(theta)},
			new double[]{0, -Math.sin(theta), Math.cos(theta)}
		});
	}
	
	public static Matrix clockwiseRotationY(double theta){
		return new Matrix(new double[][]{
			
			new double[]{Math.cos(theta), 0, -Math.sin(theta)},
			new double[]{0, 1, 0},
			new double[]{Math.sin(theta), 0, Math.cos(theta)}
		});
	}
	
	public static Matrix clockwiseRotationZ(double theta){
		return new Matrix(new double[][]{
			
			new double[]{Math.cos(theta), Math.sin(theta), 0},
			new double[]{-Math.sin(theta), Math.cos(theta), 0},
			new double[]{0, 0, 1}
		});
	}

	//////////////////////////////////////////////////////////////
	//////////////////// 4D Rotation Matrices ////////////////////
	//////////////////////////////////////////////////////////////
	
	public static Matrix clockwiseRotationXY(double theta){
		return new Matrix(new double[][]{
			new double[]{Math.cos(theta), Math.sin(theta), 0, 0},
			new double[]{-Math.sin(theta), Math.cos(theta), 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{0, 0, 0, 1}
		});
	}
	
	public static Matrix clockwiseRotationYZ(double theta){
		return new Matrix(new double[][]{
			new double[]{1, 0, 0, 0},
			new double[]{0, Math.cos(theta), Math.sin(theta), 0},
			new double[]{0, -Math.sin(theta), Math.cos(theta), 0},
			new double[]{0, 0, 0, 1}
		});
	}
	
	public static Matrix clockwiseRotationZX(double theta){
		return new Matrix(new double[][]{
			new double[]{Math.cos(theta), 0, -Math.sin(theta), 0},
			new double[]{0, 1, 0, 0},
			new double[]{Math.sin(theta), 0, Math.cos(theta), 0},
			new double[]{0, 0, 0, 1}
		});
	}
	
	public static Matrix clockwiseRotationXW(double theta){
		return new Matrix(new double[][]{
			new double[]{Math.cos(theta), 0, 0, Math.sin(theta)},
			new double[]{0, 1, 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{-Math.sin(theta), 0, 0, Math.cos(theta)}
		});
	}
	
	public static Matrix clockwiseRotationYW(double theta){
		return new Matrix(new double[][]{
			new double[]{1, 0, 0, 0},
			new double[]{0, Math.cos(theta), 0, -Math.sin(theta)},
			new double[]{0, 0, 1, 0},
			new double[]{0, Math.sin(theta), 0, Math.cos(theta)}
		});
	}
	
	public static Matrix clockwiseRotationZW(double theta){
		return new Matrix(new double[][]{
			new double[]{1, 0, 0, 0},
			new double[]{0, 1, 0, 0},
			new double[]{0, 0, Math.cos(theta), -Math.sin(theta)},
			new double[]{0, 0, Math.sin(theta), Math.cos(theta)}
		});
	}
	
	public static Matrix anticlockwiseRotationXY(double theta){
		return new Matrix(new double[][]{
			new double[]{Math.cos(theta), -Math.sin(theta), 0, 0},
			new double[]{Math.sin(theta), Math.cos(theta), 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{0, 0, 0, 1}
		});
	}
	
	public static Matrix anticlockwiseRotationYZ(double theta){
		return new Matrix(new double[][]{
			new double[]{1, 0, 0, 0},
			new double[]{0, Math.cos(theta), -Math.sin(theta), 0},
			new double[]{0, Math.sin(theta), Math.cos(theta), 0},
			new double[]{0, 0, 0, 1}
		});
	}
	
	public static Matrix anticlockwiseRotationZX(double theta){
		return new Matrix(new double[][]{
			new double[]{Math.cos(theta), 0, Math.sin(theta), 0},
			new double[]{0, 1, 0, 0},
			new double[]{-Math.sin(theta), 0, Math.cos(theta), 0},
			new double[]{0, 0, 0, 1}
		});
	}
	
	public static Matrix anticlockwiseRotationXW(double theta){
		return new Matrix(new double[][]{
			new double[]{Math.cos(theta), 0, 0, -Math.sin(theta)},
			new double[]{0, 1, 0, 0},
			new double[]{0, 0, 1, 0},
			new double[]{Math.sin(theta), 0, 0, Math.cos(theta)}
		});
	}
	
	public static Matrix anticlockwiseRotationYW(double theta){
		return new Matrix(new double[][]{
			new double[]{1, 0, 0, 0},
			new double[]{0, Math.cos(theta), 0, Math.sin(theta)},
			new double[]{0, 0, 1, 0},
			new double[]{0, -Math.sin(theta), 0, Math.cos(theta)}
		});
	}
	
	public static Matrix anticlockwiseRotationZW(double theta){
		return new Matrix(new double[][]{
			new double[]{1, 0, 0, 0},
			new double[]{0, 1, 0, 0},
			new double[]{0, 0, Math.cos(theta), Math.sin(theta)},
			new double[]{0, 0, -Math.sin(theta), Math.cos(theta)}
		});
	}

	///////////////////////////////////////////////////////////////////
	///////////////////// Transformation Matrices /////////////////////
	///////////////////////////////////////////////////////////////////
	
	// Calculates the 3x3 transformation matrix based on the 3D to/from viewpoints and up vector.
	public static Matrix getTransformationMatrix3(){
		
		Vector vc = ViewSettings.TO3.subtract(GraphicsPanel.getViewpoint());
		vc = vc.scale(1 / vc.norm()); // Divide vector by its norm
		
		Vector va = ViewSettings.UP3.crossProduct(vc);
		va = va.scale(1 / vc.norm());
		
		Vector vb = vc.crossProduct(va);
		
		Matrix transformationMatrix3 = new Matrix(3, 3);

		transformationMatrix3.add(va.getA());
		transformationMatrix3.add(vb.getA());
		transformationMatrix3.add(vc.getA());
		
		transformationMatrix3.add(va.getB());
		transformationMatrix3.add(vb.getB());
		transformationMatrix3.add(vc.getB());
		
		transformationMatrix3.add(va.getC());
		transformationMatrix3.add(vb.getC());
		transformationMatrix3.add(vc.getC());
		
		return transformationMatrix3;
	}

	// Calculates the 4x4 transformation matrix based on the 4D to/from viewpoints and up vector.
	public static Matrix getTransformationMatrix4(){
		
		Vector vd = ViewSettings.TO4.subtract(ViewSettings.FROM4);
		vd = vd.scale(1 / vd.norm());
		
		Vector va = ViewSettings.UP4.crossProduct(ViewSettings.OVER4, vd);
		va = va.scale(1 / va.norm());
		
		Vector vb = ViewSettings.OVER4.crossProduct(vd, va);
		vb = vb.scale(1 / vb.norm());
		
		Vector vc = vd.crossProduct(va, vb);
		
		Matrix transformationMatrix4 = new Matrix(4, 4);

		transformationMatrix4.add(va.getA());
		transformationMatrix4.add(vb.getA());
		transformationMatrix4.add(vc.getA());
		transformationMatrix4.add(vd.getA());

		transformationMatrix4.add(va.getB());
		transformationMatrix4.add(vb.getB());
		transformationMatrix4.add(vc.getB());
		transformationMatrix4.add(vd.getB());

		transformationMatrix4.add(va.getC());
		transformationMatrix4.add(vb.getC());
		transformationMatrix4.add(vc.getC());
		transformationMatrix4.add(vd.getC());

		transformationMatrix4.add(va.getD());
		transformationMatrix4.add(vb.getD());
		transformationMatrix4.add(vc.getD());
		transformationMatrix4.add(vd.getD());
		
		return transformationMatrix4;
	}
}