

package mouseevents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseEvents extends JFrame implements MouseListener,MouseMotionListener{
    
    private JLabel label1;
    public MouseEvents(){
        label1 =new JLabel();
        label1.setBounds(10,10,150,20);
        add(label1);
        
        addMouseListener(this);
        addMouseMotionListener(this);
        
        
        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addWindowListener(new WindowAdapter(){
           public void windoClosing(WindowEvent e1){
               System.exit(0);
           } 
        });
        
        setVisible(true);
        
        
    }

    public static void main(String[] args) {
       new MouseEvents();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label1.setText("mouse clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {
       label1.setText("mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label1.setText("mouse Release");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       label1.setText("mouse Enter");
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
        label1.setText("mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
         Graphics g=getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 20, 20);
       label1.setText("mouse Drag"+e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
         int x1=e.getX();
        int y1=e.getY();
        label1.setText("mouse Move"+"  "+x1+"  "+y1);
        
    }
    
}
