package edu.ucsb.cs56.S13.drawings.wolfenbarger.advanced;

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
 
 @author Phill Conrad
 @author Martin Wolfenbarger
 @version for CS56, S13, UCSB, 05/24/2013
 */


public class AllMyDrawings
{
    /** Draw a picture with a few caterpillar heads
     */

    public static void drawPicture1(Graphics2D g2) {

	Caterpillar c1 = new Caterpillar(50,350,70,85);
	g2.setColor(Color.RED); g2.draw(c1);

	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,250,0);
	g2.setColor(Color.GREEN); g2.draw(c2);
        
	c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,170,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(Color.pink); 
	g2.draw(c2);
	
	CaterpillarWithHat ch1 = new CaterpillarWithHat(50,150,40,75);
	CaterpillarWithHat ch2 = new CaterpillarWithHat(200,150,200,100);
	
	g2.draw(ch1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(ch2);
	
	g2.setStroke(orig);
	g2.setColor(Color.black);
	g2.drawString("A few caterpillar heads by Martin Wolfenbarger", 20,20);
    }


    /** Draw a picture with a few caterpillar heads
     */
    public static void drawPicture2(Graphics2D g2) {
        
	Caterpillar large = new Caterpillar(100,50,225,150);
	Caterpillar small = new Caterpillar(20,50,40,30);
	Caterpillar tallSkinny = new Caterpillar(20,150,20,40);
	Caterpillar shortFat = new Caterpillar(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Caterpillar c1 = new Caterpillar(200,230,50,55);
	g2.setColor(Color.blue); g2.draw(c1);
	
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,250,0);
	g2.setColor(Color.gray); g2.draw(c2);
	
	c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,350,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(Color.YELLOW);
	g2.draw(c2);
	
	CaterpillarWithHat ch1 = new CaterpillarWithHat(50,350,40,75);
	CaterpillarWithHat ch2 = new CaterpillarWithHat(370,150,350,150);
	
	g2.draw(ch1);
	g2.setColor(new Color(0x8F00FF));
        
	Shape ch3 = ShapeTransforms.rotatedCopyOf(ch2, Math.PI/2.0);

	g2.draw(ch3);
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of caterpillar heads with and without their hats on by Martin Wolfenbarger", 20,20);
    }
  
    /** Draw a different picture with a few caterpillar heads
     */

    public static void drawPicture3(Graphics2D g2) {
        
	
	g2.drawString("Big caterpillar with caterpillar blush", 20,20);
        
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        g2.setStroke(thick);
       Caterpillar large = new Caterpillar(100,50,400,300);
        CaterpillarWithHat small1 = new CaterpillarWithHat(120,200,40,30);
        CaterpillarWithHat small2 = new CaterpillarWithHat(450,200,40,30);
       
        Shape smallLeft = ShapeTransforms.rotatedCopyOf(small1, Math.PI/-4.0);
        Shape smallRight = ShapeTransforms.rotatedCopyOf(small2, Math.PI/4.0);
       
       g2.setColor(Color.GREEN);     g2.draw(large);
        g2.setColor(Color.RED);   g2.draw(smallLeft);
        g2.setColor(Color.RED);   g2.draw(smallRight);
       
       
    }
    

}
