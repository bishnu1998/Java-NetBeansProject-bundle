/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author bishnu
 */
public class NewJApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String str="";
    public void init() {
        // TODO start asynchronous download of heavy resources
        str +="int:\n";
    }
    public void start(){
         str +="start:\n";
    }
    public void stop(){
        str +="stop:\n";
    }
    public void destroy(){
        
    }
    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g){
        g.drawString("hello world ",50,50);
    }
}
