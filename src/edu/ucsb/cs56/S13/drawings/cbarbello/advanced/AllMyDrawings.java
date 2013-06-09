package edu.ucsb.cs56.S13.drawings.cbarbello.advanced;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.geom.Rectangle2D; // for the bounding box
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;


import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad (wrote original)
 * @author Casey Barbello (added changes)
 * @version for CS10, lab06, Spring 2009
 */


public class AllMyDrawings
{
    /** Draw a picture with a few doors
     */

    public static void drawPicture1(Graphics2D g2) {

	Door d1 = new Door(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(d1);
	
	// Make a black door that's half the size, 
	// and moved over 150 pixels in x direction

	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,0.5,0.5);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	g2.setColor(Color.BLACK); g2.draw(d2);
	
	// Here's a door that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.

	d2 = ShapeTransforms.scaledCopyOfLL(d2,4,4);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	
	// We'll draw this with a thicker stroke

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(d2); 
	
	// Draw two doors with Windows
	
	DoorWithWindow dw1 = new DoorWithWindow(50,350,40,75);
	DoorWithWindow dw2 = new DoorWithWindow(200,350,200,100);
	DoorWithWindow dw3 = new DoorWithWindow(100, 100, 100, 200);
	
	g2.draw(dw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(dw2);
	g2.setColor(Color.RED); g2.draw(dw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few doors by Casey Barbello", 20,20);
    }


    /** Draw a picture with a few doors
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some doors.
	
	Door large = new Door(100,50,225,150);
	Door small = new Door(20,50,40,30);
	Door tallSkinny = new Door(20,150,20,40);
	Door shortFat = new Door(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Door d1 = new Door(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(d1);
	
	// Make a black door that's half the size, 
	// and moved over 150 pixels in x direction
	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,0.5,0.5);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	g2.setColor(Color.BLACK); g2.draw(d2);
	
	// Here's a door that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	d2 = ShapeTransforms.scaledCopyOfLL(d2,4,4);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(d2); 
	
	// Draw two doors with Windows
	
	DoorWithWindow dw1 = new DoorWithWindow(50,350,40,75);
	DoorWithWindow dw2 = new DoorWithWindow(200,350,200,100);
	
	g2.draw(dw1);
	g2.setColor(new Color(0x8F00FF)); 

	// Rotate the second door 45 degrees around its center.
	Shape dw3 = ShapeTransforms.rotatedCopyOf(dw2, Math.PI/4.0);

	g2.draw(dw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of doors by Casey Barbello", 20,20);
    }
  
    /** Draw a different picture with a few doors
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of doors by Casey Barbello", 20,20);

	
	// Draw some Doors.
	
       Door large = new Door(100,50,225,150);
       Door small = new Door(20,50,40,30);

       DoorWithWindow tall = new DoorWithWindow(500, 100, 50, 200);
       
       g2.setColor(Color.RED);     g2.draw(large);
       g2.setColor(Color.GREEN);   g2.draw(small);
       g2.setColor(Color.BLUE);    g2.draw(tall);
       
       
    }
    

}
