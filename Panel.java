package Cubo;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import javax.swing.JPanel;

public class Panel extends JPanel {
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
      Line2D linea1 = new Double(100.0D, 130.0D, 100.0D, 280.0D);
      Line2D linea2 = new Double(250.0D, 130.0D, 250.0D, 280.0D);
      Line2D linea3 = new Double(100.0D, 130.0D, 250.0D, 130.0D);
      Line2D linea4 = new Double(100.0D, 280.0D, 250.0D, 280.0D);
      Line2D linea5 = new Double(175.0D, 90.0D, 175.0D, 240.0D);
      Line2D linea6 = new Double(325.0D, 90.0D, 325.0D, 240.0D);
      Line2D linea7 = new Double(175.0D, 90.0D, 325.0D, 90.0D);
      Line2D linea8 = new Double(175.0D, 240.0D, 325.0D, 240.0D);
      Line2D linea9 = new Double(100.0D, 130.0D, 175.0D, 90.0D);
      Line2D linea10 = new Double(250.0D, 130.0D, 325.0D, 90.0D);
      Line2D linea11 = new Double(100.0D, 280.0D, 175.0D, 240.0D);
      Line2D linea12 = new Double(250.0D, 280.0D, 325.0D, 240.0D);
      Stroke pincel = new BasicStroke(2.0F);
      g2.setStroke(pincel);
      g2.draw(linea1);
      g2.draw(linea2);
      g2.draw(linea3);
      g2.draw(linea4);
      g2.draw(linea5);
      g2.draw(linea6);
      g2.draw(linea7);
      g2.draw(linea8);
      g2.draw(linea9);
      g2.draw(linea10);
      g2.draw(linea11);
      g2.draw(linea12);
   }
}
