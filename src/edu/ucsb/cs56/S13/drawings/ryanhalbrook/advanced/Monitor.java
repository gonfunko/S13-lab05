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
   @version for CS56, Spring 13, UCSB
 */

public class Monitor extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
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
	this.get().append(border, false);
	this.get().append(innerBorder, false);
	this.get().append(stand, false);
    }
    

    private void addShape(Shape s) {
	this.get().append(s, false);
    }
}
