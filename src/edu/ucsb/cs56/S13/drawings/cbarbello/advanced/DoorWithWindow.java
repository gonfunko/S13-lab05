package edu.ucsb.cs56.S13.drawings.cbarbello.advanced;
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
   A Door with a window
      
   @author Casey Barbello 
   @version for CS56, W11, UCSB, 02/23/2011
   
*/
public class DoorWithWindow extends Door implements Shape
{
    /**
     * Constructor for objects of class DoorWithWindow
     */
    public DoorWithWindow(double x, double y, double width, double height)
    {
	// construct the basic Door shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make one window in the middle near the top of the door

	Rectangle2D.Double win1 =
	    new Rectangle2D.Double(x+width*.3, y+height*.1, width*.35, height*.35);
	
	// add the window to the door

        GeneralPath wholeDoor = this.get();
        wholeDoor.append(win1, false); 
    }

}
