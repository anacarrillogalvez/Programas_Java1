
package galeriaanonima;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelImagenes extends JPanel{
    private String[] arregloI = {"Imag01.jpg","Imag02.jpg","imag03.jpg"};
    private int actualI;
    //static int variableestatica;
   
    public int getActualI() {
        return actualI;
    }

    public void setActualI(int actualI) {
        this.actualI = actualI;
    }
   
   
    public void paintComponent(Graphics g){
                super.paintComponent(g);
                try{
                BufferedImage i = ImageIO.read(new File(arregloI[actualI]));
                g.drawImage(i, 0, 0, getWidth(),getHeight(),null);
                }catch(Exception e){}
            }
   
}

/*
public class PanelImagenes {
    
}
*/