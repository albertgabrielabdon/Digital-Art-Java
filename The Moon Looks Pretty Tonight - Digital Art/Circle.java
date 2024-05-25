/**
PROGRAM: This program makes a circle.

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

public class Circle implements DrawingObject{

    private double x;
    private double y;
    private double size;
    private Color color;

    public Circle(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();
      Color huwayt = Color.WHITE;
      Color shedow =  Color.decode("#515151");
      GradientPaint moon_color = new GradientPaint(0,0,huwayt, 43, 35, shedow);

      Ellipse2D.Double circle = new Ellipse2D.Double(0,0,50,50);
      g2d.translate(100,50);
      g2d.setPaint(moon_color);
      g2d.fill(circle);
      g2d.setTransform(reset);
      
    
    }
}

// for gradiant color use https://kodejava.org/how-do-i-create-a-gradient-paint-in-java-2d/