/**
PROGRAM: This program makes a square.

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

public class Square implements DrawingObject {

    private double x;
    private double y;
    private double size;
    private Color color;

    public Square(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

	public void draw(Graphics2D g2d) {
    AffineTransform reset = g2d.getTransform();
    Color CityDarks = Color.decode("#021528");
    Rectangle2D.Double reg_square = new Rectangle2D.Double(10,0,3,3);
    
    g2d.setColor(CityDarks);
    g2d.draw(reg_square);
    g2d.fill(reg_square);
    g2d.setTransform(reset);
      
    }
}