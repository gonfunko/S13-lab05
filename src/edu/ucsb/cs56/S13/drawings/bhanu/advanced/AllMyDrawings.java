package edu.ucsb.cs56.S13.drawings.bhanu.advanced;

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
 * @author Bhanu Khanijau
 * @version for CS56, lab05, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw a picture with a few barbells
     */

    public static void drawPicture1(Graphics2D g2) {

	Barbell b1 = new Barbell(50,50,300,50);
	g2.setColor(Color.CYAN); g2.draw(b1);

	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
        
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2);
	
	BarbellWithWeights bw1 = new BarbellWithWeights(50,150,400,75);
	BarbellWithWeights bw2 = new BarbellWithWeights(200,350,200,25);
	
	g2.draw(bw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(bw2);
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Barbells by Bhanu Khanijau", 20,20);
    }


    /** Draw a picture with a few Barbells
     */
    public static void drawPicture2(Graphics2D g2) {

	
	Barbell largeBB = new Barbell(100,400,225,50);
	Barbell smallBB = new Barbell(20,50,300,30);
	Barbell tallBB = new Barbell(20,150,100,10);
	Barbell shortBB = new Barbell(20,250,200,20);
	
	g2.setColor(Color.RED);     g2.draw(largeBB);
	g2.setColor(Color.GREEN);   g2.draw(smallBB);
	g2.setColor(Color.BLUE);    g2.draw(tallBB);
	g2.setColor(Color.MAGENTA); g2.draw(shortBB);
	
	Barbell b1 = new Barbell(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
        
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2);
	
	BarbellWithWeights bw1 = new BarbellWithWeights(50,350,40,75);
	BarbellWithWeights bw2 = new BarbellWithWeights(200,350,200,100);
	
	g2.draw(bw1);
	g2.setColor(new Color(0x8F00FF));
        
	Shape bw3 = ShapeTransforms.rotatedCopyOf(bw2, Math.PI/4.0);

	g2.draw(bw3);
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Barbells by Bhanu Khanijau", 20,20);
    }
  
    /** Draw a different picture with a few Barbells
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Barbells by Bhanu Khanijau", 20,20);

	
       Barbell largeBB = new Barbell(0,50,400,20);
       Barbell smallBB = new Barbell(20,50,40,30);
       
       g2.setColor(Color.pink);     g2.draw(largeBB);
       g2.setColor(Color.gray);   g2.draw(smallBB);
       
       
    }
    

}
