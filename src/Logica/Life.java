package Logica;

import javax.swing.*;
import java.awt.*;

public class Life {
    private static int x;
    public static int numero;
    private static int y;
    private static int tamaño;
    private static String life;
    private static Image ImageLife;

    public Life(){
        numero=3;
        x=6;
        y=610;
        tamaño = 20;
        life = "../Recursos/icon/Corazón.png";
        ImageIcon imgNave = new ImageIcon(this.getClass().getResource(life));
        ImageLife = imgNave.getImage();
    }

    public static int getX() {
        return x;
    }

    public static int getNumero() {
        return numero;
    }

    public static int getY() {
        return y;
    }

    public static int getTamaño() {
        return tamaño;
    }

    public static String getLife() {
        return life;
    }

    public static Image getImageLife() {
        return ImageLife;
    }
}
