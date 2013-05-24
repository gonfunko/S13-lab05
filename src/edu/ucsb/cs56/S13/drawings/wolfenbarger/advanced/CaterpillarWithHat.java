package edu.ucsb.cs56.S13.drawings.wolfenbarger.advanced;
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
   A Catepillar
      
 @author Phill Conrad 
 @author Martin Wolfenbarger
 @version for CS56, S13, UCSB, 05/24/2013
   
*/
public class CaterpillarWithHat extends Caterpillar implements Shape
{
    /**
     * Constructor for objects of class Catepillar
     */
    public CaterpillarWithHat(double x, double y, double width, double height)
    {
	// construct the catepillar head
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
    
        double hatBaseWidth = width/3;
        double hatBaseHeight = height/10;
        
        double xHatBase = x + hatBaseWidth;
        double yHatBase = y - hatBaseHeight*3/2;
        
        Rectangle2D.Double hatBase =
	    new Rectangle2D.Double(xHatBase, yHatBase, hatBaseWidth, hatBaseHeight);
        
        Rectangle2D.Double hatTop =
	    new Rectangle2D.Double(xHatBase + hatBaseWidth/3, yHatBase - hatBaseHeight*6, hatBaseWidth/3, hatBaseHeight*6);
        
        GeneralPath gp = this.get();
        gp.append(hatBase, false);
        gp.append(hatTop, false);
    }

}
