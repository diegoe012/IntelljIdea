package Logica;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static Logica.Life.numero;

public class Alien extends AlienAbstarct{

    private static String alien;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 60;
    private static int dy;
    private static int dx;
    public static int x;
    public static int y;
    private  static int tamaño;
    public static boolean colision;

    int xa = 1;
    int ya = 1;


    private static Image ImagenAlien;

    public Alien(){

        x = (int) (Math.random() * 400-Alien.getX()) + 1;
        y = (int) (Math.random() * 200-Alien.getY()) + 50;
        this.muerto=false;
        tamaño = 60;
        alien = "../Recursos/spriteAlien/F5S4.png";
        ImageIcon imgAlien = new ImageIcon(this.getClass().getResource(alien));
        ImagenAlien = imgAlien.getImage();
    }

    @Override
    public void paint(Graphics g)
    {

        g.drawImage(Alien.getImagenAlien(),  Alien.getX(),Alien.getY(),Alien.getTamaño(),Alien.getTamaño(), (ImageObserver) this);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.paint(g2d);
        super.paint(g);

    }
    public void mover() throws InterruptedException{
        // movement

        if (x + xa < 0)
            xa = 1;
        if (x + xa > 400)
            xa = -1;
        if (y + ya < 0)
            ya = 1;
        if (y + ya >  610)
            ya = -1;
        x = x + xa;
        y = y + ya;
    }


    public static boolean colision()
    {
        if(Bala.getX()==Alien.getX() && Bala.getY()==Alien.getY())
        {
            muerto=true;
            return true;
        }
        else
        {
            muerto=false;
        }


        if(Nave.getBounds().intersects(Alien.getBounds()))
        {
            numero = numero -1;
            System.out.println("COLISION CON LA NAVE"+"QUEDAN: "+ numero+" VIDAS");
            Nave.x = 200;
            Alien.x = (int) (Math.random() * 400-Alien.getX()) + 1;
            Alien.y = (int) (Math.random() * 400-Alien.getX()) + 100;
            return true;
        }
        else
            return false;

    }

    public int getDy() {
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

    public static Rectangle getBounds()
    {
        return new Rectangle(x, y, WIDTH-20, HEIGHT-20);
    }
}
