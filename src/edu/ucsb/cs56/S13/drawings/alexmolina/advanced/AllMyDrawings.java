package edu.ucsb.cs56.S13.drawings.alexmolina.advanced;

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
 * @author Phill Conrad 
 * @version for CS56, lab06, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw a picture with a few rockets 
     */

    public static void drawPicture1(Graphics2D g2) {

	Rocket r1 = new Rocket(100,250,50,120);
	g2.setColor(Color.CYAN); g2.draw(r1);
	
	// Make a black Rocket that's half the size, 
	// and moved over 150 pixels in x direction
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	g2.setColor(Color.BLACK); g2.draw(r2);
	
	// Make a red Rocket that's the same size as the previous one, 
	// and moved over 70 pixels in x direction
	Shape r3 = ShapeTransforms.scaledCopyOfLL(r2,1,1);
	r3 = ShapeTransforms.translatedCopyOf(r2,70,0);
	g2.setColor(Color.RED); g2.draw(r3);
	
	// Here's a Rocket that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	r2 = ShapeTransforms.scaledCopyOfLL(r2,4,4);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(r2); 
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Rockets by Alex Molina", 20,20);
    }


    /** Draw a picture with a few Rockets and some with fuses
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some rockets
	Rocket r1 = new Rocket(50,250,50,100);
	g2.setColor(Color.CYAN); g2.draw(r1);
	
	// Make a black Rocket that's half the size, 
	// and moved over 125 pixels in x direction
	// and moved over 100 pixels in y directon
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,25,-100);
	g2.setColor(Color.BLACK); g2.draw(r2);
	
	// Here's a Rocket that's 4x as big (2x the original)
	// and moved over 100 more pixels to right.
	// And rotate it 180 degrees (upside down)
	r2 = ShapeTransforms.scaledCopyOfLL(r2,4,4);
	r2 = ShapeTransforms.translatedCopyOf(r2,100,0);
	r2 = ShapeTransforms.rotatedCopyOf(r2, Math.PI);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(Color.RED); 
	g2.draw(r2); 
	
	// Draw two Rockets with a Fuse
	
	RocketWithFuse rf1 = new RocketWithFuse(450,250,40,75);
	RocketWithFuse rf2 = new RocketWithFuse(300,250,50,100);
	// Rotate the first Rocket 90 degrees around its center
	Shape rf0 = ShapeTransforms.rotatedCopyOf(rf1, Math.PI/2.0);
	g2.draw(rf0);
	g2.setColor(new Color(0x8F00FF)); 

	// Rotate the second Rocket 45 degrees around its center.
	Shape rf3 = ShapeTransforms.rotatedCopyOf(rf2, Math.PI/4.0);
	g2.draw(rf3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Rockets and some with fuses by Alex Molina", 20,20);
    }
  
    /** Draw a different picture with a few Rockets
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Rockets with fuses ready to launch by Alex Molina", 20,20);

	
	// Draw some rockets.
	
       RocketWithFuse r1 = new RocketWithFuse(100,200,50,150);
       RocketWithFuse r2 = new RocketWithFuse(200,200,50,150);
       RocketWithFuse r3 = new RocketWithFuse(300,200,50,150);
       RocketWithFuse r4 = new RocketWithFuse(400,200,50,150);
       RocketWithFuse r5 = new RocketWithFuse(500,200,50,150);
       
       g2.setColor(Color.RED);     g2.draw(r1);
       g2.setColor(Color.ORANGE);   g2.draw(r2);
       g2.setColor(Color.RED);     g2.draw(r3);
       g2.setColor(Color.ORANGE);   g2.draw(r4);
       g2.setColor(Color.BLACK);   g2.draw(r5);		
       
       
    }
    

}
