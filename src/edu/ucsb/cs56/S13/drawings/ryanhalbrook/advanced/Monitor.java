package edu.ucsb.cs56.S13.drawings.ryanhalbrook.advanced;

import java.awt.geom.GeneralPath;
import java.awt.geom.AffineTransform;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a monitor that implements the
   Shape interface.
   
   @author Ryan Halbrook
   @version for CS56 lab 05, Spring 2013
 */

public class Monitor extends GeneralPathWrapper implements Shape
{
    /**
       Creates a Monitor drawing that is ready to be transformed and
       drawn onto the screen.
       @param x The x coordinate of the position of the Monitor.
       @param y The y coordinate of the position of the Monitor.
       @param width The width of the Monitor.
       @param height The height of the Monitor.
    **/
    public Monitor(double x, double y, double width, double height)
    {
	double bezelThickness = 10.0;
	double standThickness = 10.0;
	double standHeight = 12.0;
	Rectangle2D.Double border = new Rectangle2D.Double(x, y, width, height - standHeight);
	Rectangle2D.Double innerBorder = 
	    new Rectangle2D.Double(x+bezelThickness,
				  y+bezelThickness,
				  width - 2 * bezelThickness,
				  height- 2 * bezelThickness - standHeight);
	Rectangle2D.Double stand =
	    new Rectangle2D.Double(x+width / 2  - standThickness / 2,
				   y+height-standHeight,
				   standThickness,
				   standHeight);

        addShapes(new Shape[] {border, innerBorder, stand});
    }
    
    /**
       Convenience method to add an array of shapes to the path.
       @param shapes The shapes to add to the path.
     */
    protected void addShapes(Shape[] shapes) {
	for (Shape s : shapes) this.addShape(s);
    }
    
    /**
       Convenience method to add any Shape object to the path.  .
       @param shape The shape to add to the path.
     */
    protected void addShape(Shape shape) {
	this.get().append(shape, false);
    }

    /**
       Convenience method to add rectangles to the path.
       @param x The x coordinate of the position of the rectangle to add.
       @param y The y coordinate of the position of the rectangle to add.
       @param width The width of the rectangle to add.
       @param height The height of the rectangle to add.
     */
    protected void addRect(double x, double y, double width, double height) {
	Rectangle2D.Double rect = new Rectangle2D.Double(x, y, width, height);
	this.addShape(rect);
    }
}
