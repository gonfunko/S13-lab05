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

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
/**
   A face with cigarette
      
   @author Wei Guo
   @version for CS56, S13, UCSB
   
*/
public class FaceWithCigarette extends Face implements Shape
{
    /**
     * Constructor for objects of class face
     */
    public FaceWithCigarette(double x, double y, double width, double height)
    {
	// construct the basic face shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
       
	

	Rectangle2D.Double cigaretteBody =
	    new Rectangle2D.Double( x-width/7,y+3*height/4,width/2,width/10);
	Rectangle2D.Double cigaretteTop =
	    new Rectangle2D.Double( x-width/7,y+3*height/4,width/10,width/10);
	
	
	// add the cigarette to the face
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath wholeFace = this.get();
        wholeFace.append(cigaretteBody, false);
	wholeFace.append(cigaretteTop, false);
       
    }

}
