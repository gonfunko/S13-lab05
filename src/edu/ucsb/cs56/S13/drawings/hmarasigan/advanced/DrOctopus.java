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
   a vector drawing of a man with 4 extra limbs (octopuslike) the implements the shape interface
and can be drawn, rotated, scaled, etc.

@author Hans Marasigan
@version CS56 Spring 13 UCSB

*/

public class DrOctopus extends EightBitMan implements Shape
{
    /**
     * Constructor for objects of class DrOctopus
     */

    public DrOctopus(double x, double y, double width, double height)
    {
	//construct the basic shell
	super(x,y,width,height);
	double headSize = .25 * height;
	double bodyLength = height*.5;
	double headupperleft=y;
	double bodyupperleft=y*2;

	//get the general path to append stuff to
	GeneralPath gp = this.get();
	
	//add limbs it is a man with lots of space on his body to add things. 
	Line2D.Double LeftTentacle1 =
	    new Line2D.Double(x+.5*headSize,
			      y+headSize+.4*bodyLength,
			      x-.25*width,
			      y+.25*headSize+.4*bodyLength);

	Line2D.Double LeftTentacle2 =
	    new Line2D.Double(x+.5*headSize,
			      y+headSize+.7*bodyLength,
			      x-.25*width,
			      y+.25*headSize+.7*bodyLength);
	Line2D.Double RightTentacle1 =
	    new Line2D.Double(x+.5*headSize,
			      y+headSize+.4*bodyLength,
			      x+.25*width,
			      y+.25*headSize+.4*bodyLength);

	Line2D.Double RightTentacle2 =
	    new Line2D.Double(x+.5*headSize,
			      y+headSize+.7*bodyLength,
			      x+.25*width,
			      y+.25*headSize+.7*bodyLength);

	
	GeneralPath wholeMan=this.get();
	wholeMan.append(LeftTentacle1,false);
	wholeMan.append(LeftTentacle2,false);
	wholeMan.append(RightTentacle1,false);
	wholeMan.append(RightTentacle2,false);
    }
}
