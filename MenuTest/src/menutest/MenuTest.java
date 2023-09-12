package menutest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuTest extends JFrame{
    private Color colorValues[] = {Color.BLACK,Color.BLUE,Color.RED,Color.GREEN};
    private JRadioButtonMenuItem colorItems[],fonts[];
    private JCheckBoxMenuItem styleItems[];
    private JLabel display;
    private ButtonGroup fontGroup,colorGroup;
    private int style;
    //constructor 
    public MenuTest(){
        super("JMenu Test");
        
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        
        //File menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        bar.add(fileMenu);
        
        //about submenu
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.setMnemonic('A');
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "This is the example\nof menu!","About",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        fileMenu.add(aboutItem);
        
        //exit submenu
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('E');
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        fileMenu.add(exitItem);
        
        //format menu
        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic('n');
        bar.add(formatMenu);
        
        //color SubMenu
        JMenu colorItem = new JMenu("Color");
        colorItem.setMnemonic('C');
        
        //color event handling
        String colorNames[] = {"Black","Blue","Red","Green"};
        ColorItemHandler c1 = new ColorItemHandler();
        colorItems = new JRadioButtonMenuItem[colorNames.length];
        colorGroup = new ButtonGroup();
        for(int i=0; i<colorItems.length; i++){
            colorItems[i] = new JRadioButtonMenuItem(colorNames[i]);
            colorItem.add(colorItems[i]);
            colorGroup.add(colorItems[i]);
            colorItems[i].addActionListener(c1);
        }
        formatMenu.add(colorItem);
        colorItems[0].setSelected(true);
        formatMenu.addSeparator();
        
        
        //font subMenu
        JMenu fontMenu = new JMenu("Font");
        fontMenu.setMnemonic('p');
            
        //font menu handlig
        
        //radiobuttonmenuitem for fonts
        String fontNames[] = {"TimesRomen","Courier","Helvetica"};
        fonts = new JRadioButtonMenuItem[fontNames.length];
        fontGroup = new ButtonGroup();
        for(int i =0; i<fonts.length; i++){
            fonts[i] = new JRadioButtonMenuItem(fontNames[i]);
            fontMenu.add(fonts[i]);
            fontGroup.add(fonts[i]);
            fonts[i].addActionListener(c1);
        }
        formatMenu.add(fontMenu);
        
        fontMenu.addSeparator();
        
        //checkbox
        String styleNames[] ={"Bold","Italic"};
        styleItems = new JCheckBoxMenuItem[styleNames.length];
        
        //handling checkbox
        CheckBoxHandling c2 = new CheckBoxHandling();
        for(int i=0; i<styleItems.length; i++){
            styleItems[i] = new JCheckBoxMenuItem(styleNames[i]);
            fontMenu.add(styleItems[i]);
            styleItems[i].addItemListener(c2);
        }
        
        
        //label
        display = new JLabel("Sample Test",SwingConstants.CENTER);
        display.setForeground(colorValues[0]);
        display.setFont(new Font("TimesRomen",Font.PLAIN,72));
        getContentPane().add(display);
        getContentPane().add(display,BorderLayout.CENTER);
       
        
        //frame attributes
        setSize(300,300);
        setLocation(200,100);
        setVisible(true);
    }
    
    public static void main(String[] args){
        MenuTest m = new MenuTest();
        m.addWindowListener(new WindowAdapter() {
            @Override 
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }
    
    //inner class 
    public class ColorItemHandler implements ActionListener{
        @Override 
        public void actionPerformed(ActionEvent e){
            for(int i=0; i<colorItems.length; i++){
                if(colorItems[i].isSelected()){
                    display.setForeground(colorValues[i]);
                     break;
                }
            }
            for(int i =0; i<fonts.length; i++){
                if(e.getSource()==fonts[i]){
                    display.setFont(new Font(fonts[i].getText(),style,72));
                    break;
                }
            }
            repaint();
        }
    }
    
    //checkbox class
    public class CheckBoxHandling implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e){
            style = 0;
            if(styleItems[0].isSelected())
                style = style + Font.BOLD;
            if(styleItems[1].isSelected())
                style  = style + Font.ITALIC;
            
            display.setFont(new Font(display.getFont().getName(),style,72));
        }
    }
}