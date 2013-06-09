package edu.ucsb.cs56.S13.drawings.cbarbello.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a door that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Casey Barbello 
   @version for CS56, Winter 11, UCSB
   
*/
public class Door extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of door
       @param y y coord of lower left corner of door
       @param width width of the door
       @param height of door (including first story and second story)
     */
    public Door(double x, double y, double width, double height)
    {
        // Make the door

        Rectangle2D.Double door = 
            new Rectangle2D.Double(x, y, width, height);
   
        // make the door handle

	Ellipse2D.Double handle = 
	    new Ellipse2D.Double(x+width*.75, y+height*.45, width*.15, width*.15);
        
        // put the door and door handle together

        GeneralPath wholeDoor = this.get();
        wholeDoor.append(door, false);
        wholeDoor.append(handle, false);   
    }

}
