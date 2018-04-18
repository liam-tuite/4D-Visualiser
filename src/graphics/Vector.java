package graphics;

public class Vector{
	
	private double a, b, c, d;
	
	// Constructor for 3D vector
	public Vector(double a, double b, double c){
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = 0;
	}

	// Constructor for 4D vector
	public Vector(double a, double b, double c, double d){

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	// Calculates and returns 3D cross product of this vector with vector v
	public Vector crossProduct(Vector v){
		return new Vector((b * v.c) - (c * v.b), (c * v.a) - (a * v.c), (a * v.b) - (b * v.a));
	}
	
	// Calculates and returns 4D cross product of 3 vectors (this  x  v  x  w)
	public Vector crossProduct(Vector v, Vector w){
		
		double a, b, c, d, e, f;
		
		a = (v.a * w.b) - (v.b * w.a);
		b = (v.a * w.c) - (v.c * w.a);
		c = (v.a * w.d) - (v.d * w.a);
		d = (v.b * w.c) - (v.c * w.b);
		e = (v.b * w.d) - (v.d * w.b);
		f = (v.c * w.d) - (v.d * w.c);
		
		double ra = (this.b * f) - (this.c * e) + (this.d * d);
		double rb = -(this.a * f) + (this.c * c) - (this.d * b);
		double rc = (this.a * e) - (this.b * c) + (this.d * a);
		double rd = -(this.a * d) + (this.b * b) - (this.c * a);

		return new Vector(ra, rb, rc, rd);
	}
	
	// Asserts whether this vector is identical to vector  v  (used for testing)
	public boolean equals(Vector v){
		return (a == v.a) && (b == v.b) && (c == v.c) && (d == v.d);
	}
	
	// Multiplies the matrix representation of this vector with matrix m
	public Matrix multiply(Matrix m){

		Matrix vectorMatrix = new Matrix(1, m.getNumRows());
		
		vectorMatrix.add(a);
		vectorMatrix.add(b);
		vectorMatrix.add(c);
		if(m.getNumRows() > 3){
			vectorMatrix.add(d);
		}
			
		return vectorMatrix.multiply(m);
	}
	
	// Gets the norm of this vector
	public double norm(){
		return Math.sqrt((a * a) + (b * b) + (c * c) + (d * d));
	}
	
	// Multiples each value by scalar s
	public Vector scale(double s){
		return new Vector(a * s, b * s, c * s, d * s);
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
	
	public double getD(){
		return d;
	}
}