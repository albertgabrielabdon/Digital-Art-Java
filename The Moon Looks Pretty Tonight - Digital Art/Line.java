/**
PROGRAM: This program draws a Line.

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

public class Line implements DrawingObject {

    private double x_init;
    private double y_init;
    private double x_final;
    private double y_final;
    private double size;
    private Color color;

    public Line(double x_init, double y_init, double x_final, double y_final, double size, Color color) {
        this.x_init = x_init;
        this.y_init = y_init;
        this.x_final = x_final;
        this.y_final = y_final;
        this.size = size;
        this.color = color;
        
    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();
      Color huwayt = Color.WHITE;


      Path2D.Double scorpio = new Path2D.Double();
      scorpio.moveTo(90, 120);

        scorpio.lineTo(70, 130);
        scorpio.lineTo(85, 160);
        scorpio.lineTo(125, 163);
        scorpio.lineTo(140, 159);
        scorpio.lineTo(170, 100);
        scorpio.lineTo(190, 80);
        scorpio.lineTo(215, 70);
        
        scorpio.moveTo(215, 70);
        scorpio.lineTo(240, 70);

        scorpio.moveTo(215, 70);
        scorpio.lineTo(240, 50);

        scorpio.moveTo(215, 70);
        scorpio.lineTo(240, 100);
        
        scorpio.closePath();
      g2d.translate(100,120);
      g2d.draw(scorpio);
      g2d.setColor(huwayt);
      g2d.setTransform(reset);
    
    }
}