package edu.ucsb.cs56.S13.drawings.hmarasigan.advanced;
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
   a vector drawing of a man the implements the shape interface
and can be drawn, rotated, scaled, etc.

@author Phill Conrad
@author Hans Marasigan
@version CS56 Spring 13 UCSB

*/

public class EightBitMan extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       creates a man with user defined params
       @param top left x coord
       @param top left y coord
       @param the width the man will be
       @param the height the man will be
    */
    public EightBitMan(double x,double y,double width, double height)
    {
	double headSize = .25 * height;
	double bodyLength = height*.5;
	double headupperleft=y;
	double bodyupperleft=y*2;
	
	Rectangle2D.Double HisHead =
	    new Rectangle2D.Double(x,headupperleft,headSize,headSize);
	
	Line2D.Double HisBody =
	    new Line2D.Double(x+.5*headSize,
			      y+headSize,
			      x+.5*headSize,
			      y+bodyLength+headSize);
	Line2D.Double HisLeftArm =
	    new Line2D.Double(x+.5*headSize,
			      y+headSize+.1*bodyLength,
			      x-.25*width,
			      y+.25*headSize+.5*bodyLength);
	
	Shape HisRightArm = ShapeTransforms.horizontallyFlippedCopyOf(HisLeftArm);
	HisRightArm = ShapeTransforms.translatedCopyOf(HisRightArm, 
						     .85*width,
						     0.0);
      	Line2D.Double HisLeftLeg =
	    new Line2D.Double(x+.5*headSize,
			      y+headSize+bodyLength,
			      x-.25*width,
			      y+2*headSize+bodyLength);
	
	Shape HisRightLeg = ShapeTransforms.horizontallyFlippedCopyOf(HisLeftLeg);
	
	HisRightLeg = ShapeTransforms.translatedCopyOf(HisRightLeg, 
						     .85*width,
						       0.0);
	

	GeneralPath wholeMan=this.get();
	wholeMan.append(HisHead,false);
	wholeMan.append(HisBody,false);
	wholeMan.append(HisLeftArm,false);
	wholeMan.append(HisRightArm,false);
	wholeMan.append(HisLeftLeg,false);
	wholeMan.append(HisRightLeg,false);
	
    }
}
