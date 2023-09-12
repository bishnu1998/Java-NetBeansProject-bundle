
package applet2;
import java.applet.*;
import java.awt.*;

public class Applet2 extends Applet{
  String s = "Java Howto";
  int x=40;
  int y=50;

public void init() {
  add(new Button("Real's"));
}

public void paint(Graphics g) {
  g.drawString(s, x,y);
  //g.drawLine(x , y+2 , x+getFontMetrics(getFont()).stringWidth(s) , y+2 );
  }
}

/* applet into application
import java.awt.*;

public class UnderlineText extends Panel{
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

  UnderlineText ut = new UnderlineText();
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
} */