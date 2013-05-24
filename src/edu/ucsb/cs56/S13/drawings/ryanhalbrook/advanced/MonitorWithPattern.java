package edu.ucsb.cs56.S13.drawings.ryanhalbrook.advanced;

import java.awt.geom.GeneralPath;
import java.awt.geom.AffineTransform;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a monitor with stripes showing on the display
   that implements the Shape interface.

   @author Ryan Halbrook
   @version for CS56 lab 05, Spring 2013
 */

/**
   Creates a Monitor drawing that is ready to be transformed and
   drawn onto the screen.
   @param x The x coordinate of the position of the Monitor.
   @param y The y coordinate of the position of the Monitor.
   @param width The width of the Monitor.
   @param height The height of the Monitor.
**/
public class MonitorWithPattern extends Monitor implements Shape{
    public MonitorWithPattern(double x, double y, double width, double height) {
	super(x, y, width, height);
	int barRes = 10;
	double bezelThickness = 10.0;
	double standHeight = 12.0;
	GeneralPath stripes = new GeneralPath();
	stripes.moveTo(x+bezelThickness, y+bezelThickness);
	int numRects = (int)((width- 2 * bezelThickness) / barRes);

	for (int i = 0; i < numRects; i++) {
	    Rectangle2D.Double rect;
	    addRect(x+i*barRes+bezelThickness,
		    y + bezelThickness, barRes,
		    height - 2 * bezelThickness- standHeight);
	}
    }
}
