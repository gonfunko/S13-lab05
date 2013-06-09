package edu.ucsb.cs56.S13.drawings.twodimension.advanced;
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
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a face that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Wei Guo 
   @version for CS56, Spring 2013, UCSB
   
*/
public class Face extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of Face
       @param y y coord of lower left corner of Face
       
       @param width width of the Face
       @param height of Face
     */
    public Face(double x, double y, double width, double height)
    {
    
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double FaceHeight =height;
        double EyeHeight = y+height/4;
        double MouthHeight = y+3*height/4;
	double TeethHeight = y+3*height/4;

        
        // Make the shape of face
        
        Rectangle2D.Double face =  new Rectangle2D.Double(x,y,width, FaceHeight);
	//make two teeth
	double LTpos = x+width/2-width/6;
	double RTpos = x+width/2;
	Rectangle2D.Double leftT =  new Rectangle2D.Double(LTpos,TeethHeight,width/7,width/7);
	Rectangle2D.Double rightT =  new Rectangle2D.Double(RTpos,TeethHeight,width/7,width/7);
	//make the shape of mouth
	double MouthPos=x+width/4;
	Rectangle2D.Double mouth =  new Rectangle2D.Double(MouthPos,MouthHeight,width/2,width/4);
                          
        // make the eyes.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Ellipse2D leftEye = new Ellipse2D.Double(x+width/6 ,EyeHeight,width/4,width/4);
                               
        Ellipse2D rightEye = new Ellipse2D.Double(x+3*width/4-width/10,EyeHeight,width/4,width/4);

        // put the whole face together
       
        GeneralPath wholeFace = this.get();
	wholeFace.append(face, false);
        wholeFace.append(leftEye, false);
        wholeFace.append(rightEye, false); 
	wholeFace.append(mouth,false);
	wholeFace.append(leftT,false);
	wholeFace.append(rightT,false);
    }

}
