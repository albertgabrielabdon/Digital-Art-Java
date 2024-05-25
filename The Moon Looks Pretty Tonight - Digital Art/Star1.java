/**
PROGRAM: This program makes triangle stars randomly generated in the sky.

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

public class Star1 implements DrawingObject{

    private double x;
    private double y;
    private double size;
    private Triangle ster;

    public Star1(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
        ster = new Triangle(x,y,1);

    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();

      Color white = Color.decode("#FFFFFF");
      
      g2d.translate(50,50);

      int star_count = 0;
      while(star_count <= 7){ 
        int min_star = -100;
        int max_star = 220;
        int rando_height = (int) ((Math.random() * (max_star-min_star)+min_star));
        g2d.translate(140,rando_height);
        g2d.setColor(white);
        ster.draw(g2d);
        star_count++;
      }

      g2d.setTransform(reset);

      int star_count2 = 0;
      while(star_count2 <= 7){ 
        int min_star2 = -100;
        int max_star2 = 220;
        int rando_height2 = (int) ((Math.random() * (max_star2-min_star2)+min_star2));
        g2d.translate(100,rando_height2);
        g2d.setColor(white);
        ster.draw(g2d);
        star_count2++;
      }

      g2d.setTransform(reset);

      int star_count3 = 0;
      while(star_count3 <= 7){ 
        int min_star3 = -100;
        int max_star3 = 220;
        int rando_height3 = (int) ((Math.random() * (max_star3-min_star3)+min_star3));
        g2d.translate(100,rando_height3);
        g2d.setColor(white);
        ster.draw(g2d);
        star_count3++;
      }

      g2d.setTransform(reset);
    }

}

// for random number use https://www.baeldung.com/java-generating-random-numbers-in-range