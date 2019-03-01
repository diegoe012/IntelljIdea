package Graficos;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class fondoAcerca extends JPanel {
    public fondoAcerca(){
        setLayout(null);
    }

    private URL url = getClass().getResource("../Recursos/fondo/fondoCerca.gif");
    Image ico = new ImageIcon(url).getImage();

    public void paint(Graphics g){
        g.drawImage( ico ,-20,50,300,150,this);
        setOpaque(false);
        super.paint(g);
    }
}
