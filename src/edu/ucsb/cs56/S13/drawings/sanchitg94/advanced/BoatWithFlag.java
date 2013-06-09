package edu.ucsb.cs56.S13.drawings.sanchitg94.advanced;
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
   A Boat with flags
      
   @author Sanchit Gupta
   @version for CS56, S13, UCSB
   
*/
public class BoatWithFlag extends Boat implements Shape
{
    /**
     * Constructor for objects of class BoatWithFlag
     */
    public BoatWithFlag(double x, double y, double width, double height)
    {
	// construct the basic boat shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
   
	Rectangle2D.Double flag =
	    new Rectangle2D.Double(x+width/20, y-height,3* width/8, 2*height/5);

        GeneralPath wholeBoat = this.get();
        wholeBoat.append(flag, false);
    }

}
