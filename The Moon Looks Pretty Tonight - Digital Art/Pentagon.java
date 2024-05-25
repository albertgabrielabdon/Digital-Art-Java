/**
PROGRAM: This program makes a pentagon.

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

public class Pentagon implements DrawingObject{

    private double x;
    private double y;
    private double size;

    public Pentagon(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();

      Color white = Color.decode("#FFFFFF");

      Path2D.Double stars2 = new Path2D.Double();
      stars2.moveTo((50/10), (0/10));
      stars2.lineTo((100/10), (50/10));
      stars2.lineTo((75/10), (100/10));
      stars2.lineTo((25/10), (100/10));
      stars2.lineTo((0/10), (50/10));
      stars2.closePath();
    
      stars2.closePath();
      g2d.setColor(white);
        g2d.draw(stars2);
        g2d.fill(stars2);
      g2d.setTransform(reset);

    }

}