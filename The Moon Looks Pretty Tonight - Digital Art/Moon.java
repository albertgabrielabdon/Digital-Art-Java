/**
PROGRAM: This program draws a moon using the Circle.

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

public class Moon implements DrawingObject {


    private Circle mo;
    

    public Moon(double x, double y, double size, Color color) {
        mo = new Circle(x,y,size,color);
    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();
      mo.draw(g2d);
      g2d.setTransform(reset);

      
    }
}