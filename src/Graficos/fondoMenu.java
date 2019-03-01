package Graficos;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class fondoMenu extends JPanel {

    public fondoMenu(){
        setLayout(null);
    }

    private URL url = getClass().getResource("../Recursos/fondo/fondoMenu.gif");
    Image fondo = new ImageIcon(url).getImage();

    private URL url1 = getClass().getResource("../Recursos/fondo/g10190.png");
    Image title = new ImageIcon(url1).getImage();


    @Override
    public void paint(Graphics g){
        g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
        g.drawImage(title,130,55,460,300,this);
        setOpaque(false);
        super.paint(g);
    }


}

