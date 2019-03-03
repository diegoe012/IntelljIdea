package Logica;

import Graficos.Fondo;
import Graficos.Ventana;

import javax.swing.*;
import java.awt.*;
import static Logica.Juego.f1;
import static Logica.Juego.n1;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;

public class Nave{
    private static String nave;
    private static final int WIDTH = 70;
    private static final int HEIGHT = 70;
    private static int dx;
    private static int tamaño;
    public static int x;
    public static int y;
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

    public static void mover(int dx){
        x += dx;
        System.out.println(x);
        f1.repaint();
    }

    public void disparar() {
        Bala b1 = new Bala();
    }
    public static Rectangle getBounds()
    {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }



}