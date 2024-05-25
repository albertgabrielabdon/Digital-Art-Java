/**
PROGRAM: This program makes a rectangle.

@author Albert Gabriel P. Abdon (220028)
@version March 9, 2023
**/
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/

import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements DrawingObject {

    private double x;
    private double y;
    private double size;

    public Rectangle(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

	public void draw(Graphics2D g2d) {
    AffineTransform reset = g2d.getTransform();
    Color white = Color.decode("#FFFFFF");
    Rectangle2D.Double rectongle = new Rectangle2D.Double(0,0,150*size,50);
    
    g2d.setColor(white);
    g2d.draw(rectongle);
    g2d.fill(rectongle);

    g2d.setTransform(reset);
      
    }
}