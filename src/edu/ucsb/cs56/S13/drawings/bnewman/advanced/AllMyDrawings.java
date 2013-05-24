package edu.ucsb.cs56.S13.drawings.bnewman.advanced;

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
 * @author Brandon Newman
 * @version for CS56, lab05, Spring 2014
 */


public class AllMyDrawings
{
    /** Draw a few multicolored robots 
     */

    public static void drawPicture1(Graphics2D g2) {

	RobotFace        red     = new RobotFace(100,150,50);
	RobotFaceWithAnt green   = new RobotFaceWithAnt(200,150,50);
	RobotFace        blue    = new RobotFace(300,150,50);
	RobotFaceWithAnt purple =  new RobotFaceWithAnt(400,150,50);
       
	g2.setColor(Color.GREEN);         g2.draw(green);
	g2.setColor(Color.RED);           g2.draw(red);
	g2.setColor(Color.BLUE);          g2.draw(blue);
	g2.setColor(new Color(0x790EAD)); g2.draw(purple);

	g2.setColor(Color.BLACK);
	g2.drawString("A rag tag team of multicolored robot faces", 20,20);
	
    }


    /** Draw a few multicolored robots rotated about
     */
    public static void drawPicture2(Graphics2D g2) {

	RobotFace        red    = new RobotFace(200,200,70);
	RobotFaceWithAnt green  = new RobotFaceWithAnt(300,150,70);
	RobotFace        blue   = new RobotFace(400,200,70);
	RobotFaceWithAnt purple = new RobotFaceWithAnt(300,250,70);
	
	Shape rotatedRed = ShapeTransforms.rotatedCopyOf(red, Math.PI/2.0);
	Shape rotatedBlue = ShapeTransforms.rotatedCopyOf(blue, -1*(Math.PI/2.0));
    Shape rotatedGreen = ShapeTransforms.rotatedCopyOf(green, Math.PI);

	g2.setColor(Color.RED);           g2.draw(rotatedRed);
	g2.setColor(Color.BLUE);          g2.draw(rotatedBlue);
    g2.setColor(Color.GREEN);         g2.draw(rotatedGreen);
    g2.setColor(new Color(0x790EAD)); g2.draw(purple);

	g2.setColor(Color.BLACK); 
	g2.drawString("However these robot faces mostly just gaze at clouds all day", 20,20);
    }
  
    /** Draw a two robots, one small one, and one that gets thickened, larger, and translated
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	g2.drawString("And, of course, you don't have a robot face without a robot face parent", 20,20);

	
	// Draw the robots 
	RobotFaceWithAnt parent = new RobotFaceWithAnt(400, 300,50);
	RobotFace        baby   = new RobotFace(400, 270, 50);
	    
	Shape bigParent = ShapeTransforms.scaledCopyOfLL(parent,4,4);
	Shape finalParent = ShapeTransforms.translatedCopyOf(bigParent,-300,0);

	g2.setColor(Color.BLUE); g2.draw(baby);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thick);
	g2.setColor(Color.RED); g2.draw(finalParent);
       
       
    }

    public static void drawPicture4(Graphics2D g2) {

	RobotFace        large = new RobotFace(100,100,200);
	RobotFaceWithAnt rob   = new RobotFaceWithAnt(100,100,200);
	g2.setColor(Color.GREEN); g2.draw(rob);
    }
    

}
