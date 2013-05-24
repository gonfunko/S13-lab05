package edu.ucsb.cs56.S13.drawings.bnewman.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.S13.drawings.bnewman.simple.Circle;

/**
   A vector drawing of a robot's face with an antenna 
   that inherits from the RobotFace class implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Brandon Newman
   @version for CS56, Spring 2013, UCSB
   
*/
public class RobotFaceWithAnt extends RobotFace implements Shape
{
    public RobotFaceWithAnt(double x, double y, double length)
    {
		super(x,y, length);

		//Add an antenna
		Line2D.Double antenna = 
	    	new Line2D.Double(x + length/2, y, x + length/2, y - length/4);

		Circle antennaBall =
	    	new Circle( (x + length/2), (y - length/4) - length/16 , length/16);

		GeneralPath entireRobotFace = this.get();
		entireRobotFace.append(antenna, false);
		entireRobotFace.append(antennaBall, false);
	
    }

}
