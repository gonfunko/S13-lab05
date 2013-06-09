package edu.ucsb.cs56.S13.drawings.idarvis.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Line2D.Double;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
/**
   A Television
      
   @author Daryl Pham
   @version for CS56, S13, UCSB, 05/21/2013
   
*/
public class TelevisionWithAntena extends Television implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public TelevisionWithAntena(double x, double y, double width, double height)
    {
	// construct the basic Television shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// making the antena that goes on top of the Television in 
	// diagonal directions away from each other.

	Line2D L1 = new Line2D.Double(x+(width*.5), y, x+(width*.25), y-(height*.25));
	Line2D L2 = new Line2D.Double(x+(width*.5), y, x+(width*.75), y-(height*.25));
	
	// Add the antena to the television
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath TV = this.get();
        TV.append(L1, false);
        TV.append(L2, false);
    }

}
