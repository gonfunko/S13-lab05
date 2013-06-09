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
   A vector drawing of a rocket that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Alex Molina 
   @version for CS56, Spring 13, UCSB
   
*/
public class Rocket extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of rocket
       @param y y coord of lower left corner of rocket
       @param width width of the rocket barrel
       @param height of rocket (including barrel and tip)
     */
    public Rocket(double x, double y, double width, double height)
    {
    
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double barrelheight = .70 * height;
        double tipheight = height - barrelheight;
        
        double UpperLeftY = y + tipheight;
        
        // Make the barrel
        
        Rectangle2D.Double barrel = 
            new Rectangle2D.Double(x, UpperLeftY ,
                          width, barrelheight);
                          
        // make the tip
        
        Line2D.Double leftTip = 
            new Line2D.Double (x - (width*0.5), y + tipheight,
                               x + width/2.0, y);
                               
        Line2D.Double rightTip =
            new Line2D.Double (x + width/2.0, y,
                               x + width + (width*0.5), y + tipheight);
                               
        Line2D.Double tipBottom =
            new Line2D.Double (x -(width*0.5), y + tipheight,
                               x + width + (width*0.5), y + tipheight);                               
        

        // put the whole rocket together
       
        GeneralPath wholeRocket = this.get();
        wholeRocket.append(barrel, false);
        wholeRocket.append(leftTip, false);
        wholeRocket.append(rightTip, false); 
        wholeRocket.append(tipBottom, false);
        
    }

}
