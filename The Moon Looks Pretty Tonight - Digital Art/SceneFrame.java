/**
PROGRAM: This program sets up the GUI.

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

public class SceneFrame {

  private int width;
  private int height;
  private JFrame frame;
  private SceneCanvas sceneCanvas;

  public SceneFrame(int w, int h) {
    width = w;
    height = h;
    frame = new JFrame();
    sceneCanvas = new SceneCanvas(width, height);
  }

  public void setUpGUI() {
    Container contentPane = frame.getContentPane();
    contentPane.add(sceneCanvas, BorderLayout.CENTER);

    frame.setTitle("Midterm Project- Abdon, Albert Gabriel - 220028");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

}
