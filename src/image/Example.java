package image;


import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Image;


public class Example extends JFrame {

    public Example() {
        initUI();
    }

    public final void initUI() {

        
        Images img = new Images();
        img.setImageChemin("c:\\map.jpg");
                   
         getContentPane().add(img);

        

        setTitle("Tooltip");
       setSize(230, 240);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
           Example ex = new Example();
           ex.setVisible(true);
           
       
    }
    
}