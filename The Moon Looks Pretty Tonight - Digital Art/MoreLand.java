/**
PROGRAM: This proram makes white mountains by combining rectangles
and triangles.

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

public class MoreLand implements DrawingObject {

    private double x;
    private double y;
    private double size;
    private Rectangle lando;
    private Triangle ster;
    private Triangle bigster;

    public MoreLand(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
        lando = new Rectangle(x,y,11);
        ster = new Triangle(x,y,30);
        bigster = new Triangle(x,y, 55);
    }

	public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();
        g2d.translate(0,510);
        lando.draw(g2d);

        g2d.translate(0,-200);
        ster.draw(g2d);
        g2d.translate(45,0);
        ster.draw(g2d);

        g2d.translate(100,0);
        ster.draw(g2d);
        g2d.translate(45,10);
        ster.draw(g2d);

        g2d.translate(100,0);
        ster.draw(g2d);
        g2d.translate(45,40);
        ster.draw(g2d);

        g2d.translate(-1000,-200);
        bigster.draw(g2d);
        g2d.translate(45,20);
        ster.draw(g2d);

        g2d.setTransform(reset);
      
    }
}