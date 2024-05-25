/**
PROGRAM: This program makes pentagon stars randomly generated in the sky.

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

public class Star2 implements DrawingObject{

    private double x;
    private double y;
    private double size;
    private Pentagon ster2;

    public Star2(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
        ster2 = new Pentagon(x,y,size);
    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();
      g2d.translate(15,100);

      int star_count = 0;
      while(star_count <= 7){ 
        int min_star = -100;
        int max_star = 220;
        int rando_height = (int) ((Math.random() * (max_star-min_star)+min_star));
        g2d.translate(140,rando_height);
        ster2.draw(g2d);
        star_count++;
      }

      g2d.setTransform(reset);

    }

}

// for random number use https://www.baeldung.com/java-generating-random-numbers-in-range