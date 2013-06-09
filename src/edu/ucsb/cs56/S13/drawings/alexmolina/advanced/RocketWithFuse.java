package edu.ucsb.cs56.S13.drawings.alexmolina.advanced;
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
   A Rocket with a fuse
      
   @author Phill Conrad 
   @version for CS56, S13, UCSB, 05/24/2013
   
*/
public class RocketWithFuse extends Rocket implements Shape
{
    /**
     * Constructor for objects of class Rocket
     */
    public RocketWithFuse(double x, double y, double width, double height)
    {
	// construct the basic rocket
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// add a fuse to the rocket at the bottom of rocket going down.
	
    Line2D.Double fuse =
            new Line2D.Double (x + width/2.0, y + height,
                               x + width/2.0, y + height + (height*.30));
	
	// add the fuse to the rocket
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath wholeRocket = this.get();
        wholeRocket.append(fuse, false);
    }

}
