package edu.ucsb.cs56.S13.drawings.bnewman.advanced;
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
   A vector drawing of a robot's face that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Brandon Newman
   @version for CS56, Spring 2013, UCSB
   
*/
public class RobotFace extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of robot face
       @param y y coord of lower left corner of robot face
       @param length length of side of the face
     */
    public RobotFace(double x, double y, double length)
    {
    
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.


        
        // Make the head 
	      Rectangle2D.Double head = 
	        new Rectangle2D.Double(x, y, length, length);


	      //Make the eyes
	      Rectangle2D.Double eyeballLeft =
	        new Rectangle2D.Double(x + length/8, y + length/8, length/4, length/4);

	      Rectangle2D.Double eyeballRight =
	        new Rectangle2D.Double(x + 5*length/8, y + length/8, length/4, length/4);


	      //Make the mouth
	      Rectangle2D.Double mouth =
	        new Rectangle2D.Double(x + length/8, y + 5*length/8, 3*length/4, length/4);

	      //Make a line indicating the mouth is a screen
	      Line2D.Double screen = 
	        new Line2D.Double(x + length/8, y + 3*length/4, x + 7*length/8, y + 3*length/4);

	      //Put it all together
	      GeneralPath entireRobotFace = this.get();
	      entireRobotFace.append(head, false);
	      entireRobotFace.append(eyeballLeft, false);
       	entireRobotFace.append(eyeballRight, false);
	      entireRobotFace.append(mouth, false);
	      entireRobotFace.append(screen, false);

           
    }

}
