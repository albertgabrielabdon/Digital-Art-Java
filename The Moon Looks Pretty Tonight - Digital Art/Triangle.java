/**
PROGRAM: This program draws a triangle.

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

public class Triangle implements DrawingObject{

    private double x;
    private double y;
    private double size;


    public Triangle(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();

      Color white = Color.decode("#FFFFFF");
      
      Path2D.Double stars = new Path2D.Double();
      stars.moveTo((50*size/4), (10*size/4));

        stars.lineTo((35*size/4),(30*size/4));
        stars.lineTo((65*size/4), (30*size/4));
    
        stars.closePath();
      g2d.setColor(white);
      g2d.draw(stars);
      g2d.fill(stars);

      g2d.setTransform(reset);
    }

}