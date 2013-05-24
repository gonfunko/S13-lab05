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
   A vector drawing of a catepillar that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @version for CS56, Winter 11, UCSB
   
*/
public class Caterpillar extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of head
       @param y y coord of lower left corner of head
       @param width width of the head
       @param height of the head
     */
    public Caterpillar(double x, double y, double width, double height)
    {
        
        Rectangle2D.Double caterpillarHead =
            new Rectangle2D.Double(x, y, width, height);
        
        
        double eyeWidth = width/5;
        double eyeHeight = height/4;
        
        double xLeftEye = x + eyeWidth;
        double yLeftEye = y + eyeHeight/2;
        
        double noseWidth = width/3;
        double noseHeight = height/6;
        
        double xNose = x + noseWidth;
        double yNose = y + noseHeight*2 + eyeHeight/2;
        
        Rectangle2D.Double leftEye =
        new Rectangle2D.Double(xLeftEye, yLeftEye, eyeWidth, eyeHeight);
        
        Rectangle2D.Double rightEye =
        new Rectangle2D.Double(xLeftEye + 2 * eyeWidth, yLeftEye, eyeWidth, eyeHeight);
        
        Rectangle2D.Double nose =
        new Rectangle2D.Double(xNose, yNose, noseWidth, noseHeight);
        
        GeneralPath wholeCaterpillar = this.get();
        wholeCaterpillar.append(caterpillarHead, false);
        wholeCaterpillar.append(leftEye, false);
        wholeCaterpillar.append(rightEye, false);
        wholeCaterpillar.append(nose, false);
    }

}
