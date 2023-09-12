
package applet1;

/*
import java.applet.Applet;  
import java.awt.Graphics;  
public class Applet1 extends Applet{  
  
public void paint(Graphics g){  
g.drawString("welcome",150,150);  
}  
  
} */

import java.awt.*;

public class Applet1 extends Panel{
  String s = "Java Howto";
  int x=20;
  int y=50;

public static void main(String[] args) {
  Frame f = new Frame();
  f.addWindowListener(new java.awt.event.WindowAdapter() {
       public void windowClosing(java.awt.event.WindowEvent e) {
       System.exit(0);
       };
     });

  Applet1 ut = new Applet1();
  ut.setSize(100,100); // same size as defined in the HTML APPLET
  f.add(ut);
  f.pack();
  ut.init();
  f.setSize(100,100 + 20); // add 20, seems enough for the Frame title,
  f.show();
  }

public void init() {
  add(new Button("Real's"));
  }

public void paint(Graphics g) {
  g.drawString(s, x,y);
  g.drawLine(x , y+2 , x+getFontMetrics(getFont()).stringWidth(s) , y+2 );
  }
}