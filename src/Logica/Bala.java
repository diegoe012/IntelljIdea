package Logica;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.yield;


public class Bala implements Runnable{

    private static String bala;
    private static int x;
    private static int tamañox;
    private static int tamañoy;
    private static int y;
    private static int dx;
    private static int dy;
    private static Image ImagenBala;
    private Graphics g;
    private Thread h1;

    public Bala()  {
        x = Nave.getX()+4;
        y = Nave.getY()-11;
        tamañoy =  20;
        tamañox = 5;
        bala = "../Recursos/Bala/laserRed01.png";
        ImageIcon imgBala = new ImageIcon(this.getClass().getResource(bala));
        ImagenBala =imgBala.getImage();
        h1 = new Thread(this);
        h1.start();
    }



    public static int getX() {
        return x;
    }
    public static int getTamañox() {
        return tamañox;
    }
    public static int getTamañoy() {
        return tamañoy;
    }
    public static int getY() {
        return y;
    }
    public static int getDx() {
        return dx;
    }
    public static int getDy() {
        return dy;
    }
    public static Image getImagenBala() {
        return ImagenBala;
    }

    public void mover(){
        y = y-100;
        System.out.println(y);
    }
    @Override
    public void run() {
        while(y<0){
            mover();
            System.out.println(y);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            yield();
        }
    }

   /* public void draw( ){
        g.drawImage(ImagenBala,x,y,tamañox,tamañoy,null);
        f1.setOpaque(false);
        f1.paint(g);
    }*/
}
