package Cubo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;

public class Ventana {
   public static void main(String[] args) {
      JFrame ventana = new JFrame("Lineas-Cubo");
      Panel cod = new Panel();
      ventana.add(cod);
      ventana.setDefaultCloseOperation(3);
      ventana.setBackground(Color.WHITE);
      ventana.setSize(400, 400);
      ventana.setLocationRelativeTo((Component)null);
      ventana.setVisible(true);
      ventana.setResizable(false);
   }
}
