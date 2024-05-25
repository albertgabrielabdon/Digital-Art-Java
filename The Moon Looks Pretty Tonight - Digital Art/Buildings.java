/**
PROGRAM: This program makes a building with windows and scatters it
across the imagery.

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


public class Buildings implements DrawingObject {

  private double x;
  private double y;
  private double size;
  private Color color;

    public Buildings(double x, double y, double size, Color color) {
      this.x = x;
      this.y = y;
      this.size = size;
      this.color = color;
    }

	public void draw(Graphics2D g2d) {
    AffineTransform reset = g2d.getTransform();
    Color CityLoits = Color.decode("#334E68");
    Color CityDarks = Color.decode("#021528");
    Color lights_up = Color.decode("#F0FF9C");
    Color lights_down = Color.decode("#EBB72A");
    GradientPaint cityloi = new GradientPaint(0,0,lights_up, 0, 5, lights_down);
    GradientPaint lighten = new GradientPaint(0,0,CityLoits, 0, 210, CityDarks);

    Rectangle2D.Double square3 = new Rectangle2D.Double(10,0,25,280);
    Rectangle2D.Double square_light2 = new Rectangle2D.Double(10,0,3,3);

    g2d.translate(24,400);
    g2d.setColor(CityDarks);
    g2d.draw(square3);
    g2d.fill(square3);

    int building_count2 = 0;
      while(building_count2 <= 25){
        int count2 = 0;
        g2d.translate(4,6);
        g2d.setPaint(lights_up);
        g2d.draw(square_light2);
        g2d.fill(square_light2);
        while(count2 <= 6){
          int window_batch2 = 0;
          while(window_batch2 <= 2){
            int window_x2 = 10;
            int window_y2 = 0;
            if(window_batch2 == 0){
                g2d.translate(window_x2,window_y2);
            }
            if(window_batch2 == 1){
                window_x2 = 0;
                window_y2 = 10;
                g2d.translate(window_x2,window_y2);
            }
            if(window_batch2 == 2){
                window_x2 = -10;
                window_y2 = 0;
                g2d.translate(window_x2,window_y2);
            }
            g2d.setPaint(lights_up);
            g2d.draw(square_light2);
            g2d.fill(square_light2);          
            window_batch2 += 1;
          }
          count2 += 1;
        }
        int min_build_height2 = -60;
        int max_build_height2 = -90;
        int rando_build_height2 = (int) ((Math.random() * (max_build_height2-min_build_height2)+min_build_height2));
        g2d.translate(30,rando_build_height2);
        g2d.setColor(CityDarks);
        g2d.draw(square3);
        g2d.fill(square3);
        building_count2 += 1;
      }
      if(building_count2 == 26){
        int counta2 = 0;
        g2d.translate(4,6);
        g2d.setPaint(lights_up);
        g2d.draw(square_light2);
        g2d.fill(square_light2);
        while(counta2 <= 6){
          int window_batch2 = 0;
          while(window_batch2 <= 2){
            int window_x2 = 10;
            int window_y2 = 0;
            if(window_batch2 == 0){
                g2d.translate(window_x2,window_y2);
            }
            if(window_batch2 == 1){
                window_x2 = 0;
                window_y2 = 10;
                g2d.translate(window_x2,window_y2);
            }
            if(window_batch2 == 2){
                window_x2 = -10;
                window_y2 = 0;
                g2d.translate(window_x2,window_y2);
            }
            g2d.setPaint(lights_up);
            g2d.draw(square_light2);
            g2d.fill(square_light2);  
            window_batch2 += 1;
          }
          counta2 += 1;
        }
      }

    g2d.setTransform(reset);

    Rectangle2D.Double square2 = new Rectangle2D.Double(10,0,25,250);
    Rectangle2D.Double square_light = new Rectangle2D.Double(10,0,3,3);

    int build_layer = 450;
    int spacing_adjust = 34;
      g2d.translate(spacing_adjust,build_layer);
      g2d.setColor(CityLoits);
      g2d.draw(square2);
      g2d.fill(square2);
      int building_count = 0;
      while(building_count <= 25){
        int count = 0;
        g2d.translate(4,6);
        g2d.setPaint(cityloi);
        g2d.draw(square_light);
        g2d.fill(square_light);
        while(count <= 6){
          int window_batch = 0;
          while(window_batch <= 2){
            int window_x = 10;
            int window_y = 0;
            if(window_batch == 0){
                g2d.translate(window_x,window_y);
            }
            if(window_batch == 1){
                window_x = 0;
                window_y = 10;
                g2d.translate(window_x,window_y);
            }
            if(window_batch == 2){
                window_x = -10;
                window_y = 0;
                g2d.translate(window_x,window_y);
            }
            g2d.setPaint(cityloi);
            g2d.draw(square_light);
            g2d.fill(square_light);          
            window_batch += 1;
          }
          count += 1;
        }
        int min_build_height = -60;
        int max_build_height = -90;
        int rando_build_height = (int) ((Math.random() * (max_build_height-min_build_height)+min_build_height));
        g2d.translate(30,rando_build_height);
        g2d.setColor(CityLoits);
        g2d.draw(square2);
        g2d.fill(square2);
        building_count += 1;
      }
      if(building_count == 26){
        int counta = 0;
        g2d.translate(4,6);
        g2d.setPaint(cityloi);
        g2d.draw(square_light);
        g2d.fill(square_light);
        while(counta <= 6){
          int window_batch = 0;
          while(window_batch <= 2){
            int window_x = 10;
            int window_y = 0;
            if(window_batch == 0){
                g2d.translate(window_x,window_y);
            }
            if(window_batch == 1){
                window_x = 0;
                window_y = 10;
                g2d.translate(window_x,window_y);
            }
            if(window_batch == 2){
                window_x = -10;
                window_y = 0;
                g2d.translate(window_x,window_y);
            }
            g2d.setPaint(cityloi);
            g2d.draw(square_light);
            g2d.fill(square_light);  
            window_batch += 1;
          }
          counta += 1;
        }
      }

    g2d.setTransform(reset);

    Rectangle2D.Double square = new Rectangle2D.Double(0,0,1024,210);
    g2d.translate(0,560);
    g2d.setPaint(lighten);
    g2d.draw(square);
    g2d.fill(square);

    g2d.setTransform(reset);
    
    }
}

// random number source: https://www.baeldung.com/java-generating-random-numbers-in-range