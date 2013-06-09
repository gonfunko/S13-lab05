package edu.ucsb.cs56.S13.drawings.ryanhalbrook.advanced;

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

import java.util.ArrayList;
import java.awt.RenderingHints;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @author Ryan Halbrook
 * @version for CS10, lab06, Spring 2009
 * @version for CS56, lab05, Spring 2013
 */

public class AllMyDrawings
{
    /** Draw a picture with a couple of monitors 
     */
    public static void drawPicture1(Graphics2D g2) {
	g2.setColor(Color.BLUE);
	//g2.fillRect(5, 5, 200, 150);
	Monitor screen = new Monitor(5, 5, 150, 150);
	Shape widescreen = ShapeTransforms.scaledCopyOf(screen, 3, 1);
	widescreen = ShapeTransforms.translatedCopyOf(widescreen, 0, 200);
	g2.draw(screen);
	g2.draw(widescreen);
	g2.setColor(Color.BLACK);
	g2.drawString("Aspect Ratios by Ryan Halbrook", 300, 50);
    }


    /** Draw a picture with monitors that are displaying stripes
     */
    public static void drawPicture2(Graphics2D g2) {
	Shape[] shapes = new Shape[6];
	for (int i=0; i < 6; i++) shapes[i] = new MonitorWithPattern(0, 0, 200, 150);
	
	for (int i=0; i < 3; i++) {
	    shapes[i]   = ShapeTransforms.translatedCopyOf(shapes[i],   i*200, 0);
	    shapes[i+3] = ShapeTransforms.translatedCopyOf(shapes[i+3], i*200, 0);
	}

	for (int i=3; i < 6; i++) 
	    shapes[i] = ShapeTransforms.translatedCopyOf(shapes[i], 0, 150);
	
	shapes[3] = ShapeTransforms.rotatedCopyOf(shapes[3], Math.PI);
	shapes[4] = ShapeTransforms.rotatedCopyOf(shapes[4], Math.PI);
	shapes[5] = ShapeTransforms.rotatedCopyOf(shapes[5], Math.PI);
	
	for (Shape s : shapes) {
	    g2.setColor(new Color((int)(Math.random()*255),
				  (int)(Math.random()*255),
				  (int)(Math.random()*255)));

	    g2.draw(s);
	}
	g2.setColor(Color.BLACK);
	g2.drawString("Grid by Ryan Halbrook", 50, 350);
    }
  
    /** Draw a picture with two screens, one showing stripes, the other blank.
     */

    public static void drawPicture3(Graphics2D g2) {
	g2.setColor(Color.BLACK);

	Shape m1 = new Monitor           (0, 240 - 75, 250, 150);
	Shape m2 = new MonitorWithPattern(0, 240 - 75, 250, 150);

	m1 = ShapeTransforms.translatedCopyOf(m1, 640 / 2 - 255, 0);
	m2 = ShapeTransforms.translatedCopyOf(m2, 640 / 2 + 5, 0);
	
	m1 = ShapeTransforms.rotatedCopyOf(m1, -0.08);
	m2 = ShapeTransforms.rotatedCopyOf(m2,  0.08);
	
	// Use antialiased rendering
	RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
						  RenderingHints.VALUE_ANTIALIAS_ON);
	g2.addRenderingHints(hints);

	g2.setColor(Color.BLACK);
	g2.draw(m1);   g2.draw(m2);
	g2.drawString("Multi-monitor by Ryan Halbrook", 50, 400);
    }
}
