package Logica;

import javax.swing.*;
import java.awt.*;

public class Alien {

    private static String alien;
    private static int dy;
    private static int dx;
    private static int x;
    private static int y;
    private  static int tamaño;
    private static Image ImagenAlien;

    public Alien(){
        x = 25;
        y = 50;
        tamaño = 50;
        alien = "../Recursos/spriteAlien/F5S4.png";
        ImageIcon imgAlien = new ImageIcon(this.getClass().getResource(alien));
        ImagenAlien = imgAlien.getImage();
    }

    public static int getDy() {
        return dy;
    }

    public static int getDx() {
        return dx;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getTamaño() {
        return tamaño;
    }

    public static Image getImagenAlien() {
        return ImagenAlien;
    }
}
