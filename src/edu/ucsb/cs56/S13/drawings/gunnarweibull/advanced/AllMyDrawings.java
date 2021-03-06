package edu.ucsb.cs56.S13.drawings.gunnarweibull.advanced;

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
 * @author Gunnar Weibull 
 * @version for CS56, lab06, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw a picture with flags of various colors, sizes and aesthetic value 
     */

    public static void drawPicture2(Graphics2D g2) {

	Flag h1 = new Flag(200,250,50,100);
	g2.setColor(Color.RED); g2.draw(h1);
       

	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.75,0.75);
	h2 = ShapeTransforms.translatedCopyOf(h2,120,0);
	g2.setColor(Color.GREEN); g2.draw(h2);
	
        
	h2 = ShapeTransforms.scaledCopyOfLL(h2,3,3);
	h2 = ShapeTransforms.translatedCopyOf(h2,120,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
        
	
	JapaneseFlag hw1 = new JapaneseFlag(50,350,40,75);
	JapaneseFlag hw2 = new JapaneseFlag(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Flags of an Imaginary World with Poor Imagination by Gunnar Weibull", 20,20);
    }


    /** Draw a picture with a long line of flags
     */
    public static void drawPicture1(Graphics2D g2) {
	
        for(int j = 1; j<7;j++){
	for(int i = 0; i<20;i++){
	    Flag f;
	    if(java.lang.Math.random()>0.4){
		f = new Flag(i*20,j*55,15,50);
	    }else{
		f = new JapaneseFlag(i*20,j*55,15,50);
	    }
	    g2.setColor(new Color((int)(java.lang.Math.random()*255),(int)(java.lang.Math.random()*255),(int)(java.lang.Math.random()*255)));
	    g2.draw(f);
	}
	}
        
	

	CoffeeCup large = new CoffeeCup(100,50,225,150);
	CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	CoffeeCup tallSkinny = new CoffeeCup(20,150,20,40);
	CoffeeCup shortFat = new CoffeeCup(20,250,40,20);
	
        
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
        
	g2.setColor(Color.BLACK); 
	g2.drawString("Outside the UN building, where all the flags live in peace and harmony, by Gunnar Weibull", 20,20);
    }
  

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A patriot cries by this flag every morning. Patriots are sometimes blinded by romanticism, by Gunnar Weibull", 20,20);

	

	
       JapaneseFlag large = new JapaneseFlag(100,50,100,150);
      
       
       g2.setColor(Color.RED);     g2.draw(large);
       
       
       
    }
    

}
