package edu.ucsb.cs56.S13.drawings.pconrad.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
/**
   A face with cigarette
      
   @author Wei Guo
   @version for CS56, S13, UCSB
   
*/
public class FaceWithCigarette extends Face implements Shape
{
    /**
     * Constructor for objects of class face
     */
    public FaceWithCigarette(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	


	double w = 0.10 * width;
	double winTop = y + 0.5 * height;
	

	Rectangle2D.Double cigarette =
	    new Rectangle2D.Double(x/2,500 , 30, 5);
	
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath wholeHouse = this.get();
        wholeHouse.append(cigarette, false);
       
    }

}
