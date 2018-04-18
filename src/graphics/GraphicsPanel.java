package graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import shapes3D.*;
import shapes4D.*;

@SuppressWarnings("serial")
public class GraphicsPanel extends JPanel{
	
	private boolean rotating; // Whether or not the shape is rotating
	private Polygon3D polygon3;
	private Polygon4D polygon4;
	private static Vertex viewpoint;
	
	private static Matrix transformationMatrix3, transformationMatrix4;
	
	public GraphicsPanel(){
		
		setViewpoint(new Vertex(ViewSettings.DEFAULT_VIEWPOINT));
		setTransformationMatrices();
		setShape("Tetrahedron");
	}
	
	// Draws the GraphicsPanel
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		// This line smoothes the edges of the polygon, making it look nicer
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the projection of the polygon (don't actually change the polygon's vertices)
        if(polygon3 == null){
        	polygon4.project().draw(g2);
        }
        else{
        	polygon3.project().draw(g2);
        }
		
		// Rotate the polygon. (This does change the vertices)
		if(rotating){
			
	        if(polygon3 == null){
	        	polygon4.rotate();
	        }
	        else{
	        	polygon3.rotate();
	        }
	        
			// Recall this method
			repaint();
		}
	}
	
	// Called whenever the "Rotate" checkbox is clicked
	public void setRotating(boolean rotating){
		
		this.rotating = rotating;
		
		if(rotating){
			repaint();
		}
	}
	
	// Called by MainWindow every time the user selects a shape. Also called on startup (automatically selects Tetrahedron)
	// The name of the selected shape is passed as a parameter.
	public void setShape(String s){
		
		if(s.equals("Tetrahedron")){
			polygon3 = new Tetrahedron();
			polygon4 = null;
		}
		else if(s.equals("Cube")){
			polygon3 = new Cube();
			polygon4 = null;
		}
		else if(s.equals("Octahedron")){
			polygon3 = new Octahedron();
			polygon4 = null;
		}
		else if(s.equals("Dodecahedron")){
			polygon3 = new Dodecahedron();
			polygon4 = null;
		}
		else if(s.equals("Icosahedron")){
			polygon3 = new Icosahedron();
			polygon4 = null;
		}
		else if(s.equals("5-Cell")){
			polygon4 = new Pentachoron();
			polygon3 = null;
		}
		else if(s.equals("8-Cell")){
			polygon4 = new Tesseract();
			polygon3 = null;
		}
		else if(s.equals("16-Cell")){
			polygon4 = new Hexadecachoron();
			polygon3 = null;
		}
		else if(s.equals("24-Cell")){
			polygon4 = new Icositetrachoron();
			polygon3 = null;
		}
		
		repaint();
	}
	
	public void updateScale(){
		
		if(polygon3 == null)
			polygon4.updateScale();
		else
			polygon3.updateScale();
	}
	
	private static void setTransformationMatrices(){
		
		transformationMatrix3 = Matrices.getTransformationMatrix3();
		transformationMatrix4 = Matrices.getTransformationMatrix4();
	}
	
	public static void setViewpoint(Vertex v){
		
		viewpoint = v;
		setTransformationMatrices();
	}
	
	public static Matrix getTransformationMatrix3(){
		return transformationMatrix3;
	}
	
	public static Matrix getTransformationMatrix4(){
		return transformationMatrix4;
	}
	
	public static Vertex getViewpoint(){
		return viewpoint;
	}
}