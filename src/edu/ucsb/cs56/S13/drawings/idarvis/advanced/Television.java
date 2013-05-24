package edu.ucsb.cs56.S13.drawings.idarvis.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A simple television (wrapper around a General Path, implements Shape)

   This provides an example of how you can start with the coordinates
   of a hard coded object, and end up with an object that can be
   drawn anywhere, with any width or height.
   
      
   @author Daryl Pham 
   @version for CS56, S13, UCSB, 05/21/2013
   
*/

public class Television extends GeneralPathWrapper implements Shape {
	
	/**
     * ConstrucTor for objects of class Television
     */
    
    public Television(double x, double y, double width, double height) {
		
		Rectangle2D.Double TV = new Rectangle2D.Double(x, y, width, height);
		Rectangle2D.Double Screen = new Rectangle2D.Double(x+(width*.1), y+(height*.1), width*.8, height*.8);
		
		GeneralPath wholeTV = this.get();
		wholeTV.append(TV, false);
		wholeTV.append(Screen, false);
		// GeneralPath wholeScreen = this.get();
		// wholeScreen.append(Screen, false);
    
       }
   }
        
        
        
        
        
        
