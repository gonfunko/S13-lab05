package edu.ucsb.cs56.S13.drawings.sanchitg94.advanced;

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
 * @author Sanchit Gupta
 * @version for CS56, lab05, S13
 */


public class AllMyDrawings
{
    /** Draw a picture with a few boats
     */

    public static void drawPicture1(Graphics2D g2) {

	Boat h1 = new Boat(50,250,100,50);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction

	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a boat that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two boats with flags
	
	BoatWithFlag hw1 = new BoatWithFlag(50,350,40,75);
	BoatWithFlag hw2 = new BoatWithFlag(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
      	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A boat by Sanchit Gupta", 20,20);
    }


    /** Draw a picture with a few boats and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some coffee cups.
	
	CoffeeCup large = new CoffeeCup(100,50,225,150);
	CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	CoffeeCup tallSkinny = new CoffeeCup(20,150,20,40);
	CoffeeCup shortFat = new CoffeeCup(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Boat h1 = new Boat(100,250,100, 50);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black boat that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a boat that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two boats with flags
	
	BoatWithFlag hw1 = new BoatWithFlag(50,350,40,75);
	BoatWithFlag hw2 = new BoatWithFlag(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 

	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);

	g2.draw(hw3);
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Coffee Cups and a few boats by Sanchit Gupta", 20,20);
    }
  
    /** Draw a different picture with coffee cups
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Coffee Cups by Phill Conrad", 20,20);

	
	// Draw some coffee cups.
	
       CoffeeCup large = new CoffeeCup(100,50,225,150);
       CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
       
       g2.setColor(Color.RED);     g2.draw(large);
       g2.setColor(Color.GREEN);   g2.draw(smallCC);
       
       
    }
    

}
