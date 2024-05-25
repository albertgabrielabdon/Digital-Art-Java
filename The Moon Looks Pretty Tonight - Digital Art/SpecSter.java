/**
PROGRAM: This program makes a special hidden immovable star as compared
to other stars which will randomly be placed in the sky. It makes use 
of the triangle and pentagon shape (found in top left).

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

public class SpecSter implements DrawingObject {

    private double x;
    private double y;
    private double size;
    private Triangle tri;
    private Pentagon pen;

    public SpecSter(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
        tri = new Triangle(x,y,1.5);
        pen = new Pentagon(x,y,size);

    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();

      
      tri.draw(g2d);
      g2d.translate(12,6);
      pen.draw(g2d);

      g2d.setTransform(reset);
    }


}