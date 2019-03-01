package Logica;

import javax.swing.*;
import java.awt.*;

import static Logica.Juego.f1;

public class Nave{
    private static String nave;
    private static int dx;
    private static int tamaño;
    private static int x;
    private static int y;
    private static Image ImagenNave;


    public Nave() {
        x = 200;
        y = 495;
        tamaño = 70;
        nave = "../Recursos/spriteNave/Nave.png";
        ImageIcon imgNave = new ImageIcon(this.getClass().getResource(nave));
        ImagenNave = imgNave.getImage();

    }

    public static int getTamaño() {
        return tamaño;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static Image getImagenNave() {
        return ImagenNave;
    }

    public void mover(int dx){
            x += dx;
            System.out.println(x);
            f1.repaint();
    }

    public void disparar() {
        Bala b1 = new Bala();
    }


}