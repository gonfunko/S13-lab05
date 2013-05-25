package edu.ucsb.cs56.S13.drawings.bhanu.advanced;
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
   A barbell with weights
      
   @author Phill Conrad 
   @author Bhanu Khanijau
   @version for CS56, S13, UCSB, 05/24/2013
   
*/
public class BarbellWithWeights extends Barbell implements Shape
{
    /**
     * Constructor for objects of class BarbellWithWeights
     */
    public BarbellWithWeights(double x, double y, double width, double height)
    {
	// construct the basic barbell
	super(x,y,width,height);
        
        double weightWidth = width/24;
        double weightHeight = height*3;
        
        double leftWeightX = x+width/6-weightWidth;
        double leftWeightY = y - weightHeight/2 + height/2;
        
        double smallWeightY = leftWeightY + weightHeight*1/8;
        
        double rightWeightX = leftWeightX + width/6*4 + weightWidth;
        
        Rectangle2D.Double leftWeight =
        new Rectangle2D.Double(leftWeightX, leftWeightY ,
                               weightWidth, weightHeight);
        
        Rectangle2D.Double rightWeight =
        new Rectangle2D.Double(rightWeightX, leftWeightY ,
                               weightWidth, weightHeight);
        
        Rectangle2D.Double leftWeightSmall =
        new Rectangle2D.Double(leftWeightX - weightWidth, smallWeightY,
                               weightWidth, weightHeight*3/4);
        
        Rectangle2D.Double rightWeightSmall =
        new Rectangle2D.Double(rightWeightX + weightWidth, smallWeightY ,
                               weightWidth, weightHeight*3/4);
        
        GeneralPath gp = this.get();
        gp.append(leftWeight,false);
        gp.append(rightWeight,false);
        gp.append(leftWeightSmall,false);
        gp.append(rightWeightSmall,false);
	
    }

}
