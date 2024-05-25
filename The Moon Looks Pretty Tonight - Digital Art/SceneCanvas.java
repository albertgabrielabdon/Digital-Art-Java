/**
PROGRAM: This program stores all the draw objects and arranges them
accordingly to how will they be displayed in the GUI. It follows a layers
system arrangement where the the first input to the list will be topped
by the next. Additionally, this program sets the background color.

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

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class SceneCanvas extends JComponent {

  private int width;
  private int height;
  private Color color;
  private double size;
  private ArrayList<DrawingObject> drawobj;

  public SceneCanvas(int w, int h) {
    width = w;
    height = h;
    drawobj = new ArrayList<>();
    drawobj.add(new Star1(width*.5-width*.3*.5,height*.5-width*.3*.5,width*.3));
    drawobj.add(new MoreLand(width*.5-width*.3*.5,height*.5-width*.3*.5,width*.3));
    drawobj.add(new Scorpio(width*.5-width*.3*.5,height*.5-width*.3*.5,width, height, size, color));
    drawobj.add(new Star2(width*.5-width*.3*.5,height*.5-width*.3*.5,width*.3));
    drawobj.add(new Buildings(width*.5-width*.3*.5,height*.5-width*.3*.5,width*.3, color));
    drawobj.add(new Mobu(width*.5-width*.3*.5,height*.5-width*.3*.5,width*.3));
    drawobj.add(new Moon(width*.5-width*.3*.5,height*.5-width*.3*.5,width*.3, color));
    drawobj.add(new Tree(width*.5-width*.3*.5,height*.5-width*.3*.5,width*.3));
    drawobj.add(new SpecSter(width*.5-width*.3*.5,height*.5-width*.3*.5,width*.3));
    drawobj.add(new Grass(width*.5-width*.3*.5,height*.5-width*.3*.5,width*.3));
    setPreferredSize(new Dimension(width, height));
  }
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    Color LightBlue = new Color(51,204,204);
    Color DarkBlue = new Color(0,0,102);
    GradientPaint gp = new GradientPaint(width-100,height-650,DarkBlue, width, height, LightBlue);

    RenderingHints rh = new RenderingHints(
      RenderingHints.KEY_ANTIALIASING,
      RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setRenderingHints(rh);

    Rectangle2D.Double background = new Rectangle2D.Double(0,0,width,height);
    g2d.setPaint(gp);
    g2d.fill(background);

    for (DrawingObject drew: drawobj){
      drew.draw(g2d);
    }
    
  }

}

// for gradiant color use https://kodejava.org/how-do-i-create-a-gradient-paint-in-java-2d/