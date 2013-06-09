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
   A vector drawing of a barbell that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
 @author Phill Conrad 
 @author Bhanu Khanijau
   @version for CS56, Spring 13, UCSB
   
*/
public class Barbell extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of barbell
       @param y y coord of lower left corner of barbell
       @param width width of the barbell
       @param height of barbell (including first story and second story)
     */
    public Barbell(double x, double y, double width, double height)
    {
        double leftSectionWidth = width/6;
        double leftSectionHeight = height;
        
        double middleSectionWidth = leftSectionWidth*4;
        double middleSectionHeight = leftSectionHeight/2;
        double middleSectionX = x+leftSectionWidth;
        double middleSectionY = y + height/2 - middleSectionHeight/2;

        
        Rectangle2D.Double leftSection =
            new Rectangle2D.Double(x, y ,
                                   leftSectionWidth, leftSectionHeight);
        Rectangle2D.Double middleSection =
        new Rectangle2D.Double(middleSectionX, middleSectionY ,
                               middleSectionWidth, middleSectionHeight);
        Rectangle2D.Double rightSection =
        new Rectangle2D.Double(x + leftSectionWidth + middleSectionWidth, y ,
                               leftSectionWidth, leftSectionHeight);
                          
        
       
        GeneralPath g2 = this.get();
        g2.append(leftSection, false);
        g2.append(middleSection, false);
        g2.append(rightSection, false); 
        
    }

}
