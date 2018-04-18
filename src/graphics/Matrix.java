package graphics;

import java.util.Arrays;

public class Matrix{

	//	numRows/numColumns are the number of rows/columns
	//	rowIndex/columnIndex keep track of which position is next to be filled when adding elements
	private int numColumns, numRows, columnIndex, rowIndex;
	
	// data is an array of 'rows'. A 'row' is an array of doubles
	private double[][] data;
	
	// Used in class Matrices (also used in JUnit tests)
	public Matrix(double[][] data){
		
		this.data = data;
		
		this.numColumns = data[0].length;
		this.numRows = data.length;
	}
	
	public Matrix(int numRows, int numColumns){
		
		this.numRows = numRows;
		this.numColumns = numColumns;
		
		data = new double[numRows][numColumns];
		
		rowIndex = 0;
		columnIndex = 0;
	}
	
	// Adds new element to the next available slot in the Matrix
	public void add(double d){
		
		data[rowIndex][columnIndex] = d;
		columnIndex++;
		
		if(columnIndex == data[0].length){
			// Move on to next row
			rowIndex++;
			columnIndex = 0;
		}
	}
	
	// Calculate the dot product of two sets of doubles (assumed to be the same length)
	public static double dotProduct(double[] row, double[] column){
		
		double d = 0;
		
		for(int i = 0; i < row.length; i++){
			d += (row[i] * column[i]);
		}
		
		return d;
	}
	
	// Checks whether two matrices are identical (have the same data). Used for testing
	public boolean equals(Matrix m){
		
		for(int i = 0; i < this.data.length; i++){
			if(!Arrays.equals(this.data[i], m.data[i])){
				return false;
			}
		}
		
		return true;
	}

	// This is necessary to get all values in a column from the multi-dimensional array
	public double[] getColumn(int index){

		double[] column = new double[numRows];

		for(int i = 0; i < numRows; i++){
			column[i] = data[i][index];
		}

		return column;
	}
	
	public int getNumRows(){
		return numRows;
	}
	
	// returns value at specified index in the matrix
	public double getValue(int r, int c){
		return data[r][c];
	}
	
	// Returns the product of this matrix and matrix  m
	public Matrix multiply(Matrix m){
		
		// When multiplying a  r x n  matrix by a  n x c  matrix, the resulting matrix has r rows and c columns 
		Matrix product = new Matrix(numRows, m.numColumns);

		for(int i = 0; i < numRows; i++){
			// Iterate through all rows
			for(int j = 0; j < product.numColumns; j++){
				// Iterate through all columns
				product.add(dotProduct(data[i], m.getColumn(j))); // dot product of row i and column j
			}
		}

		return product;
	}
	
	// Returns the product of this matrix and the matrix representation of vertex v
	public Matrix multiply(Vertex v){

		Matrix m = new Matrix(4, 1);

		m.add(v.getX());
		m.add(v.getY());
		m.add(v.getZ());
		m.add(v.getW());
		
		return this.multiply(m);
	}
}