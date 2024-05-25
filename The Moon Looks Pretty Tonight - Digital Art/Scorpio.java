/**
PROGRAM: This program draws a Scorpio Constellation

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

public class Scorpio implements DrawingObject {

  private Line scorpio;

    public Scorpio(double x_init, double y_init, double x_final, double y_final, double size, Color color) {
        scorpio = new Line(x_init, y_init, x_final, y_final, size, color);
    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();
      scorpio.draw(g2d);
      g2d.setTransform(reset);
    }


}