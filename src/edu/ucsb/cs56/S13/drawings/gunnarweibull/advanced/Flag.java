package edu.ucsb.cs56.S13.drawings.gunnarweibull.advanced;
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
   A vector drawing of a flag that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Gunnar Weibull 
   @version for CS56, Spring 2013, UCSB
   
*/
public class Flag extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
     */
    public Flag(double x, double y, double width, double height)
    {
    
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double flagHeight = .25 * height;
        
        
        
       
        
        Rectangle2D.Double flag = 
            new Rectangle2D.Double(x, y ,
                          width, flagHeight);
                          
   
        Line2D.Double pole = 
            new Line2D.Double (x, y+flagHeight,
                              x, y+height);
  
        GeneralPath wholeFlag = this.get();
        wholeFlag.append(flag, false);
        wholeFlag.append(pole, false);
  
        
    }

}
